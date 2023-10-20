package edu.uw.ischool.msk812.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var numClicks: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushButton: Button = findViewById(R.id.button)

        pushButton.setOnClickListener {
            numClicks += 1
            if (numClicks == 1) {
                pushButton.text = "You have pushed me $numClicks time!"
            } else {
                pushButton.text = "You have pushed me $numClicks times!"
            }
        }
    }
}