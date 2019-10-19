package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Button
import android.widget.EditText

class SignInActivity : AppCompatActivity() {

    private lateinit var signInButton: Button
    private lateinit var signUpButton: Button
    private lateinit var emailSignInEditText: EditText
    private lateinit var passwordSignInEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.hide()
        setContentView(R.layout.activity_sign_in)

        initializeViews()
        setListeners()
    }

    private fun initializeViews() {
        signInButton = findViewById(R.id.sign_in_button)
        signUpButton = findViewById(R.id.sign_up_button)
        emailSignInEditText = findViewById(R.id.email_sign_in_edit_text)
        passwordSignInEditText = findViewById(R.id.password_sign_in_edit_text)
    }

    private fun setListeners() {
        signInButton.setOnClickListener {
            val intent = Intent(this, MainAppActivity::class.java)
            startActivity(intent)
        }
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
