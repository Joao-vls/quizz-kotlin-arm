package com.example.quizz.data.local.perguntas

import com.example.quizz.R

enum class Temas {
    PORTUGUES,ANATOMIA_OSSOS,ETICAEN,PROCEDIMENTOSEM;

    fun valor()=
        when(this){
            PORTUGUES-> "Portugues"
            ANATOMIA_OSSOS-> "Anatomia ossos"
            ETICAEN->"etica enfermagem"
            PROCEDIMENTOSEM->"Procedimento enfermagem"
        }
}