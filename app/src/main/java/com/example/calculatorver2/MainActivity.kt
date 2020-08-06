package com.example.calculatorver2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var plusButton: Button
private lateinit var minusButton: Button
private lateinit var oneButton: Button
private lateinit var twoButton: Button
private lateinit var threeButton: Button
private lateinit var answerText: TextView
private lateinit var equalButton: Button
private lateinit var cancelButton: Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusButton = findViewById(R.id.plus_button)
        minusButton = findViewById(R.id.minus_button)
        oneButton = findViewById(R.id.one_button)
        twoButton = findViewById(R.id.two_button)
        threeButton = findViewById(R.id.three_button)
        answerText = findViewById(R.id.answer_text_view)
        equalButton = findViewById(R.id.equals_button)
        cancelButton = findViewById(R.id.cancel_button)

        var number = answerText.text
        var score = 0
        var plusIsClicked = false
        var isCounted = false
        var minusIsClicked = false

        oneButton.setOnClickListener{
            if(isCounted){
                answerText.text = ""
                isCounted = false
            }
            number = answerText.text
            answerText.setText("$number" + "1")
        }

        twoButton.setOnClickListener{
            if(isCounted){
                answerText.text = ""
                isCounted = false
            }

            number = answerText.text
            answerText.setText("$number" + "2")
        }

        threeButton.setOnClickListener{
            if(isCounted){
                answerText.text = ""
                isCounted = false
            }

            number = answerText.text
            answerText.setText("$number" + "3")
        }

        plusButton.setOnClickListener{
            number = answerText.text
            score += number.toString().toInt(10)
            answerText.setText("")
            plusIsClicked = true
        }

        minusButton.setOnClickListener{
                number = answerText.text
                score = number.toString().toInt(10)
                answerText.setText("")
                minusIsClicked = true

        }

        equalButton.setOnClickListener {
            when {
                plusIsClicked -> {
                    number = answerText.text
                    score += number.toString().toInt(10)
                    plusIsClicked = false
                }
                minusIsClicked -> {
                    number = answerText.text
                    score -= number.toString().toInt(10)
                    minusIsClicked = false
                }
                else -> {
                    number = answerText.text
                    score = number.toString().toInt(10)
                }
            }
            answerText.text = "$score"
            number = ""
            score = 0
            isCounted = true
        }
        cancelButton.setOnClickListener{
            score = 0
            number = ""
            answerText.text = ""
        }
    }
}
