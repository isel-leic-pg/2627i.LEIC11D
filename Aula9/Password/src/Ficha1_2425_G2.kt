//Grupo 2
fun f(a: Int, b: String = "ABC321"): Int {
    val max = b.length - 1
    return if (a in 0 .. max)
        (b[a] - 'A') + (b[max-a] - '0')
    else a
}

fun main() {
    println(f(1, "EDCBA12345"))
    println(f(10, "ISEL2024"))
    println(f(3, "12AB"))
    println(f(a = 2))
}