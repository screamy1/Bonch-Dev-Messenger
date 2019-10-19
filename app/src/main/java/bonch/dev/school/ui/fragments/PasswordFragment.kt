package bonch.dev.school.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import androidx.fragment.app.DialogFragment
import bonch.dev.school.R
import bonch.dev.school.ui.activities.MainAppActivity


class PasswordFragment : DialogFragment() {

    private lateinit var oldPasswordEditText: EditText
    private lateinit var newPasswordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var changePasswordButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*oldPasswordEditText = view!!.findViewById(R.id.old_password_edit_text)
        newPasswordEditText = view!!.findViewById(R.id.new_password_edit_text)
        confirmPasswordEditText = view!!.findViewById(R.id.confirm_password_edit_text)
        changePasswordButton = view!!.findViewById(R.id.change_password_button)*/

        return inflater.inflate(R.layout.fragment_password, container, false)
    }


}
