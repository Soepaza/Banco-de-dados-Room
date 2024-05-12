package com.impacta.banco_de_dados_room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.impacta.banco_de_dados_room.model.Usuario

@Dao
interface UsuarioDao {
    @Insert
    fun inserir(listaUsers: MutableList<Usuario>)

    @Insert
    fun inserirUser(user: Usuario)

    @Delete
    fun deletar(user: Usuario)
}