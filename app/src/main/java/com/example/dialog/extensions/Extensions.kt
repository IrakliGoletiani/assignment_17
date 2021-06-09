package com.example.dialog.extensions

import android.app.Dialog
import android.view.Window
import android.view.WindowManager

fun Dialog.createDialog(){
    window?.setBackgroundDrawableResource(android.R.color.transparent)
    window?.requestFeature(Window.FEATURE_NO_TITLE)
    val parameter = window!!.attributes
    parameter.width = WindowManager.LayoutParams.MATCH_PARENT
    parameter.height = WindowManager.LayoutParams.WRAP_CONTENT
}