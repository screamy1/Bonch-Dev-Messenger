package bonch.dev.school.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragments
import bonch.dev.school.ui.fragments.PasswordFragment
import bonch.dev.school.ui.fragments.ProfileFragment

class MainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        moveToСhatFragment()
    }

    fun moveToСhatFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_app_activity_container, ChatFragments())
            .commit()
    }

    fun moveToProfileFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_app_activity_container, ProfileFragment())
            .addToBackStack(null)
            .commit()
    }

    fun moveToPasswordFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_app_activity_container, PasswordFragment())
            .addToBackStack(null)
            .commit()
    }
}
