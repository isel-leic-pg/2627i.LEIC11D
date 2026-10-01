fun main() {
    val a = readInt("Lado 1")
    val b = readInt("Lado 2")
    val c = readInt("Lado 3")
    val type = typeOfTriangle(a,b,c)
    println("O triângulo é $type")
}

fun typeOfTriangle(a: Int, b: Int, c: Int) = when {
    a + b <= c || a + c <= b || b + c <= a -> "Impossível"
    a == b && b == c -> "Equilátero"
    a == b || b == c || a == c -> "Isósceles"
    else -> "Escaleno"
}

