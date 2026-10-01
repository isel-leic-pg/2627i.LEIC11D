fun main() {
    print("Lado 1? ")
    val a = readln().toInt()

    print("Lado 2? ")
    val b = readln().toInt()

    print("Lado 3? ")
    val c = readln().toInt()

    val type = when {
        a+b<=c || a+c<=b || b+c<=a  -> "Impossível"
        a==b && b==c                -> "Equilátero"
        a==b || b==c || a==c        -> "Isósceles"
        else                        -> "Escaleno"
    }
    println("O triângulo é $type")
}