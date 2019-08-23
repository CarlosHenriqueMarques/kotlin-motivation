package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motivation.util.MotivationConstant
import com.example.motivation.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val mSecurity: SecurityPreferences = SecurityPreferences(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        buttonSave.setOnClickListener {
            handleSave()
        }
    }

    private fun handleSave() {
        val name : String = editName.text.toString()
        mSecurity.storeString(MotivationConstant.KEY.PERSON_NAME, name)
    }
}