import pt.isel.canvas.*

fun main() {
    onStart {
        val arena = Canvas(600,400, YELLOW)
        var balls = List(100) {
            Ball(center = Point(arena.width/2, arena.height/2),
                offset = Offset((-10..10).random(), (-10..10).random()),
                radius = (5..100).random(),
                color = (0x000000..0xFFFFFF).random()
            )
        }
        balls.forEach { ball -> arena.draw(ball) }
        arena.onTimeProgress(50) {
            balls = balls.map { ball -> ball.move(arena.width, arena.height) }
            arena.erase()
            balls.forEach { ball -> arena.draw(ball) }
            arena.drawText(10,30,"${balls.size}")
        }
        arena.onMouseDown { me ->
            balls = balls.filter{ ball -> !ball.contains( Point(me.x,me.y) )}
        }
    }
    onFinish {  }
}

