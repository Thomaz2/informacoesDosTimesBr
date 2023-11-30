package com.example.informacoesdostimesbr.model

data class Times(
    val nomeTime : String,
    val anoDeCriacao: Int = 0,
    var titulos: Int = 0,
    var informacao: String,
    var imagem: Int,
)
