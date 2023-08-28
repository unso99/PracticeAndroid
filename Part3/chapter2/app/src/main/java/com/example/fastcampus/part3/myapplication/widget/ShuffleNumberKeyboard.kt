package com.example.fastcampus.part3.myapplication.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.GridLayout
import android.widget.TextView
import androidx.core.view.children
import com.example.fastcampus.part3.myapplication.databinding.WidgetShuffleNumberKeyboardBinding
import kotlin.random.Random

class ShuffleNumberKeyboard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : GridLayout(context, attrs, defStyleAttr), View.OnClickListener {

    //실질적으로 사용하는 부분으로 private
    private var _binding: WidgetShuffleNumberKeyboardBinding? = null

    //가져오는 부분은 private get메소드만 활용해서가져오면됨
    private val binding get() = _binding!!

    private var listener : KeyPadListener? = null

    //처음뷰가 띄워졌을 때
    init {
        _binding =
            WidgetShuffleNumberKeyboardBinding.inflate(LayoutInflater.from(context), this, true)
        binding.view = this
        binding.clickListener = this
        //처음 뷰가 띄워질때 셔플해줌
        shuffle()
    }

    //뷰가 끊어질때 binding 참조 끊어주기
    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _binding = null
    }

    fun shuffle() {
        val keyNumberArray = ArrayList<String>()
        for (i in 0..9) {
            keyNumberArray.add(i.toString())
        }

        //gridLayout의 children을 돌리게되면 각각의 숫자패드가 나오게됨
        binding.gridLayout.children.forEach { view ->
            if (view is TextView && view.tag != null) {
                val randIndex = Random.nextInt(keyNumberArray.size)
                view.text = keyNumberArray[randIndex]
                keyNumberArray.removeAt(randIndex)
            }
        }
    }

    fun setKeyPadListener (keyPadListener: KeyPadListener) {
        this.listener = keyPadListener
    }

    fun onClickDelete(){
        listener?.onClickDelete()
    }

    fun onClickDone(){
        listener?.onClickDone()
    }

    //외부에서 키보드를 불러왔을 때 interface를 통해 정의된 메소드를 호출할 수 있도록
    interface KeyPadListener {
        fun onClickNum(num : String)
        fun onClickDelete()
        fun onClickDone()
    }

    override fun onClick(view: View) {
        if(view is TextView && view.tag != null){
            //숫자로 생각한다는 말
            listener?.onClickNum(view.text.toString())
        }
    }


}