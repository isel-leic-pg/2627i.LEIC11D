fun main() {
    print("Nota (0..20)? ")
    val grade = readln().toInt()
    when {
        grade !in 0..20 -> println("Nota inválida.")
        grade >= 10 -> {
            println("Positiva.")
            println("Parabéns!")
        }
        else -> println("Negativa.")
    }
    println("Fim.")
}