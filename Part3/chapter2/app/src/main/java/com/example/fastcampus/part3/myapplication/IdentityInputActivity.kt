package com.example.fastcampus.part3.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import com.example.fastcampus.part3.myapplication.databinding.ActivityIdentityInputBinding
import com.example.fastcampus.part3.myapplication.util.ViewUtil.hideKeyboard
import com.example.fastcampus.part3.myapplication.util.ViewUtil.setOnEditorActionListener
import com.example.fastcampus.part3.myapplication.util.ViewUtil.showKeyboard
import com.example.fastcampus.part3.myapplication.util.ViewUtil.showKeyboardDelay

class IdentityInputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIdentityInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIdentityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.view = this
        initView()
        binding.nameEdit.showKeyboardDelay()

    }

    private fun initView() {
        with(binding) {
            nameEdit.setOnEditorActionListener(EditorInfo.IME_ACTION_NEXT) {
                if(validName()){
                    nameLayout.error = null
                    if(phoneLayout.isVisible){
                        confirmButton.isVisible = true
                    }else {
                        birthDayLayout.isVisible = true
                        birthDayEdit.showKeyboard()
                    }
                }else {
                    confirmButton.isVisible = false
                    nameLayout.error = "1자이상의 한글을 입력해주세요."
                }

            }

            birthDayEdit.doAfterTextChanged {
                if (birthDayEdit.length() > 7) {
                    if(validBirthDay()) {
                        birthDayLayout.error = null
                        if(phoneLayout.isVisible){
                            confirmButton.isVisible = true
                        }else {
                            genderLayout.isVisible = true
                            birthDayEdit.hideKeyboard()
                        }
                    }else {
                        confirmButton.isVisible = false
                        birthDayLayout.error = "생년월일 형식이 다릅니다."
                    }

                }
            }

            birthDayEdit.setOnEditorActionListener(EditorInfo.IME_ACTION_DONE){
                val isValid = validBirthDay() && birthDayEdit.length() > 7
                if(isValid){
                    confirmButton.isVisible = phoneLayout.isVisible
                    birthDayLayout.error = null
                }else {
                    birthDayLayout.error = "생년월일 형식이 다릅니다."
                }
                birthDayEdit.hideKeyboard()
            }

            genderChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                if (!telecomLayout.isVisible) {
                    telecomLayout.isVisible = true
                }
            }

            telecomChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
                if (!phoneLayout.isVisible) {
                    phoneLayout.isVisible = true
                    phoneEdit.showKeyboard()
                }
            }

            phoneEdit.doAfterTextChanged {
                if (phoneEdit.length() > 10) {
                    if (validPhone()) {
                        phoneLayout.error = null
                        confirmButton.isVisible = true
                        phoneEdit.hideKeyboard()
                    } else {
                        confirmButton.isVisible = false
                        binding.phoneLayout.error = "전화번호 형식이 다릅니다"
                    }

                }
            }

            phoneEdit.setOnEditorActionListener(EditorInfo.IME_ACTION_DONE) {
                confirmButton.isVisible = phoneEdit.length() > 9 && validPhone()
                phoneEdit.hideKeyboard()
            }
        }
    }

    fun onClickDone() {
        if (!validName()) {
            binding.nameLayout.error = "1자이상의 한글을 입력해주세요."
            return
        }

        if (!validBirthDay()) {
            binding.birthDayLayout.error = "생년월일 형식이 다릅니다."
            return
        }

        if (!validPhone()) {
            binding.phoneLayout.error = "전화번호 형식이 다릅니다"
            return
        }

        startActivity(Intent(this,VerifyOtpActivity::class.java))
    }

    private fun validName() = !binding.nameEdit.text.isNullOrBlank()
            && REGEX_NAME.toRegex().matches(binding.nameEdit.text!!)

    private fun validBirthDay() = !binding.birthDayEdit.text.isNullOrBlank()
            && REGEX_BIRTHDAY.toRegex().matches(binding.birthDayEdit.text!!)

    private fun validPhone() = !binding.phoneEdit.text.isNullOrBlank()
            && REGEX_PHONE.toRegex().matches(binding.phoneEdit.text!!)


    companion object {
        private const val REGEX_NAME = "^[가-힣]{2,}\$"
        private const val REGEX_BIRTHDAY = "^(19|20)[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])"
        private const val REGEX_PHONE = "^01([016789])([0-9]{3,4})([0-9]{4})\$"
    }
}