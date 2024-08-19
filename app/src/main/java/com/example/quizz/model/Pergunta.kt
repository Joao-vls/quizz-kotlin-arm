package com.example.quizz.model

import com.example.quizz.data.local.image.Imagens
import com.example.quizz.data.local.perguntas.Temas


data class Pergunta(
    val id:Int,
    val perguntaText:String,
    val resposta: MutableList<String>,
    val image:Imagens,
    val temas: Temas
)
