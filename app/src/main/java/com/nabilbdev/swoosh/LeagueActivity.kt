package com.nabilbdev.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    // same like click listen in onCreate
    fun leagueNextClicked(view: View) {
        val skillIntent = Intent(this, SkillActivity::class.java)
        startActivity(skillIntent)
    }
}