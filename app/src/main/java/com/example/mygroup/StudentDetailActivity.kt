package com.example.mygroup

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StudentDetailActivity : AppCompatActivity() {

    private val tag = "StudentDetailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_detail)

        Log.d(tag, "onCreate")

        val studentName = intent.getStringExtra("STUDENT_NAME") ?: "Неизвестно"
        val studentGrade = intent.getIntExtra("STUDENT_GRADE", 0)

        val tvStudentName = findViewById<TextView>(R.id.tvStudentName)
        val tvSubject = findViewById<TextView>(R.id.tvSubject)
        val tvGrade = findViewById<TextView>(R.id.tvGrade)
        val btnBack = findViewById<Button>(R.id.btnBack)

        tvStudentName.text = studentName
        tvSubject.text = getString(R.string.subject_value, getString(R.string.subject_mobile))
        tvGrade.text = getString(R.string.grade_value, studentGrade)

        Log.i(tag, "Открыта карточка студента: $studentName")

        btnBack.setOnClickListener {
            Log.i(tag, "Нажата кнопка Назад")
            finish()
        }
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