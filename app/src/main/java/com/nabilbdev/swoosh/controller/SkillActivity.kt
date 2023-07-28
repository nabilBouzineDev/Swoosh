package com.nabilbdev.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.nabilbdev.swoosh.R
import com.nabilbdev.swoosh.model.Player
import com.nabilbdev.swoosh.utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {

    lateinit var player: Player

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
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    fun onBeginnerClicked(view: View) {
        val ballerButton = findViewById<ToggleButton>(R.id.BallerBtn)
        ballerButton.isChecked = false

        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        val beginnerButton = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerButton.isChecked = false

        player.skill = "baller"
    }

    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
