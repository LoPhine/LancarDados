package com.example.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadosBotao)

        val ImgDado1 = findViewById<ImageView>(R.id.dado1)
        val ImgDado2 = findViewById<ImageView>(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            val numero = lancarDados()
            ImgDado1.setImageResource(escolherImg(numero))
            ImgDado2.setImageResource(escolherImg(numero))
        }
    }

    fun escolherImg(numero: Int): Int {
        return when(numero){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
    }

    fun lancarDados(): Int {
        return (1..6).random()
    }
}