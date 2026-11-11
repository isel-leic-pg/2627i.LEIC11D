import kotlin.math.sqrt

data class Point(val x: Int, val y: Int)

data class Offset(val dx: Int, val dy: Int)

operator fun Point.plus(o: Offset) = Point(x+o.dx, y+o.dy)

operator fun Point.minus(o: Offset) = Point(x-o.dx, y-o.dy)

operator fun Offset.times(n: Int) = Offset(dx*n, dy*n)

fun Point.distanceTo(point: Point): Double {
    val distanceX = point.x - x
    val distanceY = point.y - y
    return sqrt((distanceX * distanceX + distanceY * distanceX).toDouble())
}