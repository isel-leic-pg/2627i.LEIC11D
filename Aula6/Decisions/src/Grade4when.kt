fun main() {
    // Input
    print("Nota (0..20)? ")
    val grade = readln().toInt()

    // Decision
    val type = when {
        grade !in 0..20 -> "inválida"
        grade >= 10 -> "Positiva"
        else -> "Negativa"
    }

    // Output
    println("Nota $type.")
    println("Fim.")
}