package com.example.ladm_u2_p1_copos_nieve

import android.app.Activity
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Lienzo (activity: MainActivity) : View(activity) {
    var activity = activity
    val copos = Array<Copo>(20000, { Copo(this) }) //Tamaño y como se inicializa



    val corutina = GlobalScope.launch {
        while (true) {
            activity.runOnUiThread {
                invalidate()
            }
            delay(20L)
        }
    }



    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var p = Paint(); //Paint(Acuarela)

        c.drawRGB(70, 100, 150)

        //Fondo sol
        if (activity.intensidad == 0) {
            p.color = Color.rgb(100, 220, 120)//lento
            c.drawCircle(1100f, 1900f, 1550f, p)
            p.color = Color.rgb(200, 250, 50)//sol
            c.drawCircle(300f, 300f, 200f, p)
        }

            if (activity.intensidad == 1) {
                p.color = Color.rgb(150, 120, 30)//normal
                c.drawCircle(1100f, 1900f, 1550f, p)
            }

            if (activity.intensidad == 2) {
                p.color = Color.rgb(5, 20, 30)//fuerte
                c.drawCircle(1100f, 1850f, 3000f, p)
                p.color = Color.rgb(255, 255, 255)//luna
                c.drawCircle(1000f, 400f, 300f, p)
            }


            //Piso
            p.color = Color.rgb(80, 150, 220)
            c.drawRect(0f, 900f, 3000f, 2000f, p)

            //Arboles random con movimiento random
            var arboles = 40
            var arbolesDibujados = 0
            var movY = 50f
            var movLados = 0f //controla donde empiezan los arboles

            while (arbolesDibujados < arboles / 2) {

                p.color = Color.rgb(25, 35, 25)
                c.drawRect(movLados - 25, 750f, +movLados + 25, 850f, p)

                p.color = Color.rgb(50, 60, 40)
                c.drawCircle(movLados, 470f - movY, 10f, p)
                c.drawCircle(movLados, 480f - movY, 20f, p)
                c.drawCircle(movLados, 500f - movY, 40f, p)
                c.drawCircle(movLados, 540f - movY, 60f, p)
                c.drawCircle(movLados, 600f - movY, 80f, p)
                c.drawCircle(movLados, 700f - movY, 100f, p)
                arbolesDibujados++
                movLados += 200f //distancia entre arboly arbol

            }

            movLados = 100f //desface de hileras
            while (arbolesDibujados < arboles) {

                p.color = Color.rgb(25, 35, 25)
                c.drawRect(movLados - 25, 750f, +movLados + 25, 850f, p)

                p.color = Color.rgb(50, 90, 40)
                c.drawCircle(movLados, 470f, 10f, p)
                c.drawCircle(movLados, 480f, 20f, p)
                c.drawCircle(movLados, 500f, 40f, p)
                c.drawCircle(movLados, 540f, 60f, p)
                c.drawCircle(movLados, 600f, 80f, p)
                c.drawCircle(movLados, 700f, 100f, p)
                arbolesDibujados++
                movLados += 200f //distancia entre arboly arbol

            }

            //Humo
            p.color = Color.rgb(150, 150, 150)
            c.drawCircle(2050f, 300f, 25f, p)
            c.drawCircle(2060f, 280f, 25f, p)
            c.drawCircle(2080f, 240f, 35f, p)
            c.drawCircle(2100f, 190f, 45f, p)
            c.drawCircle(2150f, 110f, 55f, p)
            c.drawCircle(2200f, 70f, 65f, p)

            p.color = Color.rgb(50, 60, 40)
            c.drawRect(1900f, 200f, 2100f, 870f, p) //chimenea
            c.drawRect(1500f, 400f, 2100f, 870f, p) //cabaña

            //techo
            p.color = Color.rgb(250, 250, 250)
            c.drawRect(1345f, 290f, 2255f, 400f, p)
            p.color = Color.rgb(0, 0, 0)
            c.drawRect(1350f, 300f, 2250f, 400f, p)

            //tablas
            c.drawRect(1500f, 450f, 2100f, 455f, p)
            c.drawRect(1500f, 500f, 2100f, 505f, p)
            c.drawRect(1500f, 550f, 2100f, 555f, p)
            c.drawRect(1500f, 600f, 2100f, 605f, p)
            c.drawRect(1500f, 650f, 2100f, 655f, p)
            c.drawRect(1500f, 700f, 2100f, 705f, p)
            c.drawRect(1500f, 750f, 2100f, 755f, p)
            c.drawRect(1500f, 800f, 2100f, 805f, p)
            c.drawRect(1500f, 850f, 2100f, 855f, p)


            //circulitos tablas
            p.color = Color.rgb(60, 100, 70)
            c.drawCircle(1530f, 430f, 21f, p)
            c.drawCircle(1530f, 430f + 50, 21f, p)
            c.drawCircle(1530f, 430f + 100, 21f, p)
            c.drawCircle(1530f, 430f + 150, 21f, p)
            c.drawCircle(1530f, 430f + 200, 21f, p)
            c.drawCircle(1530f, 430f + 250, 21f, p)
            c.drawCircle(1530f, 430f + 300, 21f, p)
            c.drawCircle(1530f, 430f + 350, 21f, p)
            c.drawCircle(1530f, 430f + 400, 21f, p)

            c.drawCircle(2070f, 430f, 21f, p)
            c.drawCircle(2070f, 430f + 50, 21f, p)
            c.drawCircle(2070f, 430f + 100, 21f, p)
            c.drawCircle(2070f, 430f + 150, 21f, p)
            c.drawCircle(2070f, 430f + 200, 21f, p)
            c.drawCircle(2070f, 430f + 250, 21f, p)
            c.drawCircle(2070f, 430f + 300, 21f, p)
            c.drawCircle(2070f, 430f + 350, 21f, p)
            c.drawCircle(2070f, 430f + 400, 21f, p)

            //Ventanas
            if (activity.intensidad == 2)
                p.color = Color.rgb(Random.nextInt(250), Random.nextInt(250), Random.nextInt(250))
            else
                p.color = Color.rgb(150, 200, 250)
            //arriba
            c.drawRect(1750f + 60, 460f, 2000f, 592f, p) //der
            c.drawRect(1780f - 180, 460f, 2000f - 210, 592f, p)
            //abajo
            c.drawRect(1750f + 60, 460f + 160, 2000f, 592f + 160, p) //der
            c.drawRect(1780f - 180, 460f + 160, 2000f - 210, 592f + 160, p)


            when (activity.intensidad) {
                0 -> {
                    for (cop in copos) {//como for each
                        cop.moverLento()
                        cop.pintar(c)

                    }
                }
                1 -> {
                    for (cop in copos) {//como for each
                        cop.moverMedio()
                        cop.pintar(c)
                    }
                }
                2 -> {
                    for (cop in copos) {//como for each
                        cop.moverRapido()
                        cop.pintar(c)
                    }
                }
            }//when

        }//onDraw
    }


