package com.fabiano.viewmodelexample.utils.extensions

import android.app.Activity
import android.content.Intent
import android.widget.Toast

fun Activity.toast(value: String) {
    if (value == "") return
    Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
}

fun Activity.initActivity(activity: Activity) {
    startActivity(Intent(this, activity::class.java).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
}

