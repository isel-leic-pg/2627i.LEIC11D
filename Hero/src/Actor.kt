import pt.isel.canvas.Canvas
import pt.isel.canvas.KeyEvent

data class Actor(val pos: Cell, val turn: Dir)

fun Actor.moveByKey(k: KeyEvent): Actor {
    val dir = dirOf(k.code) ?: turn
    return Actor( pos.moveByKey(k), dir)
}

const val SPRITE_SIDE = 48

fun Canvas.drawActor(a: Actor) {
    val x = a.pos.col * CELL_SIDE
    val y = a.pos.row * CELL_SIDE
    val ySprite = SPRITE_SIDE * a.turn.ordinal
    drawImage("hero|$SPRITE_SIDE,$ySprite,$SPRITE_SIDE,$SPRITE_SIDE",x,y,CELL_SIDE,CELL_SIDE)
}