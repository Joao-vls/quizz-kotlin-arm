package com.example. quizz

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColor
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizz.data.local.perguntas.PerguntaAPI
import com.example.quizz.data.local.respostas.PalavrasPortugues
import kotlin.properties.Delegates
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var pergunta:TextView
    private lateinit var respostaFixa:TextView
    private var perguntaAPI=PerguntaAPI()
    private lateinit var tema:TextView
    private lateinit var temaBlock:Button
    private lateinit var buttonMostrar:Button
    private lateinit var resposta:TextView
    private lateinit var buttonConfirmar:Button
    private lateinit var buttonMudarPergunta:Button
    private lateinit var buttonMudarTema:Button
    private var blockBoolean:Boolean=true
    private lateinit var gridLayout: GridLayout
    private var temaAtual=Random.nextInt(1,perguntaAPI.getQuantidadeTema()+1)
    private var perguntaAtual=perguntaAPI.getPerguntaById(Random.nextInt(1,perguntaAPI.getQuantidadePergunta(temaAtual)+1),temaAtual)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findsElement()
        buttonConfirmar.setOnClickListener{confirmaResposta()}
        buttonMudarPergunta.setOnClickListener{mudarPergunta()}
        buttonMudarTema.setOnClickListener { mudarTema() }
        temaBlock.setOnClickListener {
                if (blockBoolean){
                    val vermelho = ContextCompat.getColor(this, R.color.vermelho)
                    temaBlock.setBackgroundColor(vermelho)
                    blockBoolean=false
                }else{
                    val verde = ContextCompat.getColor(this, R.color.verde)
                    temaBlock.setBackgroundColor(verde)
                    blockBoolean=true
                }
        }
        setPergunta()
    }
    private fun mudarPergunta(){
        gridLayout.removeAllViews()
        resposta.text=""
        if (perguntaAtual?.id!!<perguntaAPI.getQuantidadePergunta(temaAtual)){
            perguntaAtual = perguntaAPI.getPerguntaById(perguntaAtual!!.id+1, temaAtual)
        }else{
            perguntaAtual = perguntaAPI.getPerguntaById(1, temaAtual)
        }
        setPergunta()
    }
    private fun mudarTema(){
        if (blockBoolean){
        gridLayout.removeAllViews()
        if (temaAtual>=perguntaAPI.getQuantidadeTema()){
            temaAtual=1
        }else{
            temaAtual+=1
        }
        perguntaAtual = perguntaAPI.getPerguntaById(Random.nextInt(1, perguntaAPI.getQuantidadePergunta(temaAtual)+1), temaAtual)
        resposta.text=""
        setPergunta()
        }
    }
    private fun setPergunta(){
        val textPer=perguntaAtual
        val image=findViewById<ImageView>(R.id.ImageTexto)
        image.visibility=View.GONE
        textPer?.let {
            tema.text=textPer.temas.valor();
            pergunta.text=it.perguntaText
            if (textPer.image.valor()!=null){
                image.visibility=View.VISIBLE
                image.setImageResource(textPer.image.valor()!!)
            }
        }
        setRespostaFixa()
        setPalavras()
    }
    private fun setPalavras(){
        val pal=perguntaAPI.getPalavras(temaAtual)
        val tam=perguntaAtual?.resposta
        val res= tam?.toMutableList()
        if (tam!=null) {
            val d = pal.filterNot{it in tam}
            for (i in 0.. d.size/2){
                res?.add(d[Random.nextInt(d.size)])
            }
        }
        res?.shuffle()
        if (res != null) {
            for (i in res) {
                val textView = TextView(this).apply {
                    layoutParams = TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT
                    )
                    setPadding(10, 10, 10, 10)
                    text = i
                    setTextColor(Color.WHITE)
                    setOnClickListener {
                        if (buttonConfirmar.visibility == View.INVISIBLE) {
                            buttonConfirmar.visibility = View.VISIBLE
                        }
                        this.visibility = View.GONE
                        resposta.text = "${resposta.text} $i"
                    }

                }
                gridLayout.addView(textView)

            }
        }
        }
    private fun setRespostaFixa(){
        val textPer=perguntaAtual
        textPer?.let {
            val texto= perguntaAtual?.resposta?.joinToString( " ")
            respostaFixa.text=texto
            buttonMostrar.setOnClickListener{
                respostaFixa.visibility= View.VISIBLE
                buttonMostrar.visibility=View.INVISIBLE
                Handler(Looper.getMainLooper()).postDelayed({
                    respostaFixa.visibility = View.INVISIBLE
                    buttonMostrar.visibility=View.VISIBLE
                }, 2000)

            }
        }
    }
    private fun confirmaResposta(){
            val resusuario= resposta.text.toString().trim()
            val respostax= respostaFixa.text.toString().trim()
            if (respostax==resusuario){
                val verde = ContextCompat.getColor(this, R.color.verde)
                buttonConfirmar.setBackgroundColor(verde)
                Handler(Looper.getMainLooper()).postDelayed({
                    if (blockBoolean) {
                        temaAtual = Random.nextInt(1, perguntaAPI.getQuantidadeTema() + 1)
                    }
                    perguntaAtual = perguntaAPI.getPerguntaById(Random.nextInt(1, perguntaAPI.getQuantidadePergunta(temaAtual)+1), temaAtual)
                    gridLayout.removeAllViews()
                    val roxo = ContextCompat.getColor(this, R.color.roxo)
                    buttonConfirmar.setBackgroundColor(roxo)
                    resposta.text=""
                    setPergunta()
                },2000)
            }else{
                val vermelho = ContextCompat.getColor(this, R.color.vermelho)
                buttonConfirmar.setBackgroundColor(vermelho)
                for (i in 0 until gridLayout.childCount) {
                    val child = gridLayout.getChildAt(i)
                    if (child is TextView) {
                        child.visibility = View.VISIBLE
                    }
                }
                resposta.text=""
                Handler(Looper.getMainLooper()).postDelayed({
                    val roxo = ContextCompat.getColor(this, R.color.roxo)
                    buttonConfirmar.setBackgroundColor(roxo)
                },2000)
            }

    }
    private fun findsElement(){
        temaBlock=findViewById(R.id.temaBlock)
        gridLayout= findViewById(R.id.grid)
        buttonMudarTema=findViewById(R.id.temaMudar)
        buttonMudarPergunta=findViewById(R.id.perguntaMudar)
        tema=findViewById(R.id.temaTitulo)
        buttonMostrar=findViewById(R.id.mostra_ocultar)
        resposta=findViewById(R.id.TextoResposta)
        respostaFixa=findViewById(R.id.TextoRespostaCerta)
        pergunta=findViewById(R.id.TextoPergunta)
        buttonConfirmar=findViewById(R.id.confirma_resposta)
    }
}