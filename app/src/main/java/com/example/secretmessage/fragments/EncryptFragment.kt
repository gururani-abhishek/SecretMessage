package com.example.secretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.secretmessage.R
import com.example.secretmessage.databinding.FragmentEncryptBinding

/* Because this class can accept argument, "Safe Args" plugin will generate a Args class for this,
args class will be called, EncryptFragmentsArgs, which has a method fromBundle() that returns the
message argument
 */
class EncryptFragment : Fragment() {
    private var _binding : FragmentEncryptBinding ?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        val rootView = inflater.inflate(R.layout.fragment_encrypt, container, false)
        _binding = FragmentEncryptBinding.inflate(inflater, container, false)
        val rootView = binding.root
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        val tvEncryptedMessage = binding.tvEncryptedMessage
        tvEncryptedMessage.text = message.reversed()
        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}