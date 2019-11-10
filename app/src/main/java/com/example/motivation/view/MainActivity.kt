package com.example.motivation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motivation.R
import com.example.motivation.mock.Mock
import com.example.motivation.util.MotivationConstant
import com.example.motivation.util.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mFilter : Int = MotivationConstant.PHRASE_FILTER.ALL
    private val mMock = Mock()
    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mSecurityPreferences = SecurityPreferences(this)
        loadFilter()
        handlerFilters()
        refreshPhrase()
        verifyUser()

        buttomNewPhrase.setOnClickListener {
            refreshPhrase()
        }
    }

    private fun verifyUser() {
        textUserName.text = mSecurityPreferences.getStoreString(MotivationConstant.KEY.PERSON_NAME)
    }

    private fun loadFilter() {
        image_all.setImageResource(R.drawable.ic_all_select)
    }

    private fun handlerFilters() {
        image_all.setImageResource(R.drawable.ic_all_unselect)
        image_sun.setImageResource(R.drawable.ic_sun_unselect)
        image_happy.setImageResource(R.drawable.ic_happy_unselected)

        image_all.setOnClickListener {
            mFilter = MotivationConstant.PHRASE_FILTER.ALL
            image_all.setImageResource(R.drawable.ic_all_select)
            refreshPhrase()
        }

        image_sun.setOnClickListener {
            mFilter = MotivationConstant.PHRASE_FILTER.SUN
            image_sun.setImageResource(R.drawable.ic_sun_select)
            refreshPhrase()
        }

        image_happy.setOnClickListener {
            mFilter = MotivationConstant.PHRASE_FILTER.HAPPY
            image_happy.setImageResource(R.drawable.ic_happy_selected)
            refreshPhrase()
        }
    }

    private  fun refreshPhrase(){
        textPhrase.text = mMock.getPhrase(mFilter)
    }
}
