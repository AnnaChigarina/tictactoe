package com.example.tictactoe_191rdb300


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*
import kotlin.collections.ArrayList
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.mode.*
import kotlinx.android.synthetic.main.name.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


    fun buClick(view: View){
        val buSelected = view as Button
        var cellID = 0
        when (buSelected.id){
            R.id.bu1-> cellID = 1
            R.id.bu2-> cellID = 2
            R.id.bu3-> cellID = 3
            R.id.bu4-> cellID = 4
            R.id.bu5-> cellID = 5
            R.id.bu6-> cellID = 6
            R.id.bu7-> cellID = 7
            R.id.bu8-> cellID = 8
            R.id.bu9-> cellID = 9

        }
//Toast.makeText(this, "Cell ID: "+cellID, Toast.LENGTH_LONG).show()
       playGame (cellID, buSelected)

    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
 var activePlayer = 1

    private fun playGame(cellID: Int, buSelected: Button) {


        if (activePlayer == 1) {

            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.GREEN)

            player1.add(cellID)
            activePlayer = 2


        } else {
            buSelected.text = "O"
            buSelected.setBackgroundColor(Color.BLUE)

            player2.add(cellID)
            activePlayer = 1
        }
        buSelected.isEnabled = false

        checkWinner()

    }

    private fun checkWinner() {
       /*
        lateinit var text1: EditText
        lateinit var text2: EditText

        text1 = findViewById(R.id.player1choise) as? EditText as EditText
        val pn1 = text1.editableText.toString()

        text2 = findViewById(R.id.player2choise) as? EditText as EditText
        val pn2 = text2.editableText.toString()
*/

        var winner = -1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winner = 2
        }

        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winner = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winner = 2
        }

        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2
        }

        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winner = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2
        }

        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2
        }

        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2
        }

        if (winner != -1){
            if(winner == 1) {
                Toast.makeText(this, /*pn1 +*/"Player 1 won the game!", Toast.LENGTH_LONG).show()
            }else{

                    Toast.makeText(this, /*pn1+*/ "Player 2 won the game!", Toast.LENGTH_LONG).show()
            }
        }
    }


}