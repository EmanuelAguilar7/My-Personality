package com.project.mypersonality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast;

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIr.setOnClickListener {
            val intent:Intent = Intent(this, Pregunta1::class.java)
            startActivity(intent)
        }

        btnacercade.setOnClickListener {
            Toast.makeText(this,"Creado Por: Emanuel Aguilar",Toast.LENGTH_LONG).show()
        }

    }


}
