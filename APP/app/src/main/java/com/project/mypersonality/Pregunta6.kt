package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pregunta2.*
import kotlinx.android.synthetic.main.activity_pregunta6.*

class Pregunta6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta6)

        val aux = mostrar_personalidad()

        btn6A.setOnClickListener {
            aux.sumaA()
            val intent: Intent = Intent(this, Pregunta7::class.java)
            startActivity(intent)
        }

        btn6B.setOnClickListener {
            aux.sumaB()
            val intent: Intent = Intent(this, Pregunta7::class.java)
            startActivity(intent)
        }

        btn6C.setOnClickListener {
            aux.sumaC()
            val intent: Intent = Intent(this, Pregunta7::class.java)
            startActivity(intent)
        }

    }
}
