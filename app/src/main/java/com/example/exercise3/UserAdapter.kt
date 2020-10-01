package com.example.exercise3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userList: List<User>) : RecyclerView.Adapter<UserAdapter.UserItemViewHolder >(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserItemViewHolder, position: Int) {
        val user = userList[position]
        holder.txtUsername.text = user.username
        holder.txtEmail.text = user.email
        holder.imgUser.setImageDrawable(user.userImage)
    }


    class UserItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val txtUsername = itemView.findViewById<TextView>(R.id.txt_username)
        val txtEmail = itemView.findViewById<TextView>(R.id.txt_user_email)
        val imgUser = itemView.findViewById<ImageView>(R.id.img_user)
    }
}