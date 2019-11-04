package com.example.motivation.mock

import com.example.motivation.util.MotivationConstant

class Phrase(description : String, categories : Int )

class Mock{
    private val ALL = MotivationConstant.PHRASE_FILTER.ALL
    private val SUN = MotivationConstant.PHRASE_FILTER.SUN
    private val HAPPY = MotivationConstant.PHRASE_FILTER.HAPPY

    private val mListPhrases : List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez", HAPPY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste", HAPPY),
        Phrase("Quando está mais escuro é quando vemos estrelas", HAPPY),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar resultado diferente", HAPPY),
        Phrase("Não pare quando estiver cansado, pare quando estiver terminado", HAPPY),
        Phrase("O que você pode fazer agora é o que tem mais impacto sobre o seu sucesso", HAPPY),
        Phrase("A melhor maneira de prever o futuro é inventalo", SUN),
        Phrase("Você perde todas as chances quando não aproveita", SUN),
        Phrase("Fracaso é o condimento quando da sabor ao sucesso", SUN),
        Phrase("Enquanto não estivermos comprometido, haverá hesitação", SUN),
        Phrase("Se você não sabe onde ir, qualquer caminho serve", SUN),
        Phrase("Se você acredita faz toda diferença ", SUN),
        Phrase("Riscos devem ser assumidos, pois o maior risco é não arriscar", SUN)



    )
}