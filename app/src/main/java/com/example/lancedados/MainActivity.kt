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
        val ImgDado1 = findViewById<ImageView>(R.id.playerNameText)
        val ImgDado2 = findViewById<ImageView>(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            val numero = lancarDados()
            ImgDado1.setImageResource(lancarDados())
            ImgDado2.setImageResource(lancarDados())
        }
        val playerName = getIntent().getStringExtra("playerName")
        val labelTextView = findViewById<TextView>(R.id.textView)
        labelTextView.text = "Olá, $playerName"
    }

    fun lancarDados(): Int {
        return escolherImg(pegaNumero())
    }


    fun escolherImg(valor: Int): Int {
        return when(valor){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
    }

    fun pegaNumero(): Int {
        return (1..6).random()
    }
}