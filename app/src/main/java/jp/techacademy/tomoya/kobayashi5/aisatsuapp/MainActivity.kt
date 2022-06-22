package jp.techacademy.tomoya.kobayashi5.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), View.OnClickListener, Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()

        }
    }


        fun showTimePickerDialog() {
            val timePickerDialog = TimePickerDialog(
                    this,
                    TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                        Log.d("UI_PARTS", "$hour:$minute")
                    },
                    13, 0, true)

              if (hour >= 2 && minute >= 0) {
                  textView.text = "おはよう"
               } else if (hour >= 10 && minute >= 0) {
                  textView.text = "こんにちは"
               } else if (hour >= 18 && minute >= 0) {
                  textView.text = "こんばんは"
                }
        }


