package com.example.tictactoe_191rdb300

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class playerName: AppCompatActivity() {

    lateinit var set_name: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name)

        set_name = findViewById(R.id.set_name)




        set_name.setOnClickListener {
            val intent2 = Intent(this, PVPorPVC::class.java)

            startActivity(intent2)


        }
    }
}