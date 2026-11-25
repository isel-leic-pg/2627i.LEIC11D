import pt.isel.canvas.KeyEvent

/**
 * Represents a position in grid
 */
data class Cell(val row: Int, val col: Int)

fun Cell.isValid() = row in 0..<ROWS && col in 0..<COLS

operator fun Cell.plus(d: Dir) = Cell(row+d.dRow, col+d.dCol)

fun Cell.moveByKey(k: KeyEvent): Cell {
    val dir: Dir = dirOf(k.code) ?: return this
    val newPos = this + dir // Cell(row + dir.dRow, col + dir.dCol)
    return if (newPos.isValid()) newPos else this
}

// Adhoc tests
fun main() {
    val c1 = Cell(0,0)
    println(c1.isValid())
    println(Cell(-1,30).isValid())
}
