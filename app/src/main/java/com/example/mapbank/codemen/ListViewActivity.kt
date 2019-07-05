package com.example.mapbank.codemen

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.mapbank.R
import kotlinx.android.synthetic.main.activity_list_view.*
import kotlinx.android.synthetic.main.activity_main.*


class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val nameBank = arrayOf( "BBVA", "Bancolombia", "Davivienda", "Colpatria", "NEQUI", "Banco AV Villas", "Banco Popular", "Banco Caja Social", "Banco de Bogota")

        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameBank)
        list1.adapter = adaptador1

        fun Context.toast(context: Context = applicationContext, message: String, duration: Int = Toast.LENGTH_SHORT){
            Toast.makeText(context, message , duration).show()
        }


        }


    }

