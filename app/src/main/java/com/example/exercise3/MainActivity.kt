package com.example.exercise3

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcUser : RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
//        actionBar?.title = "List"

//        Todo 1 find recycler view
        rcUser = findViewById(R.id.rc_users)
//       Todo 2 create user data
        val users = createUserList()
//       Todo 3 create adapter
        val adapter = UserAdapter(users)
//       Todo 4 set layout manager
        rcUser.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
//       Todo 5 set adapter
        rcUser.adapter = adapter




    }

    private fun createUserList() : List<User>{

        val userList = mutableListOf<User>()

        val u1 = User("Parisa", "p@gmail.com", ContextCompat.getDrawable(this, R.drawable.pourmand))
        val u2 = User("Jack", "j@gmail.com", ContextCompat.getDrawable(this, R.drawable.mashoodi))
        val u3 = User("Ali", "a@gmail.com", ContextCompat.getDrawable(this, R.drawable.alami))
        val u4 = User("Sara", "s@gmail.com", ContextCompat.getDrawable(this, R.drawable.rasouli))

        userList.add(u1)
        userList.add(u2)
        userList.add(u3)
        userList.add(u4)

        return userList
    }
}