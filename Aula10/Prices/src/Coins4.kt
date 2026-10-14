fun main() {
    val coins = [200, 100, 50, 20, 10, 5, 2, 1]
    for (c in coins)
        println( toText(c) )
}

fun toText(value: Int) = when {
    value >= 100 -> "${value / 100} euros"
    else         -> "$value cêntimos"
}
