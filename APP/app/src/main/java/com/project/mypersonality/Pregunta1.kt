package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pregunta1.*

class Pregunta1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta1)

        val aux = mostrar_personalidad()

        btnA.setOnClickListener {
            aux.sumaA()
            val intent: Intent = Intent(this, Pregunta2::class.java)
            startActivity(intent)
        }

        btnB.setOnClickListener {
            aux.sumaB()
            val intent: Intent = Intent(this, Pregunta2::class.java)
            startActivity(intent)
        }

        btnC.setOnClickListener {
            aux.sumaC()
            val intent: Intent = Intent(this, Pregunta2::class.java)
            startActivity(intent)
        }
    }
}
