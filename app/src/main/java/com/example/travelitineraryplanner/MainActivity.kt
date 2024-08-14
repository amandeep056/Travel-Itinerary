package com.example.travelitineraryplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val destinationInput = findViewById<EditText>(R.id.destinationInput)
        val dateInput = findViewById<EditText>(R.id.dateInput)
        val preferencesInput = findViewById<EditText>(R.id.preferencesInput)
        val planTripButton = findViewById<Button>(R.id.planTripButton)

        planTripButton.setOnClickListener {
            val destination = destinationInput.text.toString()
            val dates = dateInput.text.toString()
            val preferences = preferencesInput.text.toString()

            val intent = Intent(this, ItineraryActivity::class.java).apply {
                putExtra("DESTINATION", destination)
                putExtra("DATES", dates)
                putExtra("PREFERENCES", preferences)
            }
            startActivity(intent)
        }
    }
}
