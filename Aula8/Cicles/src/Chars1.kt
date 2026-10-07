fun main() {
    val c = readChar1("Símbolo")
    println("O Símbolo $c tem o código ${c.code}")
}

/**
 * Reads a single character from user input after displaying a prompt.
 * Assumes the entered input is non-empty and directly retrieves the first character.
 *
 * @param prompt the message to display to the user before reading the input
 * @return the first character entered by the user
 */
fun readChar1(prompt: String): Char {
    print("$prompt? ")
    return readln().trim()[0]
}