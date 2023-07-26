package br.com.eleicaoonline



fun main() {
    val number2word = mapOf(1 to "um", 2 to "dois", 3 to "três", 4 to "quatro")
    val n = 4
    println("$n is spelt as '${number2word[n]}'")
}