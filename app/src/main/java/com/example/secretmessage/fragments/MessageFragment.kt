package com.example.secretmessage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.secretmessage.R
/* from this fragment I can navigate to another fragment, "Safe Args" plugin will generate a
Directions class called "MessageFragmentDirections" with method actionMessageFragmentToEncryptFragment()
this method takes in my "message" and returns an action that can be then fed to navController.navigate()
*/
class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton = rootView.findViewById<Button>(R.id.bt_next)
        nextButton.setOnClickListener {
            /* before Safe Args plugin was used ->
            val navController = rootView.findNavController()
            navController.navigate(R.id.action_messageFragment_to_encryptFragment)
             */

            val etMessage = rootView.findViewById<EditText>(R.id.et_message)
            val message = etMessage.text.toString()

            if(message.isEmpty()) {
                Toast.makeText(activity, "empty message body", Toast.LENGTH_SHORT).show()
            } else {
                // create action using Directions class' function, and send your message
                val action =
                    MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
                val navController = rootView.findNavController()
                navController.navigate(action)
            }

            etMessage.text.clear()
        }
        return rootView
    }
}