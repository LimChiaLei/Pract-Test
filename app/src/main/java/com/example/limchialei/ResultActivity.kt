package com.example.limchialei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Retrieve the eligibility message from the Intent
        val eligibilityMessage = intent.getStringExtra("eligibility_message")

        // Display the eligibility message in a TextView or wherever you want
        val eligibilityTextView = findViewById<TextView>(R.id.resulttxt)
        eligibilityTextView.text = eligibilityMessage

    }
}