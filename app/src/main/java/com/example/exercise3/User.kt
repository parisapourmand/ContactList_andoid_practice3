package com.example.exercise3

import android.graphics.drawable.Drawable

//class or data class

data class User(
        var username : String,
        var email : String,
        var userImage : Drawable?
        ) {


}
