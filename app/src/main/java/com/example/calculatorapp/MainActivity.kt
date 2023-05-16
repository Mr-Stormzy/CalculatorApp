package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var display_nums:TextView
    lateinit var first_EDT:EditText
    lateinit var second_EDT:EditText
    lateinit var add_btn:Button
    lateinit var mult_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_nums = findViewById(R.id.txtdisplay)
        first_EDT = findViewById(R.id.edtfirst)
        second_EDT = findViewById(R.id.edtsecond)
        add_btn = findViewById(R.id.btnadd)
        mult_btn = findViewById(R.id.btnmult)

        add_btn.setOnClickListener {
            var firstnum = first_EDT.text.toString().trim()
            var secondnum = second_EDT.text.toString().trim()
            var num1 = firstnum.toDouble()
            var num2 = secondnum.toDouble()
            var addition = num1 + num2
            var string_total = addition.toString()
            Toast.makeText(this, "Result is $string_total", Toast.LENGTH_SHORT).show()
        }
        mult_btn.setOnClickListener {
            var firstnum = first_EDT.text.toString().trim()
            var secondnum = second_EDT.text.toString().trim()
            var num3 = firstnum.toDouble()
            var num4 = secondnum.toDouble()
            var multiply = num3 * num4
            var string_mult = multiply.toString()
            Toast.makeText(this, "Result is $string_mult", Toast.LENGTH_SHORT).show()
        }
    }
}
