package com.example.motivation.util

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences (conext : Context){

    private val sharedPreferences : SharedPreferences = conext.getSharedPreferences("motivation",Context.MODE_PRIVATE)
    
    fun storeString(key:String,value:String){
        sharedPreferences.edit().putString(key,value).apply()
    }

    fun getStoreString(key: String): String{
        return sharedPreferences.getString(key,"")
    }

}