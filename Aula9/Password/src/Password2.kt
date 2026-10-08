fun main() {
    val pass = readln().trim()
    val letters = countLetters2(pass)
    val digits = countDigits2(pass)
    val type =
        if (pass.length>=6 && letters>=2 && digits >=1) "Boa" else "Fraca"
    println("A password é $type")
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isDigit(c: Char) = c in '0'..'9'

fun countLetters2(w: String): Int {
    var counter = 0
    for(c in w)
        if (isLetter(c)) counter++
    return counter
}

fun countDigits2(w: String): Int {
    var counter = 0
    for(c in w)
        if (isDigit(c)) counter++
    return counter
}