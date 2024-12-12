package com.example.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSkills = findViewById<Button>(R.id.skillsBtn)
        buttonSkills.setOnClickListener {
             intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        val workButton = findViewById<Button>(R.id.workBtn)
        workButton.setOnClickListener {
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }

        val educationButton = findViewById<Button>(R.id.educationBtn)
        educationButton.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

    }
}