package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pregunta6.*
import kotlinx.android.synthetic.main.activity_pregunta7.*

class Pregunta7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta7)

        val aux = mostrar_personalidad()

        btn7A.setOnClickListener {

            aux.sumaA()

            println(mostrar_personalidad().op_A)

            if (aux.op_A > aux.op_B && aux.op_A > aux.op_C)
            {
                val intent: Intent = Intent(this, PersonalidadA::class.java)
                startActivity(intent)
            }
            else if (aux.op_B > aux.op_A && aux.op_B > aux.op_C)
            {
                val intent: Intent = Intent(this, PersonalidadB::class.java)
                startActivity(intent)
            }
            else if (aux.op_C > aux.op_A && aux.op_C > aux.op_B)
            {
                val intent: Intent = Intent(this, PersonalidadC::class.java)
                startActivity(intent)
            }
        }

        btn7B.setOnClickListener {

            aux.sumaB()

            if (aux.op_A > aux.op_B && aux.op_A > aux.op_C)
            {
                val intent: Intent = Intent(this, PersonalidadA::class.java)
                startActivity(intent)
            }
            else if (aux.op_B > aux.op_A && aux.op_B > aux.op_C)
            {
                val intent: Intent = Intent(this, PersonalidadB::class.java)
                startActivity(intent)
            }
            else if (aux.op_C > aux.op_A && aux.op_C > aux.op_B)
            {
                val intent: Intent = Intent(this, PersonalidadC::class.java)
                startActivity(intent)
            }

        }

        btn7C.setOnClickListener {

            aux.sumaC()

            if (aux.op_A > aux.op_B && aux.op_A > aux.op_C)
            {
                val intent: Intent = Intent(this, PersonalidadA::class.java)
                startActivity(intent)
            }
            else if (aux.op_B > aux.op_A && aux.op_B > aux.op_C)
            {
                val intent: Intent = Intent(this, PersonalidadB::class.java)
                startActivity(intent)
            }
            else if (aux.op_C > aux.op_A && aux.op_C > aux.op_B)
            {
                val intent: Intent = Intent(this, PersonalidadC::class.java)
                startActivity(intent)
            }

        }

    }
}
