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
private lateinit var multiplyButton: Button
private lateinit var dotButton: Button
private lateinit var fourButton: Button
private lateinit var fiveButton: Button
private lateinit var sixButton: Button
private lateinit var sevenButton: Button
private lateinit var eightButton: Button
private lateinit var nineButton: Button
private lateinit var zeroButton: Button
private lateinit var divideButton: Button


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
        multiplyButton = findViewById(R.id.multiply_button)
        dotButton = findViewById(R.id.dot_button)
        fourButton = findViewById(R.id.four_button)
        fiveButton = findViewById(R.id.five_button)
        sixButton = findViewById(R.id.six_button)
        sevenButton = findViewById(R.id.seven_button)
        eightButton = findViewById(R.id.eight_button)
        nineButton = findViewById(R.id.nine_button)
        zeroButton = findViewById(R.id.zero_button)
        divideButton = findViewById(R.id.divide_button)

        var number = answerText.text
        var score = 0f
        var plusIsClicked = false
        var isCounted = false
        var minusIsClicked = false
        var multiplyIsClicked = false
        var dotIsClicked = false
        var divideIsClicked = false
        var n = 0

       fun createNumber() {
            if(isCounted){
                answerText.text = ""
                isCounted = false
            }
            number = answerText.text
            answerText.setText("$number" + "$n")
        }

        oneButton.setOnClickListener {
            n = 1
            createNumber()
        }

        twoButton.setOnClickListener {
            n = 2
            createNumber()
        }

        threeButton.setOnClickListener {
            n = 3
            createNumber()
        }

        fourButton.setOnClickListener {
            n = 4
            createNumber()
        }

        fiveButton.setOnClickListener {
            n = 5
            createNumber()
        }

        sixButton.setOnClickListener {
            n = 6
            createNumber()
        }

        sevenButton.setOnClickListener {
            n = 7
            createNumber()
        }

        eightButton.setOnClickListener {
            n = 8
            createNumber()
        }

        nineButton.setOnClickListener {
            n = 9
            createNumber()
        }

        zeroButton.setOnClickListener {
            n = 0
            createNumber()
        }

        dotButton.setOnClickListener {
            if(answerText.text != ""){
                if(!dotIsClicked) {
                 number = answerText.text
                 answerText.setText("$number" + ".")
                 dotIsClicked = true
                }
            }
        }

        plusButton.setOnClickListener {
            if (answerText.text != "") when {
                minusIsClicked -> {
                    number = answerText.text
                    score -= number.toString().toFloat()
                    answerText.setText("")
                    minusIsClicked = false
                    plusIsClicked = true
                    dotIsClicked = false
                }
                multiplyIsClicked -> {
                    number = answerText.text
                    score *= number.toString().toFloat()
                    answerText.setText("")
                    multiplyIsClicked = false
                    plusIsClicked = true
                    dotIsClicked = false
                }
                divideIsClicked -> {
                    number = answerText.text
                    score /= number.toString().toFloat()
                    answerText.text = ""
                    divideIsClicked = false
                    plusIsClicked = true
                    dotIsClicked = false
                }
                else -> {
                    number = answerText.text
                    score += number.toString().toFloat()
                    answerText.setText("")
                    plusIsClicked = true
                    dotIsClicked = false

                }
            }
        }

        minusButton.setOnClickListener {
            if(answerText.text != "") when {
                plusIsClicked -> {
                    number = answerText.text
                    score += number.toString().toFloat()
                    answerText.setText("")
                    plusIsClicked = false
                    minusIsClicked = true
                    dotIsClicked = false
                }
                minusIsClicked -> {
                    number = answerText.text
                    score -= number.toString().toFloat()
                    answerText.setText("")
                    minusIsClicked = true
                    dotIsClicked = false
                }
                multiplyIsClicked -> {
                    number = answerText.text
                    score *= number.toString().toFloat()
                    answerText.setText("")
                    multiplyIsClicked = false
                    minusIsClicked = true
                    dotIsClicked = false
                }
                divideIsClicked -> {
                    number = answerText.text
                    score /= number.toString().toFloat()
                    answerText.text = ""
                    divideIsClicked = false
                    minusIsClicked = true
                    dotIsClicked = false
                }
                else -> {
                    number = answerText.text
                    score = number.toString().toFloat()
                    answerText.text = ""
                    minusIsClicked = true
                    dotIsClicked = false

                }
            }
        }

        multiplyButton.setOnClickListener {
            if(answerText.text != "") when {
                multiplyIsClicked -> {
                    number = answerText.text
                    score *= number.toString().toFloat()
                    answerText.text = ""
                    multiplyIsClicked = true
                    dotIsClicked = false
                }
                plusIsClicked -> {
                    number = answerText.text
                    score += number.toString().toFloat()
                    answerText.text = ""
                    plusIsClicked = false
                    multiplyIsClicked = true
                    dotIsClicked = false
                }
                minusIsClicked -> {
                    number = answerText.text
                    score -= number.toString().toFloat()
                    answerText.text = ""
                    minusIsClicked = false
                    multiplyIsClicked = true
                    dotIsClicked = false
                }
                divideIsClicked -> {
                    number = answerText.text
                    score /= number.toString().toFloat()
                    answerText.text = ""
                    divideIsClicked = false
                    multiplyIsClicked = true
                    dotIsClicked = false
                }
                else -> {
                    number = answerText.text
                    score = number.toString().toFloat()
                    answerText.text = ""
                    multiplyIsClicked = true
                    dotIsClicked = false
                }
            }
        }

        divideButton.setOnClickListener {
            if(answerText.text != "") when {
                multiplyIsClicked -> {
                    number = answerText.text
                    score *= number.toString().toFloat()
                    answerText.text = ""
                    divideIsClicked = true
                    multiplyIsClicked = false
                    dotIsClicked = false
                }
                plusIsClicked -> {
                    number = answerText.text
                    score += number.toString().toFloat()
                    answerText.text = ""
                    plusIsClicked = false
                    divideIsClicked = true
                    dotIsClicked = false
                }
                minusIsClicked -> {
                    number = answerText.text
                    score -= number.toString().toFloat()
                    answerText.text = ""
                    minusIsClicked = false
                    divideIsClicked = true
                    dotIsClicked = false
                }
                divideIsClicked -> {
                    number = answerText.text
                    score /= number.toString().toFloat()
                    answerText.text = ""
                    divideIsClicked = true
                    dotIsClicked = false
                }
                else -> {
                    number = answerText.text
                    score = number.toString().toFloat()
                    answerText.text = ""
                    divideIsClicked = true
                    dotIsClicked = false
                }
            }
        }

        equalButton.setOnClickListener {
               if(answerText.text != ""){
                when {
                    plusIsClicked -> {
                        number = answerText.text
                        score += number.toString().toFloat()
                        plusIsClicked = false
                        dotIsClicked = false
                        answerText.text = ""
                    }
                    minusIsClicked -> {
                        number = answerText.text
                        score -= number.toString().toFloat()
                        minusIsClicked = false
                        dotIsClicked = false
                        answerText.text = ""

                    }
                    multiplyIsClicked -> {
                        number = answerText.text
                        score *= number.toString().toFloat()
                        multiplyIsClicked = false
                        dotIsClicked = false
                        answerText.text = ""
                    }
                    divideIsClicked -> {
                        number = answerText.text
                        score /= number.toString().toFloat()
                        divideIsClicked = false
                        dotIsClicked = false
                        answerText.text = ""
                    }
                    else -> {
                        number = answerText.text
                        score = number.toString().toFloat()
                        dotIsClicked = false
                        answerText.text = ""
                    }
                }
               }
                var s = String.format("%.2f", score)
                answerText.text = "$s"
                number = ""
                score = 0f
                isCounted = true
                plusIsClicked = false
                minusIsClicked = false
                multiplyIsClicked = false
                divideIsClicked = false
                dotIsClicked = false

        }

        cancelButton.setOnClickListener{
            score = 0f
            number = ""
            answerText.text = ""
            isCounted = false
            plusIsClicked = false
            minusIsClicked = false
            multiplyIsClicked = false
            divideIsClicked = false
            dotIsClicked = false
        }
    }
}
