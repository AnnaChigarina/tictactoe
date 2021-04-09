package com.example.tictactoe_191rdb300

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PVPorPVC : AppCompatActivity() {

    lateinit var pvp: Button
    lateinit var pvc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mode)

        pvp = findViewById(R.id.pvp)
        pvc = findViewById(R.id.pvc)




        pvp.setOnClickListener {
            val intent4 = Intent( this, MainActivity::class.java)

            startActivity(intent4)

    }

        pvc.setOnClickListener {
           val intent3 = Intent( this,PVC::class.java)

            startActivity(intent3)

        }

}
    }