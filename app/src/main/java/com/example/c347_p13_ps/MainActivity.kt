package com.example.c347_p13_ps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener {
            textView.text = ""
        }


        btnEquals.setOnClickListener {
            var text = textView.text
            val (digits, notDigits) = text.partition { it.isDigit() }

            var add = "+"
            var sub = "-"
            var mul = "*"
            var div = "/"

            val numbers = text.split(add, sub, mul, div)

            var num1 = numbers[0].toDouble()
            var num2 = numbers[1].toDouble()
            Log.d("num1", num1.toString())
            Log.d("num2", num2.toString())

            //var digit = notDigits.toString().equals("+")

            if (notDigits.toString().equals("+") === true) {
                var answer = num1 + num2
                textView.text = answer.toString()
                println("This is the answer: " + answer)
            } else if (notDigits.toString().equals("*") === true) {
                var answer = num1 * num2
                textView.text = answer.toString()
            } else if (notDigits.toString().equals("/") === true) {
                var answer = num1 / num2
                textView.text = answer.toString()
            } else if (notDigits.toString().equals("-") === true) {
                var answer = num1 - num2
                textView.text = answer.toString()
            }
            println("Array of Numbers: " + numbers)
            println("First number: " + num1.toString())
            println("Second number: " + num2.toString())
            println("This is the operator: " + notDigits)
        }
    }

    fun btnOnClick(view: View) {

        var number1 = 0
        var number2 = 0
        var operation = ""
        val btnSelected = view as Button
        var btnValue = btnSelected.text
        textView.append(btnValue)

        when (btnSelected.id) {
            btn1.id -> number1 = 1
            btn2.id -> number1 = 2
            btn3.id -> number1 = 3
            btn4.id -> number1 = 4
            btn5.id -> number1 = 5
            btn6.id -> number1 = 6
            btn7.id -> number1 = 7
            btn8.id -> number1 = 8
            btn9.id -> number1 = 9
            btn0.id -> number1 = 0
            btnAdd.id -> operation = "+"
            btnSub.id -> operation = "-"
            btnDiv.id -> operation = "/"
            btnMultiply.id -> operation = "*"
            btnDec.id -> operation = "."

        }


    }

}

