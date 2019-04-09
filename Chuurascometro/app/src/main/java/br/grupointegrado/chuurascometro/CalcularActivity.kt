package br.grupointegrado.chuurascometro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calcular.*
import kotlinx.android.synthetic.main.activity_main.*

class CalcularActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)

        //Pegando os valos vindo de outra Active e formatando para int,
        // e chamando a função para calcular

        val dados: Bundle = intent.extras

        val homen = dados.getString("homen").toInt()
        val mulher = dados.getString("mulher").toInt()
        val crianca = dados.getString("crianca").toInt()

        Soma(homen, mulher, crianca)


    }



    //Funcao somar os ingredientes necessarios

    fun Soma(qtdHomen:Int, qtdMulher:Int, qtdcrianca: Int) {

        var total_pc_h = qtdHomen * 240
        var total_ma_h = qtdHomen * 80
        var total_lg_h = qtdHomen * 40
        var total_fg_h = qtdHomen * 40
        var total_arroz_h = qtdHomen * 100
        var total_bt_h = qtdHomen * 200
        var total_faro_h = qtdHomen * 100
        var total_pao_h = qtdHomen * 1.5

        var total_pc_m = qtdMulher * 180
        var total_ma_m = qtdMulher * 60
        var total_lg_m = qtdMulher * 30
        var total_fg_m = qtdMulher * 30
        var total_arroz_m = qtdMulher * 80
        var total_bt_m = qtdMulher * 150
        var total_faro_m = qtdMulher * 50
        var total_pao_m = qtdMulher * 1.5

        var total_pc = qtdcrianca * 120
        var total_ma = qtdcrianca * 40
        var total_lg = qtdcrianca * 20
        var total_fg = qtdcrianca * 20
        var total_bt = qtdcrianca * 100

        var fn_total_pc = total_pc_h + total_pc_m + total_pc
        var fn_total_mami = total_ma_h + total_ma_m + total_ma
        var fn_total_lg = total_lg_h + total_lg_m + total_lg
        var fn_total_fg = total_fg_h + total_fg_m + total_fg
        var fn_total_arroz =   total_arroz_h + total_arroz_m
        var fn_total_bt = total_bt_h + total_bt_m + total_bt
        var fn_total_faro = total_faro_h + total_faro_m
        var fn_total_pao = total_pao_h + total_pao_m



        textViewHPica.setText(fn_total_pc.toString())
        textViewHmami.setText(fn_total_mami.toString())
        textViewHLig.setText(fn_total_lg.toString())
        textViewHFra.setText(fn_total_fg.toString())
        textViewHArr.setText(fn_total_arroz.toString())
        textViewHBat.setText(fn_total_bt.toString())
        textViewHFaro.setText(fn_total_bt.toString())
        textViewHPao.setText(fn_total_pao.toString())






    }







}


