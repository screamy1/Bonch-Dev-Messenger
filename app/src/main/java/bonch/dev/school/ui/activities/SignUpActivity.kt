package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import bonch.dev.school.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var completeSignUpButton: Button
    private lateinit var emailSignUpEt: EditText
    private lateinit var loginEt: EditText
    private lateinit var passwordSignUpEt: EditText
    private lateinit var passwordConfirmEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.hide()
        setContentView(R.layout.activity_sign_up)

        initializeViews()
        setListeners()
    }

    private fun initializeViews() {
        completeSignUpButton = findViewById(R.id.complete_sign_up_button)
        emailSignUpEt = findViewById(R.id.email_sign_up_et)
        loginEt = findViewById(R.id.login_et)
        passwordSignUpEt = findViewById(R.id.password_sign_up_et)
        passwordConfirmEt = findViewById(R.id.password_confirm_et)
    }

    private fun setListeners() {
        completeSignUpButton.setOnClickListener {
            val intent = Intent(this, MainAppActivity::class.java)
            startActivity(intent)
        }
    }
}
