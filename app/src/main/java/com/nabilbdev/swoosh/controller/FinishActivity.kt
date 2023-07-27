package com.nabilbdev.swoosh.controller


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.nabilbdev.swoosh.R
import com.nabilbdev.swoosh.utilities.EXTRA_LEAGUE
import com.nabilbdev.swoosh.utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        val searchButton = findViewById<TextView>(R.id.searchLeagueTxt)
        searchButton.text = buildString {
            append("Looking for ")
            append(league.toString())
            append(" ")
            append(skill.toString())
            append(" league near you...")
        }
    }
}