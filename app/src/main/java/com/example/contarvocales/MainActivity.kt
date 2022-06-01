package com.example.contarvocales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contarvocales.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        var contadorA = 0
        var contadorE = 0
        var contadorI = 0
        var contadorO = 0
        var contadorU = 0

        b.button.setOnClickListener {
            val str = b.palabra.text.toString()
            for (i in 0..str.lastIndex)
                if (str[i] == 'a') {
                    contadorA++
                } else if (str[i] == 'e') {
                    contadorE++
                } else if (str[i] == 'i') {
                    contadorI++
                } else if (str[i] == 'o') {
                    contadorO++
                } else if (str[i] == 'u') {
                    contadorU++
                }
            b.tvResultado.text =

                "la palabra ${b.palabra.text} tiene\n $contadorA a \n $contadorE e \n $contadorI i \n $contadorO o \n $contadorU u"


        }


    }
}
