package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // determines which player's turn it is
    private var turn = 'x'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button click listeners:
        // each calls the buttonPushed function while indicating which button was pushed
        sq1.setOnClickListener {
            buttonPushed(1)
        }

        sq2.setOnClickListener {
            buttonPushed(2)
        }

        sq3.setOnClickListener {
            buttonPushed(3)
        }

        sq4.setOnClickListener {
            buttonPushed(4)
        }

        sq5.setOnClickListener {
            buttonPushed(5)
        }

        sq6.setOnClickListener {
            buttonPushed(6)
        }

        sq7.setOnClickListener {
            buttonPushed(7)
        }

        sq8.setOnClickListener {
            buttonPushed(8)
        }

        sq9.setOnClickListener {
            buttonPushed(9)
        }
    }


    private fun checkWin() : Boolean {
        // checks to see if conditions for winning are met after each turn

        // rows
        if (sq1.text.first() == turn && sq2.text.first() == turn && sq3.text.first() == turn) {
            return true
        } else if (sq4.text.first() == turn && sq5.text.first() == turn && sq6.text.first() == turn) {
            return true
        } else if (sq7.text.first() == turn && sq8.text.first() == turn && sq9.text.first() == turn) {
            return true

        // columns
        } else if (sq1.text.first() == turn && sq4.text.first() == turn && sq7.text.first() == turn) {
            return true
        } else if (sq2.text.first() == turn && sq5.text.first() == turn && sq8.text.first() == turn) {
            return true
        } else if (sq3.text.first() == turn && sq6.text.first() == turn && sq9.text.first() == turn) {
            return true

        // diagonals
        } else if (sq1.text.first() == turn && sq5.text.first() == turn && sq9.text.first() == turn) {
            return true
        } else if (sq7.text.first() == turn && sq5.text.first() == turn && sq3.text.first() == turn) {
            return true

        } else {
            return false
        }
    }

    private fun buttonPushed(butID:Int) {
        // change the text on the button
        when(butID) {
            1 -> sq1.text = turn.toString()
            2 -> sq2.text = turn.toString()
            3 -> sq3.text = turn.toString()
            4 -> sq4.text = turn.toString()
            5 -> sq5.text = turn.toString()
            6 -> sq6.text = turn.toString()
            7 -> sq7.text = turn.toString()
            8 -> sq8.text = turn.toString()
            9 -> sq9.text = turn.toString()
        }
        // check if the player just won and display message
        if(checkWin()) {
            whoWon.text = "${turn.toUpperCase()} is the winner!"
        }
        // switch whose turn it is
        if (turn == 'o') {
            turn = 'x'
        } else if (turn == 'x') {
            turn = 'o'
        }
    }
}

