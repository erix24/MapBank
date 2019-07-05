package com.example.mapbank.codemen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import com.example.mapbank.codemen.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*






class MainActivity : AppCompatActivity() {


    private var opcionesListMaster = ArrayList<LstOtion>()

    private var lstOption: ArrayList<LstOtion> = ArrayList()

    class LstOtion(var image: Int, var name: String, var position: Int, var id: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(com.example.mapbank.R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(com.example.mapbank.R.layout.activity_main)


        corresponsal.setOnClickListener {

            val intent:Intent = Intent(this,ListViewActivity:: class.java)
            startActivity(intent)
        }


        store.setOnClickListener{

            val intent:Intent = Intent(this,WebviewActivity:: class.java)
            startActivity(intent)
        }

            }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(com.example.mapbank.R.menu.menu, menu)
        return true


    }

    // actions on click menu items
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        com.example.mapbank.R.id.action_search -> {
            msgShow("Buscar")

            true
        }
        com.example.mapbank.R.id.action_profile -> {
            msgShow("Perfil")
            true
        }
        com.example.mapbank.R.id.action_setting -> {
            msgShow("Setting")
            true
        }

        com.example.mapbank.R.id.action_map -> {
            msgShow("buscar tu ubicacion ")
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    fun msgShow(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}


