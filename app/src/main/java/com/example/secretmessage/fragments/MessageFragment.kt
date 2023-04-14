package com.example.secretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.secretmessage.R

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = rootView.findViewById<Button>(R.id.bt_next)
        nextButton.setOnClickListener {
            val navController = rootView.findNavController()
            navController.navigate(R.id.action_messageFragment_to_encryptFragment)
        }
        return rootView
    }
}