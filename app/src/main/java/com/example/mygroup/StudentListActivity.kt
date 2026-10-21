package com.example.mygroup

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StudentListActivity : AppCompatActivity() {

    private val tag = "StudentListActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        Log.d(tag, "onCreate")

        val userName = intent.getStringExtra("USER_NAME") ?: "пользователь"

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val btnStudent1 = findViewById<Button>(R.id.btnStudent1)
        val btnStudent2 = findViewById<Button>(R.id.btnStudent2)
        val btnStudent3 = findViewById<Button>(R.id.btnStudent3)

        tvWelcome.text = getString(R.string.welcome_text, userName)

        btnStudent1.setOnClickListener {
            openStudent("Ален Нургуль", 95)
        }

        btnStudent2.setOnClickListener {
            openStudent("Айдос Асанов", 90)
        }

        btnStudent3.setOnClickListener {
            openStudent("Диана Серикова", 88)
        }
    }

    private fun openStudent(studentName: String, grade: Int) {
        Log.i(tag, "Выбран студент: $studentName")

        val intent = Intent(this, StudentDetailActivity::class.java)
        intent.putExtra("STUDENT_NAME", studentName)
        intent.putExtra("STUDENT_GRADE", grade)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }
}