package com.example.madproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class AdminPanel : AppCompatActivity() {

    private lateinit var itemName: EditText
    private lateinit var itemPrice: EditText
    private lateinit var itemimage: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_panel)
    }
}