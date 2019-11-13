package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pregunta2.*
import kotlinx.android.synthetic.main.activity_pregunta4.*

class Pregunta4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta4)

        val aux = mostrar_personalidad()

        btn4A.setOnClickListener {
            aux.sumaA()
            val intent: Intent = Intent(this, Pregunta5::class.java)
            startActivity(intent)
        }

        btn4B.setOnClickListener {
            aux.sumaB()
            val intent: Intent = Intent(this, Pregunta5::class.java)
            startActivity(intent)
        }

        btn4C.setOnClickListener {
            aux.sumaC()
            val intent: Intent = Intent(this, Pregunta5::class.java)
            startActivity(intent)
        }

    }
}
