package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.logica_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logica_main)

        btnSubmit.setOnClickListener {
            CheckAnswer()
        }
    }

    private fun CheckAnswer() {

        val answerOne = answerA.text.toString()
        val answerTwo = answerB.text.toString()
        val answerThree = answerC.text.toString()
        val answerFour = answerD.text.toString()

        if (answerOne == "T" || answerOne == "F" && answerTwo == "T" || answerTwo == "F" && answerThree == "T" || answerThree == "F" && answerFour == "T" || answerFour == "F") {
            if (answerOne == "T" && answerTwo == "F" && answerThree == "F" && answerFour == "F") {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Incorrect, Try Again!", Toast.LENGTH_SHORT).show()
                answerA.text.clear()
                answerB.text.clear()
                answerC.text.clear()
                answerD.text.clear()
            }
        }
        else {
            Toast.makeText(this, "Textfield requires an F or T", Toast.LENGTH_SHORT).show()
        }


    }

}


