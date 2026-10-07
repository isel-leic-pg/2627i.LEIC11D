fun main() {
    while(true) {
        val c = readChar("Símbolo")
        println("O Símbolo $c tem o código ${c.code}")
        val resp = readChar("Continuar (s/n)",'s')
        if (resp !in "sS") break
        println("A gente vai continuar")
    }
    println("Bye")
}

fun readChar(prompt: String, default: Char = ' '): Char {
    while (true) {
        print("$prompt? ")
        val line = readln().trim()
        if (line.isEmpty() && default!=' ')
            return default
        if (line.isNotEmpty())
            return line[0]
    }
}

