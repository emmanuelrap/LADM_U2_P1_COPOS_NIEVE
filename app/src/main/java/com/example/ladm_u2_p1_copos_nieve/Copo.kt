package com.example.ladm_u2_p1_copos_nieve

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import kotlin.random.Random

class Copo (l:Lienzo) {
        val l=l
        var x = 0f
        var y = 0f
        var movX= 0f
        var movY=0f
        var color= Color.WHITE
        var radio = 20f

        init {
            x = rand(3000)-500
            y = rand (100000)-100000 //Tupicidad xd
            movX = 0f
            movY = rand(5)
        }

    private fun rand(hasta : Int):Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun moverLento(){
        y+=movY
    }

    fun moverMedio(){
        y+=movY*3
    }

    fun moverRapido(){
        y+=movY*6
    }

    fun pintar(canvas : Canvas){
        var p= Paint()
        p.color=color
        canvas.drawCircle(x,y,radio,p)
    }
}