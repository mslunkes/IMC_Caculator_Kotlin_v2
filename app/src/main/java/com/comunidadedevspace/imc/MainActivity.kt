package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes do EditText
            //Criar uma variavel e associar o componente


        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        //Recuperar o botão calcular e o que foi digitado
        btnCalcular.setOnClickListener {
            val peso:Float = edtPeso.text.toString().toFloat()
            val altura:Float = edtAltura.text.toString().toFloat()

            val IMC = (peso/(altura*altura))
            println(IMC)

        }

    }
}