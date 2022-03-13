package com.example.ladm_u2_p1_copos_nieve

import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View
import kotlin.random.Random

class Lienzo (activity: MainActivity) : View(activity) {
    var activity=activity

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var p= Paint(); //Paint(Acuarela)
        c.drawRGB(70,100,150);

        //Fondo
        p.color = Color.rgb(240,220,120)
           c.drawCircle(1100f,1850f,1500f,p)


        //Arboles random con movimiento random
        var arboles= Random.nextInt(50)  + 10
        while(arboles>0){
            var movLados=Random.nextInt(2500).toFloat()
            var ramColor= Random.nextInt(50)+75

            p.color = Color.rgb(25,35,25)
            c.drawRect(movLados-25,750f,+movLados+25,850f,p)

            p.color = Color.rgb(50,ramColor,40)
            c.drawCircle(movLados,470f,10f,p)
            c.drawCircle(movLados,480f,20f,p)
            c.drawCircle(movLados,500f,40f,p)
            c.drawCircle(movLados,540f,60f,p)
            c.drawCircle(movLados,600f,80f,p)
            c.drawCircle(movLados,700f,100f,p)
            arboles--

        }

        //Humo
        p.color = Color.rgb(150,150,150)
        c.drawCircle(2050f,300f,25f,p)
        c.drawCircle(2060f,280f,25f,p)
        c.drawCircle(2080f,240f,35f,p)
        c.drawCircle(2100f,190f,45f,p)
        c.drawCircle(2150f,110f,55f,p)
        c.drawCircle(2200f,70f,65f,p)

        p.color = Color.rgb(50,60,40)
        c.drawRect(1900f,200f,2100f,900f,p) //chimenea
        c.drawRect(1500f,400f,2100f,900f,p) //cabaña

        //techo
        p.color = Color.rgb(250,250,250)
        c.drawRect(1345f,290f,2255f,400f,p)
        p.color = Color.rgb(0,0,0)
        c.drawRect(1350f,300f,2250f,400f,p)
        //tablas
        c.drawRect(1500f,450f,2100f,455f,p)
        c.drawRect(1500f,500f,2100f,505f,p)
        c.drawRect(1500f,550f,2100f,555f,p)
        c.drawRect(1500f,600f,2100f,605f,p)
        c.drawRect(1500f,650f,2100f,655f,p)
        c.drawRect(1500f,700f,2100f,705f,p)
        c.drawRect(1500f,750f,2100f,755f,p)
        c.drawRect(1500f,800f,2100f,805f,p)
        c.drawRect(1500f,850f,2100f,855f,p)
        c.drawRect(1500f,900f,2100f,905f,p)



        p.color = Color.rgb(60,100,70)
        c.drawCircle(1530f,430f,21f,p)
        c.drawCircle(1530f,430f+50,21f,p)
        c.drawCircle(1530f,430f+100,21f,p)
        c.drawCircle(1530f,430f+150,21f,p)
        c.drawCircle(1530f,430f+200,21f,p)
        c.drawCircle(1530f,430f+250,21f,p)
        c.drawCircle(1530f,430f+300,21f,p)
        c.drawCircle(1530f,430f+350,21f,p)
        c.drawCircle(1530f,430f+400,21f,p)

        c.drawCircle(2070f,430f,21f,p)
        c.drawCircle(2070f,430f+50,21f,p)
        c.drawCircle(2070f,430f+100,21f,p)
        c.drawCircle(2070f,430f+150,21f,p)
        c.drawCircle(2070f,430f+200,21f,p)
        c.drawCircle(2070f,430f+250,21f,p)
        c.drawCircle(2070f,430f+300,21f,p)
        c.drawCircle(2070f,430f+350,21f,p)
        c.drawCircle(2070f,430f+400,21f,p)

        //Ventanas
        p.color = Color.rgb(0,90,160)
        //arriba
        c.drawRect(1750f+60,460f,2000f,592f,p) //der
        c.drawRect(1780f-180,460f,2000f-210,592f,p)
        //abako
        c.drawRect(1750f+60,460f+160,2000f,592f+160,p) //der
        c.drawRect(1780f-180,460f+160,2000f-210,592f+160,p)











       /* //EditText
        p.color = Color.rgb(255,255,255)
        c.drawRect(175f,915f,905f,1015f,p)
        c.drawRect(175f,1205f,905f,1305f,p)*/





    }
}