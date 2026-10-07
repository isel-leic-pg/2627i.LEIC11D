fun main() {
    val from = readChar("Símbolo inicial")
    val to = readChar("Símbolo final", from+10)
    var c = from
    while (c <= to ) {
        println("$c - ${c.code}")
        c++
    }
}