import pt.isel.canvas.*

data class Ball(
    val center: Point,
    val offset: Offset,
    val radius: Int,
    val color: Int
)

fun Ball.move(limitX: Int): Ball {
    val x = center.x + offset.dx
    val collideLeft = offset.dx<0 && x - radius < 0
    val collideRight = offset.dx>0 && x + radius > limitX
    val dx = if (collideLeft || collideRight) -offset.dx else offset.dx
    return copy(center = Point(x, center.y+offset.dy), offset = offset.copy(dx = dx))
}

fun Ball.drawIn(cv: Canvas) {
    cv.erase()
    cv.drawCircle(center.x, center.y, radius, color)
}