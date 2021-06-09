package com.example.dialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialog.databinding.ActivityMainBinding
import com.example.dialog.databinding.ItemDialogBinding
import com.example.dialog.extensions.createDialog

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnShowDialog.setOnClickListener {
            showDialog()
        }

    }

    private fun showDialog() {
        val dialog = Dialog(this)

        val binding = ItemDialogBinding.inflate(layoutInflater)

        dialog.createDialog()

        dialog.setContentView(binding.root)

        binding.tvNo.setOnClickListener {
            dialog.cancel()
        }

        binding.tvYes.setOnClickListener {
            finishAndRemoveTask()
        }

        dialog.show()
    }
}