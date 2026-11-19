import pt.isel.canvas.DOWN_CODE
import pt.isel.canvas.LEFT_CODE
import pt.isel.canvas.RIGHT_CODE
import pt.isel.canvas.UP_CODE

enum class Dir(val dRow: Int, val dCol: Int) {
    DOWN(1,0), LEFT(0,-1), RIGHT(0,1), UP(-1,0)
}

fun dirOf(keyCode: Int): Dir? = when (keyCode) {
    UP_CODE -> Dir.UP
    DOWN_CODE -> Dir.DOWN
    LEFT_CODE -> Dir.LEFT
    RIGHT_CODE -> Dir.RIGHT
    else -> null
}