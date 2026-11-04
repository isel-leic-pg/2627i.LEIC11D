import pt.isel.canvas.*

fun main() {
    onStart {
        val arena = Canvas(600,400, YELLOW)
        var ball = Ball(
            center = Point(arena.width/2,arena.height/2),
            offset = Offset(6,2),
            radius = 100,
            color = GREEN
        )
        ball.drawIn(arena)
        arena.onTimeProgress(50) {
            ball = ball.move(arena.width)
            ball.drawIn(arena)
        }
        arena.onMouseDown { me ->
            ball = ball.copy( center = Point(me.x,me.y) )
        }
    }
    onFinish {  }
}

