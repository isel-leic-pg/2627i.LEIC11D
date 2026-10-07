fun main() {
    do {
        val c = readChar2("Símbolo")
        println("O Símbolo $c tem o código ${c.code}")
        val resp = readChar("Continuar (s/n)")
    } while(resp in "sS")
}

/**
 * Reads a single character from user input after displaying a prompt.
 * Ensures that the input is non-empty and returns the first character of the entered text.
 *
 * @param prompt the message to display to the user before reading the input
 * @return the first character entered by the user
 */
fun readChar2(prompt: String): Char {
    var line: String
    do {
        print("$prompt? ")
        line = readln().trim()
    } while (line.isEmpty())
    return line[0]
}
