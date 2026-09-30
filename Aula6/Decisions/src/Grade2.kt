fun main() {
    print("Nota (0..20)? ")
    val grade = readln().toInt()
    if (grade in 0..20) {
        if (grade >= 10) {
            println("Positiva.")
            println("Parabéns!")
        }
        else println("Negativa.")
    }
    else
        println("Nota inválida.")
    println("Fim.")
}