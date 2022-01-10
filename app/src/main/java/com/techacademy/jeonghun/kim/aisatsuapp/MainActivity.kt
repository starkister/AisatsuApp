package com.techacademy.jeonghun.kim.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI-PARTS", "$hour:$minute")
                when (hour){
                    in 2..9 ->  textView1.text = "おはよう"
                    in 10..17 ->  textView1.text = "こんにちは"
                    else -> textView1.text = "こんばんは"
                }
            },
            13, 0, true)
        timePickerDialog.show();
    }

}