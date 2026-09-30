fun main() {
    // Input
    print("Nota (0..20)? ")
    val grade = readln().toInt()

    // Output
    var type : String
    if (grade in 0..20) {
        if (grade >= 10) type = "Positiva"
        else             type = "Negativa"
    }
    else
        type = "inválida"
    println("Nota $type.")
    println("Fim.")
}