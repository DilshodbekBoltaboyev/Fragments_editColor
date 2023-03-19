package com.example.fragments_editcolor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments_editcolor.databinding.ActivityMainBinding
import com.example.fragments_editcolor.databinding.FragmentBlank2Binding
import com.example.fragments_editcolor.databinding.FragmentBlankBinding
import com.example.fragments_editcolor.models.Color
import android.graphics.Color as Color1


class BlankFragment : Fragment() {

    private val binding by lazy { FragmentBlankBinding.inflate(layoutInflater) }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.editColor.setOnClickListener{
            val blankFragment2=BlankFragment2()
            val manager=parentFragmentManager
            val transaction=manager.beginTransaction()

            transaction.replace(R.id.my_container, blankFragment2).addToBackStack(blankFragment2.toString()).commit()
        }
        binding.second.background = Color.color
        return binding.root
    }
}