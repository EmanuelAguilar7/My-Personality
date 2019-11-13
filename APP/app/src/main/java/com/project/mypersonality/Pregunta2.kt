package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pregunta1.*
import kotlinx.android.synthetic.main.activity_pregunta2.*

class Pregunta2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta2)

        val aux = mostrar_personalidad()

        btn2A.setOnClickListener {
            aux.sumaA()
            val intent: Intent = Intent(this, Pregunta3::class.java)
            startActivity(intent)
        }

        btn2B.setOnClickListener {
            aux.sumaB()
            val intent: Intent = Intent(this, Pregunta3::class.java)
            startActivity(intent)
        }

        btn2C.setOnClickListener {
            aux.sumaC()
            val intent: Intent = Intent(this, Pregunta3::class.java)
            startActivity(intent)
        }
    }
}
