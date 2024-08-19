package com.example.quizz.data.local.image

import com.example.quizz.R

enum class Imagens {
    UMERO,VAZIO,FRONTAL,PARIETAL,OCCIPITAL,TEMPORAL,ESFENOIDE, ETMOIDE, MANDIBULA, MAXILAR, ZIGOMATICO, NASAL,LACRIMAL,CONNASINF,
    VOMER, PALATOD, PALATOM, CERVICAL, TORACICA, LOMBAR, SACRAL, COCCIX, MANUBRIO, CESTERNO, PXIFOIDE,COSTELAS, ILIO, ISQUIO, PUBIS,
    CLAVICULA, ESCAPULA, RADIO, ULNA, CARPO, METACARPO, FALANGEPRO, FALANGEMED, FALANGEDIS, FEMUR, PATELA, TIBIA, FIBULA, TARSO, METATARSO;

    fun valor()=
        when(this){
            UMERO-> R.drawable.umero
            FRONTAL->R.drawable.frontal
            PARIETAL->R.drawable.parietal
            OCCIPITAL->R.drawable.occipital
            TEMPORAL->R.drawable.temporal
            ESFENOIDE->R.drawable.esfenoide
            ETMOIDE->R.drawable.etmoide
            MANDIBULA->R.drawable.mandibula
            MAXILAR->R.drawable.maxilar
            ZIGOMATICO->R.drawable.zigomatico
            NASAL->R.drawable.nasal
            LACRIMAL->R.drawable.lacrimal
            CONNASINF->R.drawable.conchanasalinferior
            VOMER->R.drawable.vomer
            PALATOD->R.drawable.palatinoduro
            PALATOM->R.drawable.palatomole
            CERVICAL->R.drawable.cervical
            TORACICA->R.drawable.toracica
            LOMBAR->R.drawable.lombar
            SACRAL->R.drawable.sacral
            COCCIX->R.drawable.coccix
            MANUBRIO->R.drawable.manubrio
            CESTERNO->R.drawable.corpoesterno
            PXIFOIDE->R.drawable.processoxifoide
            COSTELAS->R.drawable.costelas
            ILIO->R.drawable.ilio
            ISQUIO->R.drawable.isquio
            PUBIS->R.drawable.pubis
            CLAVICULA->R.drawable.clavicula
            ESCAPULA->R.drawable.escapula
            RADIO->R.drawable.radio
            ULNA->R.drawable.ulna
            CARPO->R.drawable.carpo
            METACARPO->R.drawable.metacarpo
            FALANGEPRO->R.drawable.falangeprox
            FALANGEMED->R.drawable.falangemedi
            FALANGEDIS->R.drawable.falangedista
            FEMUR->R.drawable.femur
            PATELA->R.drawable.patela
            TIBIA->R.drawable.tibia
            FIBULA->R.drawable.fibula
            TARSO->R.drawable.tarso
            METATARSO->R.drawable.metatarso
            VAZIO-> null
        }

}