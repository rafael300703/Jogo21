package com.example.a21jogo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carta1 = findViewById<TextView>(R.id.carta1)
        val carta2 = findViewById<TextView>(R.id.carta2)
        val carta3 = findViewById<TextView>(R.id.carta3)
        val cartaNumero1 = findViewById<TextView>(R.id.cartaNumero1)
        val meioNumero = findViewById<TextView>(R.id.meioNumero)
        val cartaNumero3 = findViewById<TextView>(R.id.cartaNumero3)

        val valores = Bundle()
        valores.putString("naipe", "copas")

        val btnEnviar = findViewById<Button>(R.id.btnTirar)
        btnEnviar.setOnClickListener {

            val randomValues = List(1) { Random.nextInt(1, 5) }
            val sorteioCarta = randomValues[0]
            if (sorteioCarta == 1) carta1.text = "Ouro"

            if (sorteioCarta == 2) carta1.text = "Espada"

            if (sorteioCarta == 3) carta1.text = "Copas"

            if (sorteioCarta == 4) carta1.text = "Paus"


            val randomValues1 = List(1) { Random.nextInt(1, 5) }
            val sorteioCarta1 = randomValues1[0]
            if (sorteioCarta1 == 1) carta2.text = "Ouro"

            if (sorteioCarta1 == 2) carta2.text = "Espada"

            if (sorteioCarta1 == 3) carta2.text = "Copas"

            if (sorteioCarta1 == 4) carta2.text = "Paus"

            val randomValues2 = List(1) { Random.nextInt(1, 5) }
            val sorteioCarta2 = randomValues2[0]
            if (sorteioCarta2 == 1) carta3.text = "Ouro"

            if (sorteioCarta2 == 2) carta3.text = "Espada"

            if (sorteioCarta2 == 3) carta3.text = "Copas"

            if (sorteioCarta2 == 4) carta3.text = "Paus"

            val randomValues3 = List(1) { Random.nextInt(1, 14) }
            when (val sorteioCarta3 = randomValues3[0]) {
                11 -> cartaNumero1.text = "Valete"
                12 -> cartaNumero1.text = "Damas"
                13 -> cartaNumero1.text = "REI"
                else -> {
                    cartaNumero1.text = sorteioCarta3.toString()
                }
            }

            val randomValues4 = List(1) { Random.nextInt(1, 14) }
            val sorteioCarta4 = randomValues4[0]
            when (randomValues4[0]) {
                11 -> meioNumero.text = "Valete"
                12 -> meioNumero.text = "DAMAS"
                13 -> meioNumero.text = "REI"
                else -> {
                    meioNumero.text = sorteioCarta4.toString()
                }
            }
            val randomValues5 = List(1) { Random.nextInt(1, 14) }
            val sorteioCarta5 = randomValues5[0]
            when (randomValues5[0]) {
                11 -> cartaNumero3.text = "Valete"
                12 -> cartaNumero3.text = "DAMAS"
                13 -> cartaNumero3.text = "REI"
                else -> {
                    cartaNumero3.text = sorteioCarta5.toString()
                }
            }
        }
    }


}