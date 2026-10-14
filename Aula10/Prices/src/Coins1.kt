fun main() {
    val coins: List<Int> = listOf(50, 20, 10, 5, 2, 1)
    println(coins)
    println(coins.size)
    println(coins[2])
    for (i in 0..<coins.size)
        println("$i : ${coins[i]}")
    println(coins.first())
    println(coins.last())

    val words: List<String> = listOf("uma", "frase", "é", "uma", "lista", "de", "palavras")
    for (i in 0..<words.size) {
        print(words[i])
        if (i < words.size - 1) print(',')
    }
    val ws = words + "outra" - "uma"
    println(ws)
}