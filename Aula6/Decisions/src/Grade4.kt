fun main() {
    // Input
    print("Nota (0..20)? ")
    val grade = readln().toInt()

    // Decision
    val type =
    if (grade in 0..20)
        if (grade >= 10) "Positiva"
        else "Negativa"
    else "inválida"

    // Output
    println("Nota $type.")
    println("Fim.")
}