package com.example.countapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cnt = 0
        btnCnt.setOnClickListener {
            cnt++
            txtCnt.text = "Counted: $cnt"

        }
        bntDrp.setOnClickListener {
            cnt--
            txtCnt.text = "Counted: $cnt"
        }

    }
}