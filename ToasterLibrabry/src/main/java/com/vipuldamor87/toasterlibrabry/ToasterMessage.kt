package com.vipuldamor87.toasterlibrabry

import android.content.Context
import android.widget.Toast




class ToasterMessage {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}