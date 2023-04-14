package com.example.secretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.secretmessage.R
/* Because this class can accept argument, "Safe Args" plugin will generate a Args class for this,
args class will be called, EncryptFragmentsArgs, which has a method fromBundle() that returns the
message argument
 */
class EncryptFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).message
        val tvEncryptedMessage = rootView.findViewById<TextView>(R.id.tv_encrypted_message)
        tvEncryptedMessage.text = message.reversed()
        return rootView
    }
}