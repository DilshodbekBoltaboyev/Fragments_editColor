package com.example.fragments_editcolor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments_editcolor.databinding.FragmentBlank2Binding
import com.example.fragments_editcolor.models.Color

class BlankFragment2 : Fragment() {

    private val binding by lazy { FragmentBlank2Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val blankFragment = BlankFragment()
        binding.apply {

            binding.apply {
                view1.setOnClickListener {
                    Color.color = view1.background
                }
                view2.setOnClickListener {
                    Color.color = view2.background
                }
                view3.setOnClickListener {
                    Color.color = view3.background
                }
                view4.setOnClickListener {
                    Color.color = view4.background
                }
                view5.setOnClickListener {
                    Color.color = view5.background
                }
                view6.setOnClickListener {
                    Color.color = view6.background
                }
                view7.setOnClickListener {
                    Color.color = view7.background
                }
                view8.setOnClickListener {
                    Color.color = view8.background
                }
                view9.setOnClickListener {
                    Color.color = view9.background
                }
                view10.setOnClickListener {
                    Color.color = view10.background
                }
                view11.setOnClickListener {
                    Color.color = view11.background
                }
                view12.setOnClickListener {
                    Color.color = view12.background
                }

                    val fragmentManager = parentFragmentManager
                    val transaction = fragmentManager.beginTransaction()
                    transaction.replace(R.id.my_container, blankFragment)
                    transaction.commit()
            }
            return binding.root
        }
    }
}
