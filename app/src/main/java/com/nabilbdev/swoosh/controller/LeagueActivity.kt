package com.nabilbdev.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.nabilbdev.swoosh.R
import com.nabilbdev.swoosh.utilities.EXTRA_LEAGUE

class LeagueActivity : BaseActivity() {

    private var selectedLeague: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        val womenLeague: ToggleButton = findViewById(R.id.womenBtn)
        val coedLeague: ToggleButton = findViewById(R.id.co_edBtn)
        womenLeague.isChecked = false
        coedLeague.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomenClicked(view: View) {
        val coedLeague: ToggleButton = findViewById(R.id.co_edBtn)
        val mensLeague: ToggleButton = findViewById(R.id.menBtn)
        mensLeague.isChecked = false
        coedLeague.isChecked = false

        selectedLeague = "women"
    }

    fun onCoedClicked(view: View) {
        val womenLeague: ToggleButton = findViewById(R.id.womenBtn)
        val mensLeague: ToggleButton = findViewById(R.id.menBtn)
        womenLeague.isChecked = false
        mensLeague.isChecked = false

        selectedLeague = "co_ed"
    }

    // same like click listen in onCreate
    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}