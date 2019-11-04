package com.example.motivation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.motivation.R
import com.example.motivation.util.MotivationConstant
import com.example.motivation.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private lateinit var mSecurity : SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSecurity = SecurityPreferences(this)
        buttonSave.setOnClickListener {
            handleSave()
        }
    }

    private fun handleSave() {
        val name : String = editName.text.toString()

        if(name.isNullOrEmpty()){
            Toast.makeText(this,getString(R.string.informe_name), Toast.LENGTH_LONG).show()
        }else{
            mSecurity.storeString(MotivationConstant.KEY.PERSON_NAME, name)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
