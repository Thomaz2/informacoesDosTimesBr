package com.example.informacoesdostimesbr.data

import com.example.informacoesdostimesbr.R
import com.example.informacoesdostimesbr.model.Times

class BDTimes {
    fun carregaListasTimes ():List<Times>{
        return listOf<Times>(
            Times(nomeTime = "corinthians", anoDeCriacao = 1910, informacao = "hdhd" ,imagem = R.drawable.corinthians),
            Times(nomeTime = "São Paulo", anoDeCriacao = 1930, informacao = "hdhd" ,imagem = R.drawable.corinthians),
            Times(nomeTime = "Palmeiras", anoDeCriacao = 1914, informacao = "hdhd" ,imagem = R.drawable.corinthians),
            Times(nomeTime = "Santos", anoDeCriacao = 1912, informacao = "hdhd" ,imagem = R.drawable.corinthians)
        )
    }
}