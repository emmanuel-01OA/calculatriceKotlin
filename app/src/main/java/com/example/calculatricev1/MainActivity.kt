package com.example.calculatricev1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var NouvelleSaisie = true
    var RecenNombre =""
    var Operation =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     }

    fun nombreSaisie(view: View) {

        if(NouvelleSaisie)
            editText.setText("")
        NouvelleSaisie = false



        var saisi:String = editText.text.toString()
        var boutonSaisi:Button = view as Button
        when(boutonSaisi.id){

            bouton_0.id -> { saisi += "0"}
            bouton_1.id -> { saisi += "1"}
            bouton_2.id -> { saisi += "2"}
            bouton_3.id -> { saisi += "3"}
            bouton_4.id -> { saisi += "4"}
            bouton_5.id -> { saisi += "5"}
            bouton_6.id -> { saisi += "6"}
            bouton_7.id -> { saisi += "7"}
            bouton_8.id -> { saisi += "8"}
            bouton_9.id -> { saisi += "9"}
            boutonPlusMoins.id -> { saisi = "-$saisi"}
        }
        editText.setText(saisi)
    }

    fun operationSaisies(view: View) {
        NouvelleSaisie = true
        RecenNombre = editText.text.toString()
        var boutonSaisi:Button = view as Button
        when(boutonSaisi.id){
            boutonMulti.id -> { Operation = "*" }
            boutonPlus.id -> { Operation = "+" }
            boutonMoins.id -> { Operation = "-" }
            boutonDivision.id -> { Operation = "/" }
            boutonModulo.id -> { Operation = "mod" }

        }


    }
    //    parametre du bouton egale
    fun ResultatS(view: View) {
        var Nouvnombre : String = editText.text.toString()
        var resultat = 0
        when(Operation){
            "*" -> {resultat = Integer.parseInt((Integer.parseInt(RecenNombre) * Integer.parseInt(Nouvnombre)).toString()) }

                "+"-> {resultat = ((Integer.parseInt(RecenNombre) + Integer.parseInt(Nouvnombre))  ) }
             "-" -> { resultat = ((Integer.parseInt(RecenNombre) - Integer.parseInt(Nouvnombre))  ) }
            "/" -> { resultat = ((Integer.parseInt(RecenNombre) / Integer.parseInt(Nouvnombre)) )  }
            "mod" -> { resultat = Integer.parseInt(RecenNombre) % Integer.parseInt(Nouvnombre)   }
        }

        editText.setText(resultat.toString())
    }

//    parametre du bouton rest
    fun EffaceTout(view: View) {
        NouvelleSaisie = true

        editText.setText("")

    }

}