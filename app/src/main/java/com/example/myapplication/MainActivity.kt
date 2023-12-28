package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.myapplication.MVVM.View
import com.example.myapplication.MVVM.ViewModel
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {
    private lateinit var binding: ActivityMainBinding
    private val viewModel = ViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModel()
        viewModel.attachView(this)

        with(binding) {
            btnCount.setOnClickListener {
                viewModel.incriment()
            }

            btnDec.setOnClickListener {
                viewModel.decriment()
            }
        }
    }

    override fun incAge(age: Int) {
        binding.tvCount.text = age.toString()
    }

    override fun isVisibl(vis: Boolean) {
        binding.tvCount.isVisible = vis
    }
}