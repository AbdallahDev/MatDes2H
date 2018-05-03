package com.jhr.abdallahsarayrah.matdes2h

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUser.setOnFocusChangeListener { _, _ ->
            if (editTextUser.text.toString().isEmpty()) {
                textInputLayout.isErrorEnabled = true
                textInputLayout.error = "Please enter your username"
            } else textInputLayout.isErrorEnabled = false
        }

        editTextPassword.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })

        textInputLayout2.isCounterEnabled = true
        textInputLayout2.counterMaxLength = 11

        floatingActionButton.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
