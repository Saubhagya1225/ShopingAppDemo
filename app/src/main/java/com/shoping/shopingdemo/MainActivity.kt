package com.shoping.shopingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shoping.shopingdemo.util.LoadingInterface

class MainActivity : AppCompatActivity(), LoadingInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun loading(isLoading: Boolean) {
        TODO("Not yet implemented")
    }
}