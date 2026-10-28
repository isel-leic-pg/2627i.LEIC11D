

fun main() {
    val to = Point(3,5)
    println("objetivo = ${to.toText()}")
    val from = readPoint("partida")
    println("partida = ${from.toText()}")
    val dist = to.distanceTo(from)
    println("Distancia entre partida e objetivo = $dist")
}

fun Point.toText() = "($x,$y)"

fun Point.distanceTo(p: Point) = distanceBetween(this,p)
