fun main() {
    // Input
    print("Nota (0..20)? ")
    val grade = readln().toInt()

    // Decision
    val type = when (grade){
        !in 0..20 -> "inválida"
        8,9 -> "Quase"
        in 10..20 -> "Positiva"
        else -> "Negativa"
    }

    // Output
    println("Nota $type.")
    println("Fim.")
}