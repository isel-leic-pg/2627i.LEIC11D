fun main() {
    val pass = readln().trim()
    val letters = count(pass, ::isLetter)
    val digits = count(pass, ::isDigit)
    val capitals = count(pass, ::isUpperCase )
    val type =
        if (
            pass.length>=6 &&
            letters>=2 &&
            digits >=1 &&
            capitals >=1
        ) "Boa" else "Fraca"
    println("A password é $type")
}

fun isUpperCase(c: Char) = c in 'A'..'Z'

fun count(w: String, condition: (Char) -> Boolean ): Int {
    var counter = 0
    for(c in w)
        if (condition(c)) counter++
    return counter
}
