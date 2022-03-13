package com.example.ladm_u2_p1_copos_nieve

import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View

class Lienzo (activity: MainActivity) : View(activity) {
    var activity=activity

    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var p= Paint(); //Paint(Acuarela)
        var arboles=10
        var movLados=50

        //Fondo
        while(arboles>0){
            p.color = Color.rgb(25,35,25)
            c.drawRect(275f,750f,325f,850f,p)

            p.color = Color.rgb(50,100,40)
            c.drawCircle(300f+movLados,470f,10f,p)
            c.drawCircle(300f+movLados,480f,20f,p)
            c.drawCircle(300f+movLados,500f,40f,p)
            c.drawCircle(300f+movLados,540f,60f,p)
            c.drawCircle(300f+movLados,600f,80f,p)
            c.drawCircle(300f+movLados,700f,100f,p)
            
            arboles--
            movLados+=50
        }
        p.color = Color.rgb(25,35,25)
        c.drawRect(275f,750f,325f,850f,p)

        p.color = Color.rgb(50,100,40)
        c.drawCircle(300f,470f,10f,p)
        c.drawCircle(300f,480f,20f,p)
        c.drawCircle(300f,500f,40f,p)
        c.drawCircle(300f,540f,60f,p)
        c.drawCircle(300f,600f,80f,p)
        c.drawCircle(300f,700f,100f,p)



       /* //EditText
        p.color = Color.rgb(255,255,255)
        c.drawRect(175f,915f,905f,1015f,p)
        c.drawRect(175f,1205f,905f,1305f,p)*/





    }
}