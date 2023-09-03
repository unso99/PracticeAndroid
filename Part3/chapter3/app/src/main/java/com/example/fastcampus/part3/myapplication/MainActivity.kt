package com.example.fastcampus.part3.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.annotation.IdRes
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.example.fastcampus.part3.myapplication.databinding.ActivityMainBinding
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstCard.setOnClickListener(getCardClickListener(R.id.firstCardOnTop))
        binding.secondCard.setOnClickListener(getCardClickListener(R.id.secondCardOnTop))
        binding.thirdCard.setOnClickListener(getCardClickListener(R.id.thirdCardOnTop))


    }

    private fun getCardClickListener(@IdRes endState: Int) = OnClickListener {
        with(binding) {
            when (root.currentState) {
                R.id.fanOut -> {
                    root.setTransition(R.id.fanOut, R.id.firstCardOnTop)
                    root.transitionToEnd()
                    collapsedCardCompletedListener(endState)
                }

                R.id.thirdCardOnTop -> {
                    if (R.id.thirdCardOnTop == endState) {
                        openDetail(thirdCard,thirdCardTitleTextView.text)
                    } else {
                        root.setTransition(R.id.thirdCardOnTop, endState)
                        root.transitionToEnd()
                    }
                }

                R.id.secondCardOnTop -> {
                    if (R.id.secondCardOnTop == endState) {
                        openDetail(secondCard, secondCardTitleTextView.text)
                    } else {
                        root.setTransition(R.id.secondCardOnTop, endState)
                        root.transitionToEnd()
                    }
                }

                R.id.firstCardOnTop -> {
                    if (R.id.firstCardOnTop == endState) {
                        openDetail(firstCard,firstCardTitleTextView.text)
                    } else {
                        root.setTransition(R.id.firstCardOnTop, endState)
                        root.transitionToEnd()
                    }
                }
            }
        }
    }

    private fun openDetail(view: View, cardName: CharSequence) {
        view.transitionName = "card"
        val optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair(view,view.transitionName))
        DetailActivity.start(this,cardName.toString(),view.backgroundTintList,optionsCompat)

    }

    private fun collapsedCardCompletedListener(@IdRes endState: Int) {
        with(binding) {
            root.setTransitionListener(object : TransitionAdapter() {
                override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                    if (currentId == R.id.firstCardOnTop) {
                        root.setTransition(R.id.firstCardOnTop, endState)
                        root.transitionToEnd()
                    }
                    root.setTransitionListener(null)
                }
            })
        }
    }
}