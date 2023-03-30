package br.com.maxoliveira

fun main(){
    // Sinal de Atribuição (=)
    val inteiro = 1
    val helloWorld = "Hello Word Operadores"

    /* Operadores com Strings */

    println("Hello " +"Word")
    println("Outra forma de concatenação é ${"Usando essa notação"}")

    /*Operadores Numéricos
    *
    *  + -> Somar
    *  - -> Subtrair
    *  * -> Multiplicar
    *  / -> Dividir
    *  % -> Resto da Divisão
    *
    * */

    /* Operadores de Comparação
    *  == -> Igual
    *  !=  -> Diferente
    *  >  -> Maior
    *  <  -> Menor
    *  >= -> Maior Igual
    *  <= -> Menor Igual
    * */


    // CUIDADO COM COMPARAÇÃO DE ARRAY

    println(arrayOf(1 ,2,3).contentEquals(arrayOf(1,2,3)))
    println(arrayOf(1 ,2,3)==arrayOf(1,2,3))



}