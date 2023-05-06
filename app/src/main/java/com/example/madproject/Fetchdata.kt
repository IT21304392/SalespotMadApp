package com.example.madproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.madproject.R

class Fetchdata : AppCompatActivity() {

    private lateinit var itemRecyclerView: RecyclerView
    private lateinit var tvLoadingDat : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fetchdata)

        itemRecyclerView = findViewById(R.id.rvitem)
        itemRecyclerView.layoutManager = LinearLayoutManager(this)
        itemRecyclerView.setHasFixedSize(true)
        tvLoadingDat = findViewById(R.id.tvloadingData)

    }
}