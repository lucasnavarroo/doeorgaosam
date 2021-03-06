package com.lucasnav.doeorgaosam.modules.post.repository

import com.lucasnav.doeorgaosam.modules.post.networking.PostsNetworking
import com.lucasnav.doeorgaosam.modules.post.model.RequestError
import com.lucasnav.doeorgaosam.modules.post.model.Post

class PostsRepository(
    private val postsNetworking: PostsNetworking
) {
    fun getPosts(
        onSuccess: (posts: List<Post>) -> Unit,
        onError: (error: RequestError) -> Unit
    ) {
        postsNetworking.getPostsFromApi(
            onSuccess = {
                onSuccess(it)
            },
            onError = {
                onError(it)
            }
        )
    }
}