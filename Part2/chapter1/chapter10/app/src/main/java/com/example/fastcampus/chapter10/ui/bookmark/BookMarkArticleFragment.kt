package com.example.fastcampus.chapter10.ui.bookmark

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fastcampus.chapter10.R
import com.example.fastcampus.chapter10.data.ArticleModel
import com.example.fastcampus.chapter10.databinding.FragmentBookmarkBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class BookMarkArticleFragment: Fragment(R.layout.fragment_bookmark) {
    private lateinit var binding : FragmentBookmarkBinding
    private lateinit var bookmarkAdapter : BookmarkArticleAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBookmarkBinding.bind(view)

        binding.toolbar.setupWithNavController(findNavController())

        bookmarkAdapter = BookmarkArticleAdapter {
            findNavController().navigate(
                BookMarkArticleFragmentDirections.actionBookMarkArticleFragmentToArticleFragment(
                    articleId = it.articleId.orEmpty()
                )
            )

        }

        binding.articleRecyclerView.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = bookmarkAdapter
            val uid = Firebase.auth.currentUser?.uid.orEmpty()
            Firebase.firestore.collection("bookmark")
                .document(uid).get()
                .addOnSuccessListener {
                    val list = it.get("articleIds") as List<*>

                    if(list.isNotEmpty()){
                        Firebase.firestore.collection("articles")
                            .whereIn("articleId",list)
                            .get()
                            .addOnSuccessListener {result ->
                                bookmarkAdapter.submitList(result.map { article -> article.toObject() })
                            }
                            .addOnFailureListener {e ->
                                e.printStackTrace()
                            }
                    }
                }
                .addOnFailureListener{
                    it.printStackTrace()
                }
        }
    }
}