package com.nabilbdev.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.nabilbdev.swoosh.R
import com.nabilbdev.swoosh.model.Player
import com.nabilbdev.swoosh.utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    private var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        val womenLeague: ToggleButton = findViewById(R.id.womenBtn)
        val coedLeague: ToggleButton = findViewById(R.id.co_edBtn)
        womenLeague.isChecked = false
        coedLeague.isChecked = false

        player.league = "mens"
    }

    fun onWomenClicked(view: View) {
        val coedLeague: ToggleButton = findViewById(R.id.co_edBtn)
        val mensLeague: ToggleButton = findViewById(R.id.menBtn)
        mensLeague.isChecked = false
        coedLeague.isChecked = false

        player.league = "women"
    }

    fun onCoedClicked(view: View) {
        val womenLeague: ToggleButton = findViewById(R.id.womenBtn)
        val mensLeague: ToggleButton = findViewById(R.id.menBtn)
        womenLeague.isChecked = false
        mensLeague.isChecked = false

        player.league = "co_ed"
    }

    // same like click listen in onCreate
    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}