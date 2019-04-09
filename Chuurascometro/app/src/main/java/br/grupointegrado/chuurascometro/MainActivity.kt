package br.grupointegrado.chuurascometro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_cal.setOnClickListener {

            val intent = Intent(applicationContext, CalcularActivity::class.java)

                var h = editTextHomen.text.toString()
                var m = editTextMulher.text.toString()
                var c = editTextCrianca.text.toString()

                intent.putExtra("homen", h)
                intent.putExtra("mulher", m)
                intent.putExtra("crianca",c)

                startActivity(intent)

        }




    }







}
