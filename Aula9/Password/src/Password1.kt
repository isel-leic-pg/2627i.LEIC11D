fun main() {
    val pass = readln().trim()
    val letters = countLetters1(pass)
    val digits = countDigits1(pass)
    val type =
        if (pass.length>=6 && letters>=2 && digits >=1) "Boa" else "Fraca"
    println("A password é $type")
}

fun countLetters1(w: String): Int {
    var counter = 0
    var idx = 0
    while( idx < w.length ) {
        if (w[idx] in 'a'..'z' || w[idx] in 'A'..'Z')
            counter++
        idx++
    }
    return counter
}

fun countDigits1(w: String): Int {
    var counter = 0
    for(c in w)
        if (c in '0'..'9') counter++
    return counter
}