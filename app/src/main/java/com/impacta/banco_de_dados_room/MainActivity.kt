package com.impacta.banco_de_dados_room

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.impacta.banco_de_dados_room.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btCadastrar.setOnClickListener {
            val navegarTelaCad = Intent(
                this, CadastrarUsuario::class.java
            )
            startActivity(navegarTelaCad)
        }
        }
    }