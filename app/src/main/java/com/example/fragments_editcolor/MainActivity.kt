package com.example.fragments_editcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blankFragment = BlankFragment()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()


        transaction.add(R.id.my_container, blankFragment).commit()
    }
}