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
import kotlinx.android.synthetic.main.pvc.*


class PVC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pvc)

    }


    private fun playGame(cellID: Int, buSelected: Button) {


        if (activePlayer == 1) {

            buSelected.text = "X"
            buSelected.setBackgroundColor(Color.GREEN)

            player1.add(cellID)
            activePlayer = 2
      PVC()

        } else {
            buSelected.text = "O"
            buSelected.setBackgroundColor(Color.BLUE)

            player2.add(cellID)
            activePlayer = 1
        }
        buSelected.isEnabled = false



    }





    fun buClick(view: View){
        val buSelected = view as Button
        var cellID = 0
        when (buSelected.id){
            R.id.bu10-> cellID = 10
            R.id.bu11-> cellID = 11
            R.id.bu12-> cellID = 12
            R.id.bu13-> cellID = 13
            R.id.bu14-> cellID = 14
            R.id.bu15-> cellID = 15
            R.id.bu16-> cellID = 16
            R.id.bu17-> cellID=  17
            R.id.bu18-> cellID = 18

        }

        playGame (cellID, buSelected)

    }
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1

    private fun PVC () {
            var emptyCells = ArrayList<Int>()
            for (cellID in 10..18) {
                if (!(player1.contains(cellID) || player2.contains(cellID))) {
                    emptyCells.add(cellID)
                }

            }


            val r = Random()
            val randIndex = r.nextInt(emptyCells.size - 0) +0
            val cellID = emptyCells[randIndex]

            val buSelected: Button
            when (cellID) {
                10 -> buSelected = bu10
                11 -> buSelected = bu11
                12 -> buSelected = bu12
                13 -> buSelected = bu13
                14 -> buSelected = bu14
                15 -> buSelected = bu15
                16 -> buSelected = bu16
                17 -> buSelected = bu17
                18 -> buSelected = bu18
                else -> buSelected = bu10
            }
       playGame (cellID, buSelected)
        buSelected.isEnabled = false

        checkWinner()


        }

    private fun checkWinner() {
 /*
        lateinit var text1: EditText
     lateinit var text2: EditText
        text1 = findViewById(R.id.player1choise) as EditText
        val pn1 = text1.text.toString()

        text1 = findViewById(R.id.player2choise) as EditText
        val pn2 = text2.text.toString()
*/
        var winner = -1
        if (player1.contains(10) && player1.contains(11) && player1.contains(12)) {
            winner = 1
        }
        if (player2.contains(10) && player2.contains(11) && player2.contains(12)) {
            winner = 2
        }

        if (player1.contains(13) && player1.contains(14) && player1.contains(15)) {
            winner = 1
        }
        if (player2.contains(13) && player2.contains(14) && player2.contains(15)) {
            winner = 2
        }

        if (player1.contains(16) && player1.contains(17) && player1.contains(18)) {
            winner = 1
        }
        if (player2.contains(16) && player2.contains(17) && player2.contains(18)) {
            winner = 2
        }

        if (player1.contains(10) && player1.contains(14) && player1.contains(18)) {
            winner = 1
        }
        if (player2.contains(10) && player2.contains(14) && player2.contains(18)) {
            winner = 2
        }

        if (player1.contains(12) && player1.contains(14) && player1.contains(16)) {
            winner = 1
        }
        if (player2.contains(12) && player2.contains(14) && player2.contains(16)) {
            winner = 2
        }

        if (player1.contains(10) && player1.contains(13) && player1.contains(16)) {
            winner = 1
        }
        if (player2.contains(10) && player2.contains(13) && player2.contains(16)) {
            winner = 2
        }

        if (player1.contains(11) && player1.contains(14) && player1.contains(17)) {
            winner = 1
        }
        if (player2.contains(11) && player2.contains(14) && player2.contains(17)) {
            winner = 2
        }

        if (player1.contains(12) && player1.contains(15) && player1.contains(18)) {
            winner = 1
        }
        if (player2.contains(12) && player2.contains(15) && player2.contains(18)) {
            winner = 2
        }

        if (winner != -1){
            if(winner == 1) {
                Toast.makeText(this,/* pn1+*/"Player 1 won the game!", Toast.LENGTH_LONG).show()
            }else{

                Toast.makeText(this,/*  pn2+*/"Player 2 won the game!", Toast.LENGTH_LONG).show()
            }
        }
    }


}