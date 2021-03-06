package com.lucasnav.doeorgaosam.modules.post.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lucasnav.doeorgaosam.modules.post.model.RequestError
import com.lucasnav.doeorgaosam.core.SingleLiveEvent
import com.lucasnav.doeorgaosam.modules.post.model.Post
import com.lucasnav.doeorgaosam.modules.post.repository.PostsRepository

class PostsViewModel(
    private val postsRepository: PostsRepository
) : ViewModel() {

    var posts: MutableLiveData<List<Post>> = MutableLiveData()
    var onLoadFinished = SingleLiveEvent<Void>()
    var onError = SingleLiveEvent<RequestError>()

    fun getPosts() {
        postsRepository.getPosts(
            onSuccess = {
                posts.value = it
                onLoadFinished.call()
            },
            onError = {
                onError.value = it
                onLoadFinished.call()
            })
    }
}