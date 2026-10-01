fun main() {
    val a = readInt("Lado 1", default = 1)
    val b = readInt("Lado 2", 2)
    val c = readInt("Lado 3", 3)
//    val x = readInt(default = 2, prompt = "xpto")

    val type = when {
        a+b<=c || a+c<=b || b+c<=a  -> "Impossível"
        a==b && b==c                -> "Equilátero"
        a==b || b==c || a==c        -> "Isósceles"
        else                        -> "Escaleno"
    }
    println("O triângulo é $type")
}

fun readInt(prompt: String, default: Int = 0): Int {
    print("$prompt? ")
    val res = readln().trim().toIntOrNull()
    return if (res==null) default else res
}