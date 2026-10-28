
data class Point(val x: Int, val y: Int)

fun main() {
    val to: Point = Point(3,5)
    println(to)
    println("objetivo = ${toTextPoint(to)}")
    val from = readPoint("partida")
    println("partida = ${toTextPoint(from)}")
    if (to==from)
        println("Pontos iguais")
    else {
        val dist = distanceBetween(to, from)
        println("Distancia entre partida e objetivo = $dist")
    }
    val p3 = to.copy() // Diferente p3 = to
    val p4 = to.copy(x=2)
}

fun readPoint(name: String): Point {
    val x = readInt("$name.x")
    val y = readInt("$name.y")
    return Point(x,y)
}

fun toTextPoint(p: Point) = "(${p.x},${p.y})"

fun distanceBetween(a: Point, b: Point) =
    distanceBetween(a.x, a.y, b.x, b.y)