package com.nabilbdev.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.nabilbdev.swoosh.R
import com.nabilbdev.swoosh.utilities.EXTRA_LEAGUE
import com.nabilbdev.swoosh.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    private var league = ""
    private var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }

    fun onBeginnerClicked(view: View) {
        val ballerButton = findViewById<ToggleButton>(R.id.BallerBtn)
        ballerButton.isChecked = false

        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View) {
        val beginnerButton = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerButton.isChecked = false

        selectedSkill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (selectedSkill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}