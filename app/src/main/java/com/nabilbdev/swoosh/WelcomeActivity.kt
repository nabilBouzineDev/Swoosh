package com.nabilbdev.swoosh

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val getStarted = findViewById<Button>(R.id.startBtn)
        getStarted.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}