package com.example.tictactoe_191rdb300

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Greeting : AppCompatActivity() {

    lateinit var startNewGame: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.greeting)

        startNewGame = findViewById(R.id.startNewGame)

        startNewGame.setOnClickListener{
            val intent1 = Intent(this,    playerName::class.java)

            startActivity(intent1)
        }
    }
}


