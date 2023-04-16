package com.example.a5__hw_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        binding.apply {
            btn.setOnClickListener{
                tvResult.text = math().add(firstEd.text.toString(),secondEd.text.toString())
            }

        }
    }

}