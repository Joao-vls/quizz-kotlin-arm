package com.example.quizz.data.local.perguntas

import com.example.quizz.data.local.respostas.PalavrasPortugues
import com.example.quizz.model.Pergunta

class PerguntaAPI {
    fun getPerguntaById(id: Int,tema:Int): Pergunta? {
        val  obj:Pergunta?= when(tema) {
            1-> {
                Perguntas.portugues.find { it.id == id }
            }
            2-> {
                Perguntas.anatomiaOssos.find { it.id == id}
            }
            3-> {
                Perguntas.eticaEnfermagem.find { it.id == id}
            }
            4->{
                Perguntas.procedimentosEnfermagem.find { it.id == id }
            }
            else->null
        }
        return obj
    }
    fun getQuantidadeTema(): Int {
        return Perguntas.valores;
    }
    fun  getQuantidadePergunta(tema: Int):Int{
        val  tam:Int= when(tema) {
            1-> {
                Perguntas.portugues.size
            }
            2->{
                Perguntas.anatomiaOssos.size
            }
            3->{
                Perguntas.eticaEnfermagem.size
            }
            4->{
                Perguntas.procedimentosEnfermagem.size
            }
            else->0
        }
        return tam
    }
    fun getPalavras(temaAtual:Int):MutableList<String>{
        val p=when(temaAtual) {
            1-> {
                PalavrasPortugues.palavras
            }
            2-> {
                PalavrasPortugues.palavrasOssos
            }
            3-> {
                PalavrasPortugues.palavrasEticaEnfermagem
            }
            4->{
                PalavrasPortugues.palavrasProcedimentos
            }

            else-> mutableListOf("erro")
        }
        return p;
    }
}