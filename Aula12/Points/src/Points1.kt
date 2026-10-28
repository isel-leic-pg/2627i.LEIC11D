import kotlin.math.sqrt

fun main() {
    val toX = 3
    val toY = 5
    println("objetivo = ${toTextPoint(toX,toY)}")
    val fromX = readInt("partida.x")
    val fromY = readInt("partida.y")
    println("partida = ${toTextPoint(fromX,fromY)}")
    val dist = distanceBetween(toX, toY, fromX, fromY)
    println("Distancia entre partida e objetivo = $dist")
}

fun distanceBetween(ax: Int, ay: Int, bx: Int, by: Int): Double {
    val dx = bx-ax
    val dy = by-ay
    return sqrt( (dx*dx + dy*dy).toDouble() )
}

fun toTextPoint(x: Int, y:Int): String = "($x,$y)"

fun readInt(quest: String): Int {
    while (true){
        print("$quest? ")
        val line = readln().trim()
        if (line.isNotEmpty() && line.all{ it in '0'..'9' })
            return line.toInt()
    }
}