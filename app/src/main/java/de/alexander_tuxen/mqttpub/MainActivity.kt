package de.alexander_tuxen.mqttpub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pub_message = findViewById(R.id.pub_message) as EditText
        var pub_button = findViewById(R.id.pub_button) as Button

    }
}
