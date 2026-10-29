import pt.isel.canvas.*

const val DELTA = 4

fun main() {
    onStart {
        val arena = Canvas(600,400, YELLOW)
        var center = Point(arena.width/2,arena.height/2)
        arena.drawBall(center)
        arena.onKeyPressed { ke ->
            center += ke.toOffset()
            arena.drawBall(center)
        }
        arena.onMouseDown { me ->
            center = Point(me.x,me.y)
            arena.drawBall(center)
        }
    }
    onFinish {  }
}

fun KeyEvent.toOffset(): Offset = when(code) {
    UP_CODE -> Offset(0,-DELTA)
    DOWN_CODE -> Offset(0,DELTA)
    LEFT_CODE -> Offset(-DELTA,0)
    RIGHT_CODE -> Offset(DELTA,0)
    else -> Offset(0,0)
}


fun Canvas.drawBall(p: Point) {
    erase()
    drawCircle(p.x,p.y,RADIUS,RED)
}
