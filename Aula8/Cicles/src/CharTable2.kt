fun main() {
    val from = readChar("Símbolo inicial")
    val to = readChar("Símbolo final", from+10)
    for (c in from..to) {
        println("$c - ${c.code}")
    }
    for(x in "Kotlin")
        println(x)
}