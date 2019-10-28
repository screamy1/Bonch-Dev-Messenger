package bonch.dev.school.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

import bonch.dev.school.R
import bonch.dev.school.ui.activities.MainAppActivity

class ChatFragments : Fragment() {

    private lateinit var sendMessageButton: Button
    private lateinit var messageEt: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        sendMessageButton = view.findViewById(R.id.send_message_button)
        messageEt = view.findViewById(R.id.message_et)

        sendMessageButton.setOnClickListener {
            (context as MainAppActivity).moveToProfileFragment()
        }

        return view
    }
}
