import pt.isel.canvas.*

// SpaceShip values
private const val WIDTH = 50
private const val HEIGHT = 10
private const val BASE_Y = 450
private const val TIP_WIDTH = 4
private const val TIP_HEIGHT = 5

//              +-+  4x5
//    +---------+ +----------+
//    |  50x10               |
//    +----------x-----------+   .... y = 450


data class SpaceShip(
    val x: Int,
//    val shot: Shot,
)

fun SpaceShip.moveTo(toX: Int, limitX: Int): SpaceShip {
/*
    val min = WIDTH/2
    val max = limitX-WIDTH/2
    val newX = if (toX <min) min else if ( toX > max) max else toX
    return copy(x=newX)
*/
    return copy(x = toX.coerceIn(WIDTH/2, limitX-WIDTH/2))
}

fun Canvas.drawShip(ship: SpaceShip) {
    drawRect(ship.x-WIDTH/2, BASE_Y-HEIGHT, WIDTH, HEIGHT, GREEN)
    drawRect(ship.x-TIP_WIDTH/2, BASE_Y-HEIGHT-TIP_HEIGHT, TIP_WIDTH, TIP_HEIGHT, YELLOW)
}