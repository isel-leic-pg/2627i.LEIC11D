fun main() {
    do {
        val c = readChar3("Símbolo")
        println("O Símbolo $c tem o código ${c.code}")
        val resp = readChar3("Continuar (s/n)")
    } while(resp in "sS")
}

/**
 * Reads a single character from user input after displaying a prompt.
 * Ensures that the input is non-empty and returns the first character of the entered text.
 *
 * @param prompt the message to display to the user before reading the input
 * @return the first character entered by the user
 */
fun readChar3(prompt: String): Char {
/*
    var line: String
    do {
        print("$prompt? ")
        line = readln().trim()
    } while (line.isEmpty())
    return line[0]
*/
    do {
        print("$prompt? ")
        val line = readln().trim()
        if (line.isNotEmpty())
            return line[0]
    } while(true)
}
