import pt.isel.canvas.*

const val CROSS_SIZE = 25
const val RADIUS = 20
const val CROSS_TKN = 3

fun main() {
    onStart {
        val arena = Canvas(600,400, YELLOW)
        drawBall(arena.width/2,arena.height/2,arena)
        arena.onMouseMove { me ->
            drawBall(me.x,me.y,arena)
        }
    }
    onFinish {  }
}


fun drawBall(x: Int, y: Int, cv: Canvas) {
    cv.erase()
    cv.drawCircle(x,y, RADIUS,RED)
    cv.drawLine(x-CROSS_SIZE,y,x+CROSS_SIZE,y,BLACK,CROSS_TKN)
    cv.drawLine(x,y-CROSS_SIZE,x,y+CROSS_SIZE,BLACK,CROSS_TKN)
}