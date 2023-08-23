package com.example.lovetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.transaction
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.lovetest.databinding.ActivityMainBinding
import com.example.lovetest.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    lateinit var navContoller : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}