import pt.isel.canvas.KeyEvent

/**
 * Represents a position in grid
 */
data class Cell(val row: Int, val col: Int)

fun Cell.isValid(): Boolean =
    row in 0..<ROWS && col in 0..<COLS

fun Cell.moveByKey(k: KeyEvent): Cell {
    val dir: Dir = dirOf(k.code) ?: return this
    val newPos = Cell(row + dir.dRow, col + dir.dCol)
    return if (newPos.isValid()) newPos else this
}
