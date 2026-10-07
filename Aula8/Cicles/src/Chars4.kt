fun main() {
    do {
        val c = readChar3("Símbolo")
        println("O Símbolo $c tem o código ${c.code}")
        val resp = readChar3("Continuar (s/n)")
        if (resp !in "sS") break
        println("A gente vai continuar")
    } while(true)
    println("Bye")
}

