package com.lucasnav.doeorgaosam.modules.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lucasnav.doeorgaosam.R
import com.lucasnav.doeorgaosam.modules.model.Post
import com.lucasnav.doeorgaosam.modules.view.PostViewHolder

class PostsAdapter() : RecyclerView.Adapter<PostViewHolder>() {

    private var posts: List<Post> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)
        return PostViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

    }

    fun update(posts: List<Post>) {
        this.posts = posts
        notifyDataSetChanged()
    }
}