package com.example.secretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.secretmessage.R
import com.example.secretmessage.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private var _binding : FragmentWelcomeBinding ?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // fragment class doesn't have findViewById(), so you cannot directly use it
        // but you can call it on fragments root view
//        val rootView = inflater.inflate(R.layout.fragment_welcome, container, false)
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val rootView = binding.root
//        val startButton = rootView.findViewById<Button>(R.id.bt_start)

        binding.btStart.setOnClickListener {
            // get a reference of navController
            val navController = rootView.findNavController()
            navController.navigate(R.id.action_welcomeFragment_to_messageFragment)
        }

        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}