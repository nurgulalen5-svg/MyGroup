package com.example.mygroup

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag, "onCreate")

        val etName = findViewById<EditText>(R.id.etName)
        val btnOpenStudents = findViewById<Button>(R.id.btnOpenStudents)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnOpenStudents.setOnClickListener {
            val name = etName.text.toString()

            if (name.isEmpty()) {
                Log.w(tag, "Имя не введено")
                etName.error = "Введите имя"
            } else {
                Log.i(tag, "Открыт список студентов")

                val intent = Intent(this, StudentListActivity::class.java)
                intent.putExtra("USER_NAME", name)
                startActivity(intent)
            }
        }

        btnClear.setOnClickListener {
            etName.text.clear()
            Log.i(tag, "Поле имени очищено")
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