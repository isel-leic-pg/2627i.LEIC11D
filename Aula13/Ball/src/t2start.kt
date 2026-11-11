import pt.isel.canvas.*

fun main() {
    onStart { Canvas(700,500, BLACK).startGame() }
    onFinish {  }
}

fun Canvas.startGame() {
    var ship = SpaceShip(width/2)
    drawShip(ship)
    onMouseMove { me ->
        ship = ship.moveTo(me.x, width)
        erase()
        drawShip(ship)
    }
}