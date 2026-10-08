fun main() {
    val pass = readln().trim()
    val capitals = count(pass, { c -> c in 'A'..'Z' } )
    val digits = count(pass) { it in '0'..'9' }
    val letters = count(pass) {
        it in 'a'..'z' || it in 'A'..'Z'
    }
    val type =
        if (
            pass.length>=6 &&
            letters>=2 &&
            digits >=1 &&
            capitals >=1
        ) "Boa" else "Fraca"
    println("A password é $type")
}


