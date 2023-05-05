package com.example.madproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {


    fun goToSecondActivity(view: View) {
        val intent = Intent(this, AdminPanel::class.java)
        startActivity(intent)
        }
    fun goThirdActivity(view: View) {
        val intent = Intent(this, itemCategory2::class.java)
        startActivity(intent)
    }fun goTofourthActivity(view: View) {
        val intent = Intent(this, itemCategory3::class.java)
        startActivity(intent)
    }
    fun goTofifthActivity(view: View) {
        val intent = Intent(this, itemCategory4::class.java)
        startActivity(intent)
    }
    fun goTosixthActivity(view: View) {
        val intent = Intent(this, itemCategory5::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val firebase : DatabaseReference = FirebaseDatabase.getInstance().getReference()
        setContentView(R.layout.activity_main)
    }
}