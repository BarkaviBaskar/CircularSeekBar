package com.example.circularseekbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.tankery.lib.circularseekbar.CircularSeekBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val circularSeekBar = findViewById<CircularSeekBar>(R.id.circularSeekBar)

        val thumbView = circularSeekBar
        val rotationAngle = 180f
        thumbView.rotation = rotationAngle

        val newProgress = 90
        circularSeekBar.progress = newProgress.toFloat()

        circularSeekBar.setOnSeekBarChangeListener(object : CircularSeekBar.OnCircularSeekBarChangeListener {
            override fun onProgressChanged(
                circularSeekBar: CircularSeekBar?,
                progress: Float,
                fromUser: Boolean
            ) {

            }

            override fun onStopTrackingTouch(seekBar: CircularSeekBar?) {

            }
            override fun onStartTrackingTouch(seekBar: CircularSeekBar?) {

            }

        })
    }


}










