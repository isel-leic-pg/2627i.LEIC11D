fun main() {
    val pass = readln().trim()
    var fx: (Char)->Boolean = ::isLetter
    val letters = count(pass, fx)
    fx = ::isDigit
    val digits = count(pass, fx)
    fx = ::isUpperCase
    val capitals = count(pass, fx )
    val type =
        if (
            pass.length>=6 &&
            letters>=2 &&
            digits >=1 &&
            capitals >=1
        ) "Boa" else "Fraca"
    println("A password é $type")
}

