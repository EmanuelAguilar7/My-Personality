package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pregunta2.*
import kotlinx.android.synthetic.main.activity_pregunta3.*

class Pregunta3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta3)

        val aux = mostrar_personalidad()

        btn3A.setOnClickListener {
            aux.sumaA()
            val intent: Intent = Intent(this, Pregunta4::class.java)
            startActivity(intent)
        }

        btn3B.setOnClickListener {
            aux.sumaB()
            val intent: Intent = Intent(this, Pregunta4::class.java)
            startActivity(intent)
        }

        btn3C.setOnClickListener {
            aux.sumaC()
            val intent: Intent = Intent(this, Pregunta4::class.java)
            startActivity(intent)
        }

    }
}
