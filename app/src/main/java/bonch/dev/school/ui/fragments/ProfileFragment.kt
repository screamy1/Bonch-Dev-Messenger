package bonch.dev.school.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import bonch.dev.school.R

class ProfileFragment : Fragment() {

    private lateinit var changePasswordButton: Button
    private lateinit var emailConfirmButton: Button
    private lateinit var signOutButton: Button
    private lateinit var nameEditText: EditText
    lateinit var passwordFragment: PasswordFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)

        changePasswordButton = view.findViewById(R.id.change_password_button)
        emailConfirmButton = view.findViewById(R.id.email_confirm_button)
        signOutButton = view.findViewById(R.id.sign_out_button)
        nameEditText = view.findViewById(R.id.name_edit_text)
        passwordFragment = PasswordFragment()

        changePasswordButton.setOnClickListener {
            passwordFragment.show(fragmentManager!!, "passwordFragment")
        }

        return view
    }
}
