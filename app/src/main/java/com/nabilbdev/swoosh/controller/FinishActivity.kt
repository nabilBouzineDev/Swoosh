package com.nabilbdev.swoosh.controller


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.nabilbdev.swoosh.R
import com.nabilbdev.swoosh.model.Player
import com.nabilbdev.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        val searchButton = findViewById<TextView>(R.id.searchLeagueTxt)
        searchButton.text = buildString {
            append("Looking for ")
            append(player?.league)
            append(" ")
            append(player?.skill)
            append(" league near you...")
        }
    }
}
