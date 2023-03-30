package br.com.maxoliveira

fun main(){

    val tipoDeRota = "A_PE"

    if(tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    }else{
        println("Outra Rota")
    }

    when(tipoDeRota){
        "A_PE"->println("A Pé")
        "CARRO"->println("De Carro")
        "ONIBUS"->println("De Pé")
        "TREM"->println("De Trem")
        else-> println("SEM ROTA")
    }

}