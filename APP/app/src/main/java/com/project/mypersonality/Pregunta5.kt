package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pregunta2.*
import kotlinx.android.synthetic.main.activity_pregunta5.*

class Pregunta5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta5)

        val aux = mostrar_personalidad()

        btn5A.setOnClickListener {
            aux.sumaA()
            val intent: Intent = Intent(this, Pregunta6::class.java)
            startActivity(intent)
        }

        btn5B.setOnClickListener {
            aux.sumaB()
            val intent: Intent = Intent(this, Pregunta6::class.java)
            startActivity(intent)
        }

        btn5C.setOnClickListener {
            aux.sumaC()
            val intent: Intent = Intent(this, Pregunta6::class.java)
            startActivity(intent)
        }

    }
}
