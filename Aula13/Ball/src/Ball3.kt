import pt.isel.canvas.*

fun main() {
    onStart {
        val arena = Canvas(600,400, YELLOW)
        var center = Point(arena.width/2,arena.height/2)
        arena.drawBall(center)
        arena.onTimeProgress(50) {
            center += Offset(DELTA,0)
            arena.drawBall(center)
        }
        arena.onMouseDown { me ->
            center = Point(me.x,me.y)
            arena.drawBall(center)
        }
    }
    onFinish {  }
}

