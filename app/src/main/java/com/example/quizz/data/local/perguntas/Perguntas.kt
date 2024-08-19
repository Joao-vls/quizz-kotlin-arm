package com.example.quizz.data.local.perguntas

import com.example.quizz.data.local.image.Imagens
import com.example.quizz.model.Pergunta


object Perguntas {
    const val valores=4;
    val portugues= mutableListOf(
        Pergunta(
            id =1,
            perguntaText = "Nomeia seres, objetos, lugares, sentimentos, etc.\n" +
                    "\n" +
                    "Exemplo: livro, casa, alegria, Pedro",
            resposta = mutableListOf("SUBSTANTIVO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =2,
            perguntaText = "Caracteriza ou qualifica os substantivos, indicando suas qualidades, estados ou características.\n" +
                    "\n" +
                    "Exemplo: bonito, grande, feliz, azul.",
            resposta = mutableListOf("ADJETIVO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =3,
            perguntaText = "Acompanha o substantivo, definindo-o ou indefinindo-o.\n" +
                    "\n" +
                    "Exemplo: o, a, os, as (definidos); um, uma, uns, umas (indefinidos).\n",
            temas = Temas.PORTUGUES,
            resposta = mutableListOf("ARTIGO"),
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =4,
            perguntaText = "Indica quantidade, ordem, fração ou multiplicação em relação aos substantivos.\n" +
                    "\n" +
                    "Exemplo: um, dois, primeiro, metade, dobro.",
            resposta = mutableListOf("NUMERAL"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =5,
            perguntaText = "Substitui ou acompanha o substantivo, referindo-se às pessoas do discurso (quem fala, com quem se fala, de quem se fala).\n" +
                    "\n" +
                    "Exemplo: eu, tu, ele, meu, teu, esse, aquele, alguém.",
            resposta = mutableListOf("PRONOME"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =6,
            perguntaText = "Expressa ações, estados, mudanças de estado ou fenômenos.\n" +
                    "\n" +
                    "Exemplo: correr, ser, estar, acontecer.",
            resposta = mutableListOf("VERBO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO

        ),
        Pergunta(
            id =7,
            perguntaText = "Modifica o verbo, o adjetivo ou outro -----, indicando circunstâncias como tempo, lugar, modo, intensidade, etc.\n" +
                    "\n" +
                    "Exemplo: rapidamente, muito, ontem, aqui.",
            resposta = mutableListOf("ADVÉRBIO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO

        ),
        Pergunta(
            id =8,
            perguntaText = "Estabelece relações entre palavras, introduzindo complementos.\n" +
                    "\n" +
                    "Exemplo: de, em, por, com, para.\n",
            resposta = mutableListOf("PREPOSIÇÃO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =9,
            perguntaText = "Liga orações ou palavras de mesma função.\n" +
                    "\n" +
                    "Exemplo: e, mas, ou, porque, embora.",
            resposta = mutableListOf("CONJUNÇÃO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO

        ),
        Pergunta(
            id =10,
            perguntaText = "Expressa emoções, sentimentos, saudações, etc.\n" +
                    "\n" +
                    "Exemplo: ah!, oh!, ai!, nossa!",
            resposta = mutableListOf("INTERJEIÇÃO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =11,
            perguntaText = "enunciado completo, que pode ser uma simples interjeição ou uma construção complexa que contém sujeito e predicado.\n" +
                    "\n" +
                    "Exemplo: \"Bom dia!\"",
            resposta = mutableListOf("FRASE"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =12,
            perguntaText = "uma unidade de sentido que contém um verbo ou locução verbal e é organizada em torno de um predicado.\n" +
                    "\n" +
                    "Exemplo: \"O sol brilha.\"",
            resposta = mutableListOf("ORAÇÃO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =13,
            perguntaText = "tempo verbal utilizado para indicar ações que ocorreram no passado",
            resposta = mutableListOf("PRETÉRITO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =14,
            perguntaText = "é usado para descrever ações concluídas no passado.\n" +
                    "\n" +
                    "Formação:\n" +
                    "Verbos regulares em -AR: andei, andaste, andou, andamos, andastes, andaram\n" +
                    "Verbos regulares em -ER: comi, comeste, comeu, comemos, comestes, comeram\n" +
                    "Verbos regulares em -IR: parti, partiste, partiu, partimos, partistes, partiram\n" +
                    "Exemplos:\n" +
                    "Eu viajei para o Brasil.\n" +
                    "Eles comeram toda a pizza",
            resposta = mutableListOf("PRETÉRITO","PERFEITO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =15,
            perguntaText = "é usado para descrever ações habituais ou contínuas no passado, ações em progresso ou estados de ser no passado.\n" +
                    "\n" +
                    "Formação:\n" +
                    "Verbos regulares em -AR: andava, andavas, andava, andávamos, andáveis, andavam\n" +
                    "Verbos regulares em -ER: comia, comias, comia, comíamos, comíeis, comiam\n" +
                    "Verbos regulares em -IR: partia, partias, partia, partíamos, partíeis, partiam\n" +
                    "Exemplos:\n" +
                    "Quando eu era criança, eu brincava no parque todos os dias.\n" +
                    "Eles estudavam enquanto ela trabalhava.",
            resposta = mutableListOf("PRETÉRITO","IMPERFEITO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =16,
            perguntaText = "é usado para descrever uma ação que ocorreu antes de outra ação passada.\n" +
                    "\n" +
                    "Formação:\n" +
                    "Verbos regulares em -AR: andara, andaras, andara, andáramos, andáreis, andaram\n" +
                    "Verbos regulares em -ER: comera, comeras, comera, comêramos, comêreis, comeram\n" +
                    "Verbos regulares em -IR: partira, partiras, partira, partíramos, partíreis, partiram\n" +
                    "Exemplos:\n" +
                    "Quando cheguei à estação, o trem já partira.\n" +
                    "Ele já terminara o trabalho quando eu cheguei.",
            resposta = mutableListOf("PRETÉRITO","MAIS","QUE","PERFEITO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =17,
            perguntaText = "é usado para descrever ações repetidas ou continuadas no passado recente que têm relação com o presente.\n" +
                    "\n" +
                    "Formação:\n" +
                    "Verbo auxiliar \"ter\" no presente + particípio passado do verbo principal: tenho falado, tens falado, tem falado, temos falado, tendes falado, têm falado\n" +
                    "Exemplos:\n" +
                    "Eu tenho estudado muito ultimamente.\n" +
                    "Eles têm viajado frequentemente.",
            resposta = mutableListOf("PRETÉRITO","PERFEITO","COMPOSTO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =18,
            perguntaText = "é uma combinação de dois ou mais verbos que atuam juntos como um único verbo em uma oração. As ----- são frequentemente usadas para expressar tempos compostos, aspectos e modos verbais." +
                    "\nAção Contínua: \"Ela -estava- -trabalhando- quando a liguei.\"\n" +
                    "Ação Habitual: \"Eu -costumo- -correr- todas as manhãs.\"\n" +
                    "Ação Futura: \"Nós -vamos- -sair- em breve.\"\n" +
                    "Ação Condicional: \"Se eu -tivesse- -estudado-, teria passado.\"",
            resposta = mutableListOf("LOCUÇÃO","VERBAL"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =19,
            perguntaText = "é formado por uma ou mais orações. Ele pode ser simples (com uma única oração) ou composto (com mais de uma oração).\n" +
                    "\n" +
                    "---- simples: \"Ela sorriu.\"\n" +
                    "---- composto: \"Ela sorriu, mas estava triste.\"\n",
            resposta = mutableListOf("PERIODO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =20,
            perguntaText = "é o termo da oração sobre o qual se faz uma declaração ou descrição. Pode ser simples, composto, oculto ou indeterminado.\n" +
                    "\n" +
                    "----- simples: \"A menina correu.\"\n" +
                    "----- composto: \"A menina e o menino correram.\"\n" +
                    "----- oculto: \"Corremos ontem.\" (sujeito \"nós\" implícito)\n" +
                    "----- indeterminado: \"Disse-se a verdade.\"",
            resposta = mutableListOf("SUJEITO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =21,
            perguntaText = "é a parte da oração que contém o verbo e informa algo sobre o sujeito. Pode ser verbal, nominal ou verbo-nominal.\n" +
                    "\n" +
                    "------ verbal: \"Ela cantou.\"\n" +
                    "------ nominal: \"Ela é feliz.\"\n" +
                    "------ verbo-nominal: \"Ela saiu contente.\"\n",
            resposta = mutableListOf("PREDICADO"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =22,
            perguntaText = "São termos que completam o sentido dos verbos transitivos. Podem ser objetos diretos ou indiretos.\n" +
                    "\n" +
                    "Objeto direto: \"Ela comprou um livro.\"\n" +
                    "Objeto indireto: \"Ela gosta de livros.\"",
            resposta = mutableListOf("COMPLEMENTO","VERBAIS"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =23,
            perguntaText = "São termos que modificam o verbo, indicando circunstâncias de tempo, modo, lugar, etc.\n" +
                    "\n" +
                    "Exemplo: \"Ela chegou cedo.\"",
            resposta = mutableListOf("ADJUNTOS","ADVERBIAIS"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =24,
            perguntaText = "São termos que se juntam ao núcleo de um substantivo para caracterizá-lo ou determiná-lo.\n" +
                    "\n" +
                    "Exemplo: \"Aquela casa grande é dela.\"\n",
            resposta = mutableListOf("ADJUNTOS","ADNOMINAIS"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =25,
            perguntaText = "Os ------ atribuem uma característica ao sujeito ou ao objeto da oração.\n" +
                    "\n" +
                    "------ do sujeito: \"A noite estava silenciosa.\"\n" +
                    "------ do objeto: \"Eles consideram o projeto importante.\"\n",
            resposta = mutableListOf("PREDICATIVOS"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =26,
            perguntaText = "refere-se ao ajuste gramatical entre os elementos de uma frase para garantir que eles concordem em gênero (masculino/feminino), número (singular/plural) e pessoa (primeira, segunda, terceira). A concordância pode ser nominal ou verbal.\n" +
                    "\n----- verbal: Os alunos estudam.\n"+
                "----- nominal: As flores bonitas murcharam.",
            resposta = mutableListOf("CONCORDÂNCIA"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),Pergunta(
            id =27,
            perguntaText = "trata da relação de dependência entre os termos da oração, especialmente entre verbos e seus complementos.\n" +
                    "\n" +
                    "------- verbal: \"Preciso de ajuda.\"\n" +
                    "------- nominal: \"Amor ao próximo.\"",
            resposta = mutableListOf("REGÊNCIA"),
            temas = Temas.PORTUGUES,
            image = Imagens.VAZIO
        ),
    )
    val anatomiaOssos= mutableListOf(
        Pergunta(
            id =1,
            perguntaText = "O osso mais longo e maior do braço, que se articula com a escápula na articulação do ombro e com os ossos do antebraço na articulação do cotovelo?",
            resposta = mutableListOf("ÚMERO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.UMERO

        ),
        Pergunta(
            id =2,
            perguntaText = "qual e esse osso do Cranio (neurocranio)?",
            resposta = mutableListOf("FRONTAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.FRONTAL
        ),
        Pergunta(
            id =3,
            perguntaText = "qual e esse osso do Cranio (neurocranio)?",
            resposta = mutableListOf("PARIETAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.PARIETAL
        ),
        Pergunta(
            id =4,
            perguntaText = "qual e esse osso do Cranio (neurocranio)?",
            resposta = mutableListOf("OCCIPITAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.OCCIPITAL
        ),
        Pergunta(
            id =5,
            perguntaText = "qual e esse osso do Cranio (neurocranio)?",
            resposta = mutableListOf("TEMPORAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.TEMPORAL
        ),
        Pergunta(
            id =6,
            perguntaText = "qual e esse osso do Cranio (neurocranio)?",
            resposta = mutableListOf("ESFENOIDE"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ESFENOIDE
        ),
        Pergunta(
            id =7,
            perguntaText = "qual e esse osso do Cranio (neurocranio)?",
            resposta = mutableListOf("ETMOIDE"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ETMOIDE
        ),
        Pergunta(
            id =8,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("MANDIBULA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.MANDIBULA
        ),
        Pergunta(
            id =9,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("MAXILAR"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.MAXILAR
        ),
        Pergunta(
            id =10,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("ZIGOMÁTICO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ZIGOMATICO
        ),
        Pergunta(
            id =11,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("NASAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.NASAL
        ),
        Pergunta(
            id =12,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("LACRIMAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.LACRIMAL
        ),
        Pergunta(
            id =13,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("CONCHA","NASAL","INFERIOR"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.CONNASINF
        ),
        Pergunta(
            id =14,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("VÔMER"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.VOMER
        ),
        Pergunta(
            id =15,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("PALATO","DURO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.PALATOD
        ),
        Pergunta(
            id =16,
            perguntaText = "qual e esse osso do Cranio \n (Viscerocrânio (ossos da face))?",
            resposta = mutableListOf("PALATO","MOLE"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.PALATOM
        ),
        Pergunta(
            id =17,
            perguntaText = "Primeira vertebra Cervical que sustenta a cabeça?",
            resposta = mutableListOf("ATLAS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =18,
            perguntaText = "Qual e o conjunto de osso da vertebras\n que possui 7 vertebras?",
            resposta = mutableListOf("CERVICAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.CERVICAL
        ),
        Pergunta(
            id =19,
            perguntaText = "Qual e o conjunto de osso da vertebras\n que possui 12 vertebras?",
            resposta = mutableListOf("TORACICA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.TORACICA
        ),
        Pergunta(
            id =20,
            perguntaText = "Qual e o conjunto de osso da vertebras\n que possui 5 vertebras?",
            resposta = mutableListOf("LOMBAR"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.LOMBAR
        ),
        Pergunta(
            id =21,
            perguntaText = "Qual e o conjunto de osso da vertebras\n que possui 5 vertebras fundidas?",
            resposta = mutableListOf("SACRAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.SACRAL
        ),
        Pergunta(
            id =22,
            perguntaText = "Qual e o conjunto de osso da vertebras\n que possui 4 vertebras fundidas?",
            resposta = mutableListOf("COCCIX"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.COCCIX
        ),
        Pergunta(
            id =23,
            perguntaText = "Qual e a parte superior do esterno,\n onde se conectam as primeiras\n costelas e a clavícula.?",
            resposta = mutableListOf("MANÚBRIO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.MANUBRIO
        ),
        Pergunta(
            id =24,
            perguntaText = "Qual e a parte central e mais longa do esterno, onde \nse conectam as costelas restantes\n (costelas verdadeiras).?",
            resposta = mutableListOf("CORPO","ESTERNO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.CESTERNO
        ),
        Pergunta(
            id =25,
            perguntaText = "Qual a extremidade inferior e pequena do esterno.?",
            resposta = mutableListOf("PROCESSO","XIFOIDE"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.PXIFOIDE
        ),
        Pergunta(
            id =26,
            perguntaText = "Ossos da Caixa Torácica\nQuais costelas Conectam-se diretamente ao \n esterno através de cartilagens costais. 1-7?",
            resposta = mutableListOf("COSTELAS","VERDADEIRAS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.COSTELAS
        ),
        Pergunta(
            id =27,
            perguntaText = "Ossos da Caixa Torácica\nQuais costelas Conectam-se ao esterno\n indiretamente através\n da cartilagem da sétima costela. 8-10?",
            resposta = mutableListOf("COSTELAS","FALSAS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.COSTELAS
        ),
        Pergunta(
            id =28,
            perguntaText = "Ossos da Caixa Torácica\nQuais costelas Não se conectam ao esterno,\n terminando livremente na musculatura da\n parede abdominal 11-12?",
            resposta = mutableListOf("COSTELAS","FLUTUANTES"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.COSTELAS
        ),
        Pergunta(
            id =29,
            perguntaText = "Qual Parte superior e maior do osso\n do quadril?",
            resposta = mutableListOf("ÍLIO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ILIO
        ),
        Pergunta(
            id =30,
            perguntaText = "Qual Parte inferior e posterior do\n osso do quadril?",
            resposta = mutableListOf("ÍSQUIO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ISQUIO
        ),
        Pergunta(
            id =31,
            perguntaText = "Qual Parte anterior do osso do quadril,\n unindo-se na sínfise púbica.?",
            resposta = mutableListOf("PÚBIS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.PUBIS
        ),
        Pergunta(
            id =32,
            perguntaText = "Cintura Escapular :\nqual e osso longo que conecta o esterno à escápula?",
            resposta = mutableListOf("CLAVÍCULA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.CLAVICULA
        ),
        Pergunta(
            id =33,
            perguntaText = "Cintura Escapular :\nConhecida como \"omoplata\", é um osso plano triangular\n localizado na parte superior das costas,\n que se articula com a clavícula e o úmero?",
            resposta = mutableListOf("ESCÁPULA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ESCAPULA
        ),
        Pergunta(
            id =34,
            perguntaText = "Um dos dois ossos longos do antebraço, localizado\n do lado do polegar. Se articula com o úmero no\n cotovelo e com os ossos do carpo no punho?",
            resposta = mutableListOf("RÁDIO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.RADIO
        ),
        Pergunta(
            id =35,
            perguntaText = "Um dos dois ossos longos do antebraço,\n localizado do lado do dedo mínimo. Se articula\n com o úmero no cotovelo e forma \na parte interna do antebraço?",
            resposta = mutableListOf("ULNA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.ULNA
        ),
        Pergunta(
            id =36,
            perguntaText = "Oito pequenos ossos que formam o pulso,\n organizados em duas fileiras e chamado de?",
            resposta = mutableListOf("CARPO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.CARPO
        ),
        Pergunta(
            id =37,
            perguntaText = "Cinco ossos longos que formam a palma da \nmão, numerados de I a V começando pelo polegar.",
            resposta = mutableListOf("METACARPO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.METACARPO
        ),
        Pergunta(
            id =38,
            perguntaText = "Cinco ossos na base dos dedos chamados de",
            resposta = mutableListOf("FALANGES","PROXIMAL"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.FALANGEPRO
        ),
        Pergunta(
            id =39,
            perguntaText = "Quatro ossos no meio dos dedos \n(o polegar não tem falange ----).",
            resposta = mutableListOf("FALANGES","MEDIAS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.FALANGEMED
        ),
        Pergunta(
            id =40,
            perguntaText = "Cinco ossos nas pontas dos dedos",
            resposta = mutableListOf("FALANGES","DISTAIS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.FALANGEDIS
        ),
        Pergunta(
            id =41,
            perguntaText = "O osso mais longo e forte do corpo,\n" +
                    " que se articula com o quadril na articulação do \n" +
                    "quadril e com a tíbia e a patela na articulação do joelho.",
            resposta = mutableListOf("FÊMUR"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.FEMUR
        ),
        Pergunta(
            id =42,
            perguntaText = "Também conhecida como rótula, é um osso\n triangular que protege a articulação do joelho.",
            resposta = mutableListOf("PATELA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.PATELA
        ),
        Pergunta(
            id =43,
            perguntaText = "O osso maior e mais medial da perna,\n que se articula com o fêmur no joelho e com\n os ossos do tornozelo no pé.",
            resposta = mutableListOf("TÍBIA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.TIBIA
        ),
        Pergunta(
            id =44,
            perguntaText = "O osso mais fino e lateral da perna,\n que corre paralelo à tíbia e\n se articula com os ossos do tornozelo.",
            resposta = mutableListOf("FÍBULA"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.FIBULA
        ),
        Pergunta(
            id =45,
            perguntaText = "Sete ossos que formam a parte posterior do pé",
            resposta = mutableListOf("TARSO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.TARSO
        ),
        Pergunta(
            id =46,
            perguntaText = "Cinco ossos longos que formam o arco do pé,\n numerados de I a V começando pelo dedão.",
            resposta = mutableListOf("METATARSO"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.METATARSO
        ),
        Pergunta(
            id =47,
            perguntaText = "Estas facilitam a articulação com a primeira vertebra e a rotação da cabeça.",
            resposta = mutableListOf("AXIS"),
            temas = Temas.ANATOMIA_OSSOS,
            image = Imagens.VAZIO
        ),
        )
    val eticaEnfermagem= mutableListOf(
        Pergunta(
            id = 1,
            perguntaText="essencial para tratar a individualidade de\n forma humanizada :",
            resposta = mutableListOf("COMPORTAMENTO","ÉTICO"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 2,
            perguntaText="Os 7  principios fundamentais :",
            resposta = mutableListOf("HUMANIDADE","IMPARCIALIDADE","NEUTRALIDADE","INDEPENDÊNCIA","VOLUNTARIADO","UNIDADE","UNIVERSALIDADE"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 3,
            perguntaText="Deve assumir propositos claros para construir um saber pratico e vincular esse saber a um contexto etico,social e politico",
            resposta = mutableListOf("GRADUADO","ENFERMAGEM"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 4,
            perguntaText= "Envolve a administração de substâncias letais a uma pessoa com a intenção de causar a morte. Por exemplo, uma injeção letal administrada por um médico.",
            resposta = mutableListOf("EUTANÁSIA","ATIVA"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 5,
            perguntaText= "Consiste em retirar ou suspender tratamentos médicos que estão mantendo a pessoa viva, como a remoção de um ventilador ou a interrupção de medicamentos.",
            resposta = mutableListOf("EUTANÁSIA","PASSIVA"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 6,
            perguntaText= "Envolve permitir que a morte ocorra de maneira natural e com o máximo de conforto possível, sem intervenção ativa para acelerar ou retardar o processo de morrer.",
            resposta = mutableListOf("ORTOTANÁSIA"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 7,
            perguntaText= "Envolve a utilização de tratamentos médicos extraordinários que mantêm o paciente vivo artificialmente, muitas vezes em detrimento da qualidade de vida.",
            resposta = mutableListOf("DISTANÁSIA"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 8,
            perguntaText= " CAPÍTULO I – DOS DIREITOS : Exercer a Enfermagem com liberdade, segurança técnica, científica e ambiental, autonomia, e ser tratado sem discriminação de qualquer natureza, segundo os princípios e pressupostos legais, éticos e dos direitos humanos.",
            resposta = mutableListOf("ART. 1º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 9,
            perguntaText= " CAPÍTULO I – DOS DIREITOS : Exercer atividades em locais de trabalho livre de riscos e danos e violências física e psicológica à saúde do trabalhador, em respeito à dignidade humana e à proteção dos direitos dos profissionais de enfermagem.",
            resposta = mutableListOf("ART. 2º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 10,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Apoiar e/ou participar de movimentos de defesa da dignidade profissional, do exercício da cidadania e das reivindicações por melhores condições de assistência, trabalho e remuneração, observados os parâmetros e limites da legislação vigente.",
            resposta = mutableListOf("ART. 3º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 11,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Participar da prática multiprofissional, interdisciplinar e transdisciplinar com responsabilidade, autonomia e liberdade, observando os preceitos éticos e legais da profissão.",
            resposta = mutableListOf("ART. 4º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 12,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Associar-se, exercer cargos e participar de Organizações da Categoria e Órgãos de Fiscalização do Exercício Profissional, atendidos os requisitos legais.",
            resposta = mutableListOf("ART. 5º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 13,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Aprimorar seus conhecimentos técnico-científicos, ético-políticos, socioeducativos, históricos e culturais que dão sustentação à prática profissional.",
            resposta = mutableListOf("ART. 6º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 14,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Ter acesso às informações relacionadas à pessoa, família e coletividade, necessárias ao exercício profissional.",
            resposta = mutableListOf("ART. 7º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 15,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Requerer ao Conselho Regional de Enfermagem, de forma fundamentada, medidas cabíveis para obtenção de desagravo público em decorrência de ofensa sofrida no exercício profissional ou que atinja a profissão.",
            resposta = mutableListOf("ART. 8º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 16,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Recorrer ao Conselho Regional de Enfermagem, de forma fundamentada, quando impedido de cumprir o presente Código, a Legislação do Exercício Profissional e as Resoluções, Decisões e Pareceres Normativos emanados pelo Sistema Cofen/Conselhos Regionais de Enfermagem",
            resposta = mutableListOf("ART. 9º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 17,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Ter acesso, pelos meios de informação disponíveis, às diretrizes políticas, normativas e protocolos institucionais, bem como participar de sua elaboração.",
            resposta = mutableListOf("ART. 10º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 18,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Formar e participar da Comissão de Ética de Enfermagem, bem como de comissões interdisciplinares da instituição em que trabalha.",
            resposta = mutableListOf("ART. 11º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 19,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Abster-se de revelar informações confidenciais de que tenha conhecimento em razão de seu exercício profissional.",
            resposta = mutableListOf("ART. 12º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 20,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Suspender as atividades, individuais ou coletivas, quando o local de trabalho não oferecer condições seguras para o exercício profissional e/ou desrespeitar a legislação vigente, ressalvadas as situações de urgência e emergência, devendo formalizar imediatamente sua decisão por escrito e/ou por meio de correio eletrônico à instituição e ao Conselho Regional de Enfermagem.",
            resposta = mutableListOf("ART. 13º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 21,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Aplicar o processo de Enfermagem como instrumento metodológico para planejar, implementar, avaliar e documentar o cuidado à pessoa, família e coletividade.",
            resposta = mutableListOf("ART. 14º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 22,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Exercer cargos de direção, gestão e coordenação, no âmbito da saúde ou de qualquer área direta ou indiretamente relacionada ao exercício profissional da Enfermagem.",
            resposta = mutableListOf("ART. 15º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 23,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Conhecer as atividades de ensino, pesquisa e extensão que envolvam pessoas e/ou local de trabalho sob sua responsabilidade profissional.",
            resposta = mutableListOf("ART. 16º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 24,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Realizar e participar de atividades de ensino, pesquisa e extensão, respeitando a legislação vigente.",
            resposta = mutableListOf("ART. 17º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 25,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Ter reconhecida sua autoria ou participação em pesquisa, extensão e produção técnico-científica.",
            resposta = mutableListOf("ART. 18º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 26,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Utilizar-se de veículos de comunicação, mídias sociais e meios eletrônicos para conceder entrevistas, ministrar cursos, palestras, conferências, sobre assuntos de sua competência e/ou divulgar eventos com finalidade educativa e de interesse social.",
            resposta = mutableListOf("ART. 19º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 27,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Anunciar a prestação de serviços para os quais detenha habilidades e competências técnico-científicas e legais.",
            resposta = mutableListOf("ART. 20º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 28,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Negar-se a ser filmado, fotografado e exposto em mídias sociais durante o desempenho de suas atividades profissionais.",
            resposta = mutableListOf("ART. 21º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 29,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Recusar-se a executar atividades que não sejam de sua competência técnica, científica, ética e legal ou que não ofereçam segurança ao profissional, à pessoa, à família e à coletividade.",
            resposta = mutableListOf("ART. 22º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 30,
            perguntaText= "CAPÍTULO I – DOS DIREITOS : Requerer junto ao gestor a quebra de vínculo da relação profissional/usuários quando houver risco à sua integridade física e moral, comunicando ao Coren e assegurando a continuidade da assistência de Enfermagem.",
            resposta = mutableListOf("ART. 23º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 31,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Exercer a profissão com justiça, compromisso, equidade, resolutividade, dignidade, competência, responsabilidade, honestidade e lealdade.",
            resposta = mutableListOf("ART. 24º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id =32 ,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Fundamentar suas relações no direito, na prudência, no respeito, na solidariedade e na diversidade de opinião e posição ideológica. ",
            resposta = mutableListOf("ART. 25º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 33,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Conhecer, cumprir e fazer cumprir o Código de Ética dos Profissionais de Enfermagem e demais normativos do Sistema Cofen/Conselhos Regionais de Enfermagem.",
            resposta = mutableListOf("ART. 26º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 34,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Incentivar e apoiar a participação dos profissionais de Enfermagem no desempenho de atividades em organizações da categoria.\n",
            resposta = mutableListOf("ART. 27º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 35,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Comunicar formalmente ao Conselho Regional de Enfermagem e aos órgãos competentes fatos que infrinjam dispositivos éticos-legais e que possam prejudicar o exercício profissional e a segurança à saúde da pessoa, família e coletividade.\n",
            resposta = mutableListOf("ART. 28º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 36 ,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Comunicar formalmente, ao Conselho Regional de Enfermagem, fatos que envolvam recusa e/ou demissão de cargo, função ou emprego, motivado pela necessidade do profissional em cumprir o presente Código e a legislação do exercício profissional.\n",
            resposta = mutableListOf("ART. 29º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id =37 ,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Cumprir, no prazo estabelecido, determinações, notificações, citações, convocações e intimações do Sistema Cofen/Conselhos Regionais de Enfermagem.\n",
            resposta = mutableListOf("ART. 30º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 38,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Colaborar com o processo de fiscalização do exercício profissional e prestar informações fidedignas, permitindo o acesso a documentos e a área física institucional.",
            resposta = mutableListOf("ART. 31º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 39,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Manter inscrição no Conselho Regional de Enfermagem, com jurisdição na área onde ocorrer o exercício profissional.",
            resposta = mutableListOf("ART. 32º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 40,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Manter os dados cadastrais atualizados junto ao Conselho Regional de Enfermagem de sua jurisdição.\n",
            resposta = mutableListOf("ART. 33º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 41,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Manter regularizadas as obrigações financeiras junto ao Conselho Regional de Enfermagem de sua jurisdição.",
            resposta = mutableListOf("ART. 34º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 42,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Apor nome completo e/ou nome social, ambos legíveis, número e categoria de inscrição no Conselho Regional de Enfermagem, assinatura ou rubrica nos documentos, quando no exercício profissional." +
                    "§ 1º É facultado o uso do carimbo, com nome completo, número e categoria de inscrição no Coren, devendo constar a assinatura ou rubrica do profissional.\n" +
                    "\n" +
                    "§ 2º Quando se tratar de prontuário eletrônico, a assinatura deverá ser certificada, conforme legislação vigente.",
            resposta = mutableListOf("ART. 35º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 43,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Registrar no prontuário e em outros documentos as informações inerentes e indispensáveis ao processo de cuidar de forma clara, objetiva, cronológica, legível, completa e sem rasuras.",
            resposta = mutableListOf("ART. 36º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 44,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Documentar formalmente as etapas do processo de Enfermagem, em consonância com sua competência legal.\n" +
                    "\n",
            resposta = mutableListOf("ART. 37º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 45,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Prestar informações escritas e/ou verbais, completas e fidedignas, necessárias à continuidade da assistência e segurança do paciente.\n" +
                    "\n",
            resposta = mutableListOf("ART. 38º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 46,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Esclarecer à pessoa, família e coletividade, a respeito dos direitos, riscos, benefícios e intercorrências acerca da assistência de Enfermagem.\n",
            resposta = mutableListOf("ART. 39º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 47,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Orientar à pessoa e família sobre preparo, benefícios, riscos e consequências decorrentes de exames e de outros procedimentos, respeitando o direito de recusa da pessoa ou de seu representante legal.\n" +
                    "\n",
            resposta = mutableListOf("ART. 40º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 48,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Prestar assistência de Enfermagem sem discriminação de qualquer natureza.\n",
            resposta = mutableListOf("ART. 41º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 49,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Respeitar o direito do exercício da autonomia da pessoa ou de seu representante legal na tomada de decisão, livre e esclarecida, sobre sua saúde, segurança, tratamento, conforto, bem-estar, realizando ações necessárias, de acordo com os princípios éticos e legais.\n" +
                    "\n" +
                    "Parágrafo único. Respeitar as diretivas antecipadas da pessoa no que concerne às decisões sobre cuidados e tratamentos que deseja ou não receber no momento em que estiver incapacitado de expressar, livre e autonomamente, suas vontades.",
            resposta = mutableListOf("ART. 42º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 50,
            perguntaText= "CAPÍTULO II – DOS DEVERES :Respeitar o pudor, a privacidade e a intimidade da pessoa, em todo seu ciclo vital e nas situações de morte e pós-morte.\n" +
                    "\n ",
            resposta = mutableListOf("ART. 43º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 51,
            perguntaText = "CAPÍTULO II – DOS DEVERES: Prestar assistência de Enfermagem em condições que ofereçam segurança, mesmo em caso de suspensão das atividades profissionais decorrentes de movimentos reivindicatórios da categoria. \n" +
                    "Parágrafo único. Será respeitado o direito de greve e, nos casos de movimentos reivindicatórios da categoria, deverão ser prestados os cuidados mínimos que garantam uma assistência segura, conforme a complexidade do paciente",
            resposta = mutableListOf("ART. 44º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 52,
            perguntaText = "CAPÍTULO II – DOS DEVERES: Prestar assistência de Enfermagem livre de danos decorrentes de imperícia, negligência ou imprudência.",
            resposta = mutableListOf("ART. 45º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 53,
            perguntaText = "CAPÍTULO II – DOS DEVERES: Recusar-se a executar prescrição de Enfermagem e Médica na qual não constem assinatura e número de registro do profissional prescritor, exceto em situação de urgência e emergência."+"\n"+
            "§ 1º O profissional de Enfermagem deverá recusar-se a executar prescrição de Enfermagem e Médica em caso de identificação de erro e/ou ilegibilidade da mesma, devendo esclarecer com o prescritor ou outro profissional, registrando no prontuário.\n" +
                    "\n" +
                    "§ 2º É vedado ao profissional de Enfermagem o cumprimento de prescrição à distância, exceto em casos de urgência e emergência e regulação, conforme Resolução vigente.",
            resposta = mutableListOf("ART. 46º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 54,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Posicionar-se contra, e denunciar aos órgãos competentes, ações e procedimentos de membros da equipe de saúde, quando houver risco de danos decorrentes de imperícia, negligência e imprudência ao paciente, visando a proteção da pessoa, família e coletividade.",
            resposta = mutableListOf("ART. 47º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 55,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Prestar assistência de Enfermagem promovendo a qualidade de vida à pessoa e família no processo do nascer, viver, morrer e luto.\n" +
                    "Parágrafo único. Nos casos de doenças graves incuráveis e terminais com risco iminente de morte, em consonância com a equipe multiprofissional, oferecer todos os cuidados paliativos disponíveis para assegurar o conforto físico, psíquico, social e espiritual, respeitada a vontade da pessoa ou de seu representante legal.",
            resposta = mutableListOf("ART. 48º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 56,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Disponibilizar assistência de Enfermagem à coletividade em casos de emergência, epidemia, catástrofe e desastre, sem pleitear vantagens pessoais, quando convocado.",
            resposta = mutableListOf("ART. 49º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 57,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Assegurar a prática profissional mediante consentimento prévio do paciente, representante ou responsável legal, ou decisão judicial.\n" +
                    "\n" +
                    "Parágrafo único. Ficam resguardados os casos em que não haja capacidade de decisão por parte da pessoa, ou na ausência do representante ou responsável legal.",
            resposta = mutableListOf("ART. 50º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 58,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Responsabilizar-se por falta cometida em suas atividades profissionais, independentemente de ter sido praticada individual ou em equipe, por imperícia, imprudência ou negligência, desde que tenha participação e/ou conhecimento prévio do fato.\n" +
                    "\n" +
                    "Parágrafo único. Quando a falta for praticada em equipe, a responsabilidade será atribuída na medida do(s) ato(s) praticado(s) individualmente.\n" +
                    "\n",
            resposta = mutableListOf("ART. 51º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 59,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Manter sigilo sobre fato de que tenha conhecimento em razão da atividade profissional, exceto nos casos previstos na legislação ou por determinação judicial, ou com o consentimento escrito da pessoa envolvida ou de seu representante ou responsável legal.\n" +
                    "\n" +
                    "§ 1º Permanece o dever mesmo quando o fato seja de conhecimento público e em caso de falecimento da pessoa envolvida.\n" +
                    "\n" +
                    "§ 2º O fato sigiloso deverá ser revelado em situações de ameaça à vida e à dignidade, na defesa própria ou em atividade multiprofissional, quando necessário à prestação da assistência.\n" +
                    "\n" +
                    "§ 3º O profissional de Enfermagem intimado como testemunha deverá comparecer perante a autoridade e, se for o caso, declarar suas razões éticas para manutenção do sigilo profissional.\n" +
                    "\n" +
                    "§ 4º É obrigatória a comunicação externa, para os órgãos de responsabilização criminal, independentemente de autorização, de casos de violência contra: crianças e adolescentes; idosos; e pessoas incapacitadas ou sem condições de firmar consentimento.\n" +
                    "\n" +
                    "§ 5º A comunicação externa para os órgãos de responsabilização criminal em casos de violência doméstica e familiar contra mulher adulta e capaz será devida, independentemente de autorização, em caso de risco à comunidade ou à vítima, a juízo do profissional e com conhecimento prévio da vítima ou do seu responsável.",
            resposta = mutableListOf("ART. 52º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 60,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Resguardar os preceitos éticos e legais da profissão quanto ao conteúdo e imagem veiculados nos diferentes meios de comunicação e publicidade.\n" +
                    "\n",
            resposta = mutableListOf("ART. 53º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 61,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Estimular e apoiar a qualificação e o aperfeiçoamento técnico-científico, ético-político, socioeducativo e cultural dos profissionais de Enfermagem sob sua supervisão e coordenação.",
            resposta = mutableListOf("ART. 54º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 62,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Aprimorar os conhecimentos técnico-científicos, ético-políticos, socioeducativos e culturais, em benefício da pessoa, família e coletividade e do desenvolvimento da profissão.",
            resposta = mutableListOf("ART. 55º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 63,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Estimular, apoiar, colaborar e promover o desenvolvimento de atividades de ensino, pesquisa e extensão, devidamente aprovados nas instâncias deliberativas.\n" +
                    "\n",
            resposta = mutableListOf("ART. 56º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 64,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Cumprir a legislação vigente para a pesquisa envolvendo seres humanos.\n" +
                    "\n",
            resposta = mutableListOf("ART. 57º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 65,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Respeitar os princípios éticos e os direitos autorais no processo de pesquisa, em todas as etapas.\n" +
                    "\n",
            resposta = mutableListOf("ART. 58º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 66,
            perguntaText= "CAPÍTULO II – DOS DEVERES : Somente aceitar encargos ou atribuições quando se julgar técnica, científica e legalmente apto para o desempenho seguro para si e para outrem.\n" +
                    "\n",
            resposta = mutableListOf("ART. 59º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 67,
            perguntaText= "CAPÍTULO II – DOS DEVERES :Respeitar, no exercício da profissão, a legislação vigente relativa à preservação do meio ambiente no gerenciamento de resíduos de serviços de saúde.\n" +
                    "\n ",
            resposta = mutableListOf("ART. 60º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 68,
            perguntaText= " CAPÍTULO III – DAS PROIBIÇÕES : Executar e/ou determinar atos contrários ao Código de Ética e à legislação que disciplina o exercício da Enfermagem.\n" +
                    "\n",
            resposta = mutableListOf("ART. 61º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 69,
            perguntaText= " CAPÍTULO III – DAS PROIBIÇÕES : Executar atividades que não sejam de sua competência técnica, científica, ética e legal ou que não ofereçam segurança ao profissional, à pessoa, à família e à coletividade",
            resposta = mutableListOf("ART. 62º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 70,
            perguntaText= " CAPÍTULO III – DAS PROIBIÇÕES : Colaborar ou acumpliciar-se com pessoas físicas ou jurídicas que desrespeitem a legislação e princípios que disciplinam o exercício profissional de Enfermagem.",
            resposta = mutableListOf("ART. 63º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 71,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Provocar, cooperar, ser conivente ou omisso diante de qualquer forma ou tipo de violência contra a pessoa, família e coletividade, quando no exercício da profissão.",
            resposta = mutableListOf("ART. 64º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 72,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Aceitar cargo, função ou emprego vago em decorrência de fatos que envolvam recusa ou demissão motivada pela necessidade do profissional em cumprir o presente código e a legislação do exercício profissional; bem como pleitear cargo, função ou emprego ocupado por colega, utilizando-se de concorrência desleal.",
            resposta = mutableListOf("ART. 65º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 73,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Permitir que seu nome conste no quadro de pessoal de qualquer instituição ou estabelecimento congênere, quando, nestas, não exercer funções de enfermagem estabelecidas na legislação.",
            resposta = mutableListOf("ART. 66º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 74,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Receber vantagens de instituição, empresa, pessoa, família e coletividade, além do que lhe é devido, como forma de garantir assistência de Enfermagem diferenciada ou benefícios de qualquer natureza para si ou para outrem.",
            resposta = mutableListOf("ART. 67º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 75,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Valer-se, quando no exercício da profissão, de mecanismos de coação, omissão ou suborno, com pessoas físicas ou jurídicas, para conseguir qualquer tipo de vantagem.",
            resposta = mutableListOf("ART. 68º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 76,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Utilizar o poder que lhe confere a posição ou cargo, para impor ou induzir ordens, opiniões, ideologias políticas ou qualquer tipo de conceito ou preconceito que atentem contra a dignidade da pessoa humana, bem como dificultar o exercício profissional.\n" +
                    "\n",
            resposta = mutableListOf("ART. 69º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 77,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Utilizar dos conhecimentos de enfermagem para praticar atos tipificados como crime ou contravenção penal, tanto em ambientes onde exerça a profissão, quanto naqueles em que não a exerça, ou qualquer ato que infrinja os postulados éticos e legais.\n" +
                    "\n",
            resposta = mutableListOf("ART. 70º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 78,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Promover ou ser conivente com injúria, calúnia e difamação de pessoa e família, membros das equipes de Enfermagem e de saúde, organizações da Enfermagem, trabalhadores de outras áreas e instituições em que exerce sua atividade profissional.\n" +
                    "\n",
            resposta = mutableListOf("ART. 71º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 79,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Praticar ou ser conivente com crime, contravenção penal ou qualquer outro ato que infrinja postulados éticos e legais, no exercício profissional.\n" +
                    "\n",
            resposta = mutableListOf("ART. 72º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 80,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Provocar aborto, ou cooperar em prática destinada a interromper a gestação, exceto nos casos permitidos pela legislação vigente.\n" +
                    "\n" +
                    "Parágrafo único. Nos casos permitidos pela legislação, o profissional deverá decidir de acordo com a sua consciência sobre sua participação, desde que seja garantida a continuidade da assistência.",
            resposta = mutableListOf("ART. 73º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 81,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Promover ou participar de prática destinada a antecipar a morte da pessoa.\n" +
                    "\n",
            resposta = mutableListOf("ART. 74º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 82,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Praticar ato cirúrgico, exceto nas situações de emergência ou naquelas expressamente autorizadas na legislação, desde que possua competência técnica-científica necessária.",
            resposta = mutableListOf("ART. 75º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 83,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Negar assistência de enfermagem em situações de urgência, emergência, epidemia, desastre e catástrofe, desde que não ofereça risco a integridade física do profissional.",
            resposta = mutableListOf("ART. 76º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 84,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Executar procedimentos ou participar da assistência à saúde sem o consentimento formal da pessoa ou de seu representante ou responsável legal, exceto em iminente risco de morte.",
            resposta = mutableListOf("ART. 77º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 85,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Administrar medicamentos sem conhecer indicação, ação da droga, via de administração e potenciais riscos, respeitados os graus de formação do profissional.",
            resposta = mutableListOf("ART. 78º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 86,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Prescrever medicamentos que não estejam estabelecidos em programas de saúde pública e/ou em rotina aprovada em instituição de saúde, exceto em situações de emergência.",
            resposta = mutableListOf("ART. 79º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 87,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Executar prescrições e procedimentos de qualquer natureza que comprometam a segurança da pessoa.\n" +
                    "\n",
            resposta = mutableListOf("ART. 80º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 88,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Prestar serviços que, por sua natureza, competem a outro profissional, exceto em caso de emergência, ou que estiverem expressamente autorizados na legislação vigente.",
            resposta = mutableListOf("ART. 81º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 89,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Colaborar, direta ou indiretamente, com outros profissionais de saúde ou áreas vinculadas, no descumprimento da legislação referente aos transplantes de órgãos, tecidos, esterilização humana, reprodução assistida ou manipulação genética.\n" +
                    "\n",
            resposta = mutableListOf("ART. 82º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 90,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Praticar, individual ou coletivamente, quando no exercício profissional, assédio moral, sexual ou de qualquer natureza, contra pessoa, família, coletividade ou qualquer membro da equipe de saúde, seja por meio de atos ou expressões que tenham por consequência atingir a dignidade ou criar condições humilhantes e constrangedoras.\n" +
                    "\n",
            resposta = mutableListOf("ART. 83º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 91,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Anunciar formação profissional, qualificação e título que não possa comprovar.\n" +
                    "\n",
            resposta = mutableListOf("ART. 84º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 92,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Realizar ou facilitar ações que causem prejuízo ao patrimônio das organizações da categoria.\n" +
                    "\n",
            resposta = mutableListOf("ART. 85º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 93,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Produzir, inserir ou divulgar informação inverídica ou de conteúdo duvidoso sobre assunto de sua área profissional.\n" +
                    "\n" +
                    "Parágrafo único. Fazer referência a casos, situações ou fatos, e inserir imagens que possam identificar pessoas ou instituições sem prévia autorização, em qualquer meio de comunicação.",
            resposta = mutableListOf("ART. 86º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 94,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Registrar informações incompletas, imprecisas ou inverídicas sobre a assistência de Enfermagem prestada à pessoa, família ou coletividade.\n" +
                    "\n",
            resposta = mutableListOf("ART. 87º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 95,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Registrar e assinar as ações de Enfermagem que não executou, bem como permitir que suas ações sejam assinadas por outro profissional.\n" +
                    "\n",
            resposta = mutableListOf("ART. 88º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 96,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES :Disponibilizar o acesso a informações e documentos a terceiros que não estão diretamente envolvidos na prestação da assistência de saúde ao paciente, exceto quando autorizado pelo paciente, representante legal ou responsável legal, por determinação judicial.\n" +
                    "\n ",
            resposta = mutableListOf("ART. 89º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 97,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Negar, omitir informações ou emitir falsas declarações sobre o exercício profissional quando solicitado pelo Conselho Regional de Enfermagem e/ou Comissão de Ética de Enfermagem.\n" +
                    "\n",
            resposta = mutableListOf("ART. 90º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 98,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Delegar atividades privativas do(a) Enfermeiro(a) a outro membro da equipe de Enfermagem, exceto nos casos de emergência.\n" +
                    "\n" +
                    " Parágrafo único. Fica proibido delegar atividades privativas a outros membros da equipe de saúde.\n" +
                    "\n",
            resposta = mutableListOf("ART. 91º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 99,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Delegar atribuições dos(as) profissionais de enfermagem, previstas na legislação, para acompanhantes e/ou responsáveis pelo paciente.\n" +
                    "\n" +
                    "Parágrafo único. O dispositivo no caput não se aplica nos casos da atenção domiciliar para o autocuidado apoiado.\n" +
                    "\n",
            resposta = mutableListOf("ART. 92º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 100,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Eximir-se da responsabilidade legal da assistência prestada aos pacientes sob seus cuidados realizados por alunos e/ou estagiários sob sua supervisão e/ou orientação.",
            resposta = mutableListOf("ART. 93º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 101,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Apropriar-se de dinheiro, valor, bem móvel ou imóvel, público ou particular, que esteja sob sua responsabilidade em razão do cargo ou do exercício profissional, bem como desviá-lo em proveito próprio ou de outrem",
            resposta = mutableListOf("ART. 94º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 102,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Realizar ou participar de atividades de ensino, pesquisa e extensão, em que os direitos inalienáveis da pessoa, família e coletividade sejam desrespeitados ou ofereçam quaisquer tipos de riscos ou danos previsíveis aos envolvidos.\n" +
                    "\n",
            resposta = mutableListOf("ART. 95º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 103,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Sobrepor o interesse da ciência ao interesse e segurança da pessoa, família e coletividade.\n" +
                    "\n",
            resposta = mutableListOf("ART. 96º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 104,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Falsificar ou manipular resultados de pesquisa, bem como usá-los para fins diferentes dos objetivos previamente estabelecidos.\n" +
                    "\n",
            resposta = mutableListOf("ART. 97º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 105,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Publicar resultados de pesquisas que identifiquem o participante do estudo e/ou instituição envolvida, sem a autorização prévia.\n" +
                    "\n",
            resposta = mutableListOf("ART. 98º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 106,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Divulgar ou publicar, em seu nome, produção técnico-científica ou instrumento de organização formal do qual não tenha participado ou omitir nomes de coautores e colaboradores.",
            resposta = mutableListOf("ART. 99º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 107,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Utilizar dados, informações, ou opiniões ainda não publicadas, sem referência do autor ou sem a sua autorização.\n" +
                    "\n",
            resposta = mutableListOf("ART. 100º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 108,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Apropriar-se ou utilizar produções técnico-científicas, das quais tenha ou não participado como autor, sem concordância ou concessão dos demais partícipes.",
            resposta = mutableListOf("ART. 101º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 109,
            perguntaText= "CAPÍTULO III – DAS PROIBIÇÕES : Aproveitar-se de posição hierárquica para fazer constar seu nome como autor ou coautor em obra técnico-científica.\n" +
                    "\n ",
            resposta = mutableListOf("ART. 102º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 110,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : A caracterização das infrações éticas e disciplinares, bem como a aplicação das respectivas penalidades regem-se por este Código, sem prejuízo das sanções previstas em outros dispositivos legais.",
            resposta = mutableListOf("ART. 103º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),
        Pergunta(
            id = 111,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : Considera-se infração ética e disciplinar a ação, omissão ou conivência que implique em desobediência e/ou inobservância às disposições do Código de Ética dos Profissionais de Enfermagem, bem como a inobservância das normas do Sistema Cofen/Conselhos Regionais de Enfermagem.\n" +
                    "\n",
            resposta = mutableListOf("ART. 104º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 112,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : O(a) Profissional de Enfermagem responde pela infração ética e/ou disciplinar, que cometer ou contribuir para sua prática, e, quando cometida(s) por outrem, dela(s) obtiver benefício.",
            resposta = mutableListOf("ART. 105º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 113,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : A gravidade da infração é caracterizada por meio da análise do(s) fato(s), do(s) ato(s) praticado(s) ou ato(s) omissivo(s), e do(s) resultado(s).\n" +
                    "\n",
            resposta = mutableListOf("ART. 106º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 114,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : A infração é apurada em processo instaurado e conduzido nos termos do Código de Processo Ético-Disciplinar vigente, aprovado pelo Conselho Federal de Enfermagem.",
            resposta = mutableListOf("ART. 107º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 115,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : As penalidades a serem impostas pelo Sistema Cofen/Conselhos Regionais de Enfermagem, conforme o que determina o art. 18, da Lei n° 5.905, de 12 de julho de 1973, são as seguintes:\n" +
                    "\n" +
                    "I – Advertência verbal;\n" +
                    "\n" +
                    "II – Multa;\n" +
                    "\n" +
                    "III – Censura;\n" +
                    "\n" +
                    "IV – Suspensão do Exercício Profissional;\n" +
                    "\n" +
                    "V – Cassação do direito ao Exercício Profissional.\n" +
                    "\n" +
                    "§ 1º A advertência verbal consiste na admoestação ao infrator, de forma reservada, que será registrada no prontuário do mesmo, na presença de duas testemunhas.\n" +
                    "\n" +
                    "§ 2º A multa consiste na obrigatoriedade de pagamento de 01 (um) a 10 (dez) vezes o valor da anuidade da categoria profissional à qual pertence o infrator, em vigor no ato do pagamento.\n" +
                    "\n" +
                    "§ 3º A censura consiste em repreensão que será divulgada nas publicações oficiais do Sistema Cofen/Conselhos Regionais de Enfermagem e em jornais de grande circulação.\n" +
                    "\n" +
                    "§ 4º A suspensão consiste na proibição do exercício profissional da Enfermagem por um período de até 90 (noventa) dias e será divulgada nas publicações oficiais do Sistema Cofen/Conselhos Regionais de Enfermagem, jornais de grande circulação e comunicada aos órgãos empregadores.\n" +
                    "\n" +
                    "§ 5º A cassação consiste na perda do direito ao exercício da Enfermagem por um período de até 30 anos e será divulgada nas publicações do Sistema Cofen/Conselhos Regionais de Enfermagem e em jornais de grande circulação.\n" +
                    "\n" +
                    "§ 6º As penalidades aplicadas deverão ser registradas no prontuário do infrator.\n" +
                    "\n" +
                    "§ 7º Nas penalidades de suspensão e cassação, o profissional terá sua carteira retida no ato da notificação, em todas as categorias em que for inscrito, sendo devolvida após o cumprimento da pena e, no caso da cassação, após o processo de reabilitação.\n" +
                    "\n",
            resposta = mutableListOf("ART. 108º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 116,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : As penalidades, referentes à advertência verbal, multa, censura e suspensão do exercício profissional, são da responsabilidade do Conselho Regional de Enfermagem, serão registradas no prontuário do profissional de Enfermagem; a pena de cassação do direito ao exercício profissional é de competência do Conselho Federal de Enfermagem, conforme o disposto no art. 18, parágrafo primeiro, da Lei n° 5.905/73.\n" +
                    "\n" +
                    "Parágrafo único. Na situação em que o processo tiver origem no Conselho Federal de Enfermagem e nos casos de cassação do exercício profissional, terá como instância superior a Assembleia de Presidentes dos Conselhos de Enfermagem.\n" +
                    "\n",
            resposta = mutableListOf("ART. 109º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 117,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : Para a graduação da penalidade e respectiva imposição consideram-se:\n" +
                    "\n" +
                    "I – A gravidade da infração;\n" +
                    "\n" +
                    "II – As circunstâncias agravantes e atenuantes da infração;\n" +
                    "\n" +
                    "III – O dano causado e o resultado;\n" +
                    "\n" +
                    "IV – Os antecedentes do infrator.",
            resposta = mutableListOf("ART. 110º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id = 118,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : As infrações serão consideradas leves, moderadas, graves ou gravíssimas, segundo a natureza do ato e a circunstância de cada caso.\n" +
                    "\n" +
                    "§ 1º São consideradas infrações leves as que ofendam a integridade física, mental ou moral de qualquer pessoa, sem causar debilidade ou aquelas que venham a difamar organizações da categoria ou instituições ou ainda que causem danos patrimoniais ou financeiros.\n" +
                    "\n" +
                    "§ 2º São consideradas infrações moderadas as que provoquem debilidade temporária de membro, sentido ou função na pessoa ou ainda as que causem danos mentais, morais, patrimoniais ou financeiros.\n" +
                    "\n" +
                    "§ 3º São consideradas infrações graves as que provoquem perigo de morte, debilidade permanente de membro, sentido ou função, dano moral irremediável na pessoa ou ainda as que causem danos mentais, morais, patrimoniais ou financeiros.\n" +
                    "\n" +
                    "§ 4º São consideradas infrações gravíssimas as que provoquem a morte, debilidade permanente de membro, sentido ou função, dano moral irremediável na pessoa.",
            resposta = mutableListOf("ART. 111º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id =119 ,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : São consideradas circunstâncias atenuantes:\n" +
                    "\n" +
                    "I – Ter o infrator procurado, logo após a infração, por sua espontânea vontade e com eficiência, evitar ou minorar as consequências do seu ato;\n" +
                    "\n" +
                    "II – Ter bons antecedentes profissionais;\n" +
                    "\n" +
                    "III – Realizar atos sob coação e/ou intimidação ou grave ameaça;\n" +
                    "\n" +
                    "IV – Realizar atos sob emprego real de força física;\n" +
                    "\n" +
                    "V – Ter confessado espontaneamente a autoria da infração;\n" +
                    "\n" +
                    "VI – Ter colaborado espontaneamente com a elucidação dos fatos.\n" +
                    "\n",
            resposta = mutableListOf("ART. 112º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        ),Pergunta(
            id =120 ,
            perguntaText= "CAPÍTULO IV – DAS INFRAÇÕES E PENALIDADES : São consideradas circunstâncias agravantes:\n" +
                    "\n" +
                    "I – Ser reincidente;\n" +
                    "\n" +
                    "II – Causar danos irreparáveis;\n" +
                    "\n" +
                    "III – Cometer infração dolosamente;\n" +
                    "\n" +
                    "IV – Cometer a infração por motivo fútil ou torpe;\n" +
                    "\n" +
                    "V – Facilitar ou assegurar a execução, a ocultação, a impunidade ou a vantagem de outra infração;\n" +
                    "\n" +
                    "VI – Aproveitar-se da fragilidade da vítima;\n" +
                    "\n" +
                    "VII – Cometer a infração com abuso de autoridade ou violação do dever inerente ao cargo ou função ou exercício profissional;\n" +
                    "\n" +
                    "VIII – Ter maus antecedentes profissionais;\n" +
                    "\n" +
                    "IX – Alterar ou falsificar prova, ou concorrer para a desconstrução de fato que se relacione com o apurado na denúncia durante a condução do processo ético.\n" +
                    "\n",
            resposta = mutableListOf("ART. 113º"),
            temas = Temas.ETICAEN,
            image = Imagens.VAZIO
        )
    )
    val procedimentosEnfermagem= mutableListOf(
        Pergunta(
            id = 1,
            perguntaText = "",
            resposta = mutableListOf(" "),
            temas = Temas.PROCEDIMENTOSEM,
            image = Imagens.VAZIO
        )
    )



}