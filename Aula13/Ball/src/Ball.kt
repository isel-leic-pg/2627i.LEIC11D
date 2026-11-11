import pt.isel.canvas.*

data class Ball(
    val center: Point,
    val offset: Offset,
    val radius: Int,
    val color: Int
)

fun Ball.move(limitX: Int, limitY: Int): Ball {
    val x = center.x + offset.dx
    val collideLeft = offset.dx<0 && x - radius < 0
    val collideRight = offset.dx>0 && x + radius > limitX
    val dx = if (collideLeft || collideRight) -offset.dx else offset.dx
    val y = center.y + offset.dy
    val collideTop = offset.dy<0 && y - radius < 0
    val collideBottom = offset.dy>0 && y + radius > limitY
    val dy = if (collideTop || collideBottom) -offset.dy else offset.dy
    return copy(center = Point(x, y), offset = Offset(dx,dy))
}

fun Ball.drawIn(cv: Canvas) {
    cv.erase()
    cv.drawCircle(center.x, center.y, radius, color)
}

fun Canvas.draw(ball: Ball) {
    drawCircle(ball.center.x, ball.center.y, ball.radius, ball.color)
}

fun Ball.contains(point: Point): Boolean {
    val distance = center.distanceTo(point)
    return distance <= radius
}