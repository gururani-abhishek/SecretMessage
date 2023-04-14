package com.example.secretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.secretmessage.R

class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // fragment class doesn't have findViewById(), so you cannot directly use it
        // but you can call it on fragments root view
        val rootView = inflater.inflate(R.layout.fragment_welcome, container, false)
        val startButton = rootView.findViewById<Button>(R.id.bt_start)

        startButton.setOnClickListener {
            // get a reference of navController
            val navController = rootView.findNavController()
            navController.navigate(R.id.action_welcomeFragment_to_messageFragment)
        }

        return rootView
    }
}