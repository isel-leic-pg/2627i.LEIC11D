
data class Point(val x: Int, val y: Int)

data class Offset(val dx: Int, val dy: Int)

operator fun Point.plus(o: Offset) = Point(x+o.dx, y+o.dy)

operator fun Point.minus(o: Offset) = Point(x-o.dx, y-o.dy)

operator fun Offset.times(n: Int) = Offset(dx*n, dy*n)