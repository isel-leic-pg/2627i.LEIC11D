//Grupo 3
fun readPositive(question: String): Int {
    while (true) {
        print("$question ? ")
        val v = readln().trim().toInt()
        if (v>0) return v
    }
}

fun main() {
    val a = readPositive("Lado A")
    val b = readPositive("lado B")
    val name = if (a>b) 'A' else 'B'
    val perimeter = a*2 + b*2
    println("Dimensões: $a x $b")
    println("O lado maior é o $name")
    println("Perímetro = $perimeter")
}