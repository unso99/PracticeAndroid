package com.example.fastcampus.chapter10.ui.article

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import com.example.fastcampus.chapter10.R
import com.example.fastcampus.chapter10.data.ArticleModel
import com.example.fastcampus.chapter10.databinding.FragmentWriteBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.google.firestore.v1.Write
import java.util.UUID

class WriteArticleFragment : Fragment(R.layout.fragment_write) {
    private lateinit var binding : FragmentWriteBinding
    private lateinit var viewModel: WriteArticleViewModel
    private val pickMedia = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){uri ->
        if (uri != null){
            viewModel.updateSelectedUri(uri)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWriteBinding.bind(view)

        viewModel = ViewModelProvider(requireActivity()).get<WriteArticleViewModel>()

        setupViewModel()

        if(viewModel.selectedUri.value == null){
            startPicker()
        }
        setupPhotoImageView()
        setupDeleteButton()
        setupSubmitButton(view)
        setupBackButton()

    }

    private fun setupViewModel() {
        viewModel.selectedUri.observe(viewLifecycleOwner) {
            binding.photoImageView.setImageURI(it)
            if (it != null) {
                binding.addButton.isVisible = false
                binding.deleteButton.isVisible = true
            } else {
                binding.deleteButton.isVisible = false
                binding.addButton.isVisible = true
            }
        }
    }

    private fun setupDeleteButton() {
        binding.deleteButton.setOnClickListener {
            viewModel.updateSelectedUri(null)

        }
    }

    private fun setupPhotoImageView() {
        binding.photoImageView.setOnClickListener {
            if (viewModel.selectedUri.value == null) {
                startPicker()
            }
        }
    }

    private fun setupSubmitButton(view: View) {
        binding.submitButton.setOnClickListener {
            showProgress()
            if (viewModel.selectedUri.value != null) {
                val photoUri = viewModel.selectedUri.value ?: return@setOnClickListener
                uploadImage(photoUri,
                    successHandler = {
                        //todo firestroe에 데이터 업로드
                        uploadArticle(it, binding.descriptionEditText.text.toString())
                    },
                    errorHandler = {
                        Snackbar.make(view, "이미지 업로드에 실패했습니다.", Snackbar.LENGTH_SHORT).show()
                        hideProgress()
                    })

            } else {
                Snackbar.make(view, "이미지가 선택되지 않았습니다.", Snackbar.LENGTH_SHORT).show()
                hideProgress()
            }
        }
    }

    private fun setupBackButton() {
        binding.backButton.setOnClickListener {
            findNavController().navigate(WriteArticleFragmentDirections.actionBack())
        }
    }

    private fun startPicker(){
        pickMedia.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
    }

    private fun showProgress(){
        binding.progressBarLayout.isVisible = true
    }

    private fun hideProgress(){
        binding.progressBarLayout.isVisible = false
    }

    private fun uploadImage(
        uri : Uri,
        successHandler: (String) -> Unit,
        errorHandler : (Throwable?) -> Unit
    ){
        val fileName = "${UUID.randomUUID()}.png"
        Firebase.storage.reference.child("articles/photo").child(fileName)
            .putFile(uri)
            .addOnCompleteListener {task ->
                if (task.isSuccessful){
                    Firebase.storage.reference.child("articles/photo").child(fileName)
                        .downloadUrl
                        .addOnSuccessListener {
                            successHandler(it.toString())
                        }.addOnFailureListener {
                            errorHandler(it)
                        }
                }else {
                    errorHandler(task.exception)
                }
            }
    }

    private fun uploadArticle(photoUrl: String, description: String) {
        val articleId = UUID.randomUUID().toString()
        val articleModel = ArticleModel(
            articleId = articleId,
            createdAt = System.currentTimeMillis(),
            description = description,
            imageUrl = photoUrl
        )

        Firebase.firestore.collection("articles").document(articleId)
            .set(articleModel)
            .addOnSuccessListener {
                findNavController().navigate(WriteArticleFragmentDirections.actionWriteArticleFragmentToHomeFragment())
                hideProgress()
            }
            .addOnFailureListener {
                it.printStackTrace()
                view?.let { Snackbar.make(it,"글 작성에 실패했습니다.",Snackbar.LENGTH_SHORT).show() }
                hideProgress()
            }


    }
}