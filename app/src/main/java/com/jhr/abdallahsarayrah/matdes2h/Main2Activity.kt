package com.jhr.abdallahsarayrah.matdes2h

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when {
                item.itemId == R.id.item1 -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                item.itemId == R.id.item2 -> {
                    Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show()
                }
                item.itemId == R.id.item3 -> {
                    val intent = Intent(this, Main3Activity::class.java)
                    startActivity(intent)
                }
            }

            item.isChecked = true

            false
        }
    }
}
