package com.impacta.banco_de_dados_room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tab_user")
class Usuario (
    @ColumnInfo(name = "nome") val nome: String,
    @ColumnInfo(name = "sobrenome") val sobrenome: String,
    @ColumnInfo(name = "idade") val idade: String,
    @ColumnInfo(name = "cel") val cel: String,
)
{
    @PrimaryKey(autoGenerate = true)
    var uId: Int = 0
}