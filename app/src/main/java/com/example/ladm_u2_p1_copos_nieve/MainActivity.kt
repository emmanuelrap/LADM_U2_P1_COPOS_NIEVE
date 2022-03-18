package com.example.ladm_u2_p1_copos_nieve

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var intensidad=0
    var tiempoDensidad = Random.nextLong(3000L)+7000L
    var mp:MediaPlayer?=null

    val timer = object : CountDownTimer(200000,tiempoDensidad){
        override fun onTick(p0: Long) {
            //Se ejecuta cuando el intervalo=0
            //random 0,1,2
            intensidad= Random.nextInt(3)


        }
        override fun onFinish() {
            //Se ejecuta cuando el total=0
            start()
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(Lienzo(this))
        timer.start()
        mp= MediaPlayer.create(this,R.raw.cancionfondo)
        mp?.start()

    }
}