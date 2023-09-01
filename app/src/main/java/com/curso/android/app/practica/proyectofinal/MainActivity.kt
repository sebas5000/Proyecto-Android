package com.curso.android.app.practica.proyectofinal

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.curso.android.app.practica.proyectofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var tex1: EditText
    private lateinit var tex2: EditText
    private lateinit var texto: String
    private lateinit var texto2: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


        tex1 =  findViewById(R.id.edit)
        tex2 =  findViewById(R.id.edit2)


        binding.fab.setOnClickListener { view ->
            texto = tex1.getText().toString();
            texto2 = tex2.getText().toString();
            if (texto.equals(texto2)){
            Snackbar.make(view, "Los textos son iguales", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
                                } else{
                                        Snackbar.make(view, "Los textos no son iguales", Snackbar.LENGTH_LONG)
                                            .setAction("Action", null).show()

                                        }
        }
    }




}