package com.example.khotijatuzzahroxiirpl2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user:String = "zahro"
        val pass:String = "220205"

        val etusername:EditText = findViewById(R.id.Username)
        val etpass: EditText = findViewById(R.id.Password)
        val btlog: Button = findViewById(R.id.button3)

        btlog.setOnClickListener(View.OnClickListener {
            if (etusername.text.toString().equals(user)&& etpass.text.toString().equals(pass)){
                val pindah = Intent(this, MainActivity2::class.java)
                startActivity(pindah)
            }
            else {
                Toast.makeText(this, "login gagal",Toast.LENGTH_SHORT).show()

            }

        })



    }
    fun register(view: View) {
        val pindah = Intent(this@MainActivity2, MainActivity::class.java)
        startActivity(pindah) }
}