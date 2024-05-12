package com.impacta.banco_de_dados_room

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.impacta.banco_de_dados_room.databinding.ActivityCadastrarUsuarioBinding
import com.impacta.banco_de_dados_room.dao.UsuarioDao
import com.impacta.banco_de_dados_room.model.Usuario

class CadastrarUsuario : AppCompatActivity() {

    private lateinit var binding: ActivityCadastrarUsuarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastrarUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var usuarioDao: UsuarioDao = AppDatabase.getInstance(this).UsuarioDao()

        binding.btCadastrar.setOnClickListener{
            val nome = binding.editNome.text.toString()
            val sobrenome = binding.editSobrenome.text.toString()
            val idade =  binding.editCelular.text.toString()
            val cel =  binding.editCelular.text.toString()

            if(nome.isEmpty() || sobrenome.isEmpty() || idade.isEmpty() || cel.isEmpty()){
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                val usuario = Usuario(nome, sobrenome, idade, cel)
                usuarioDao.inserirUser(usuario)

                Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show()

                binding.editNome.text.clear()
                binding.editSobrenome.text.clear()
                binding.editIdade.text.clear()
                binding.editCelular.text.clear()
            }
        }
    }
}