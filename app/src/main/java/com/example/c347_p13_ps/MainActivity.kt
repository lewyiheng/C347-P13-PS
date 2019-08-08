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
            println("This is the operator: " + notDigits)
            println("Second number: " + num2.toString())

        }
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button
        var btnValue = btnSelected.text
        textView.append(btnValue)
    }
}

