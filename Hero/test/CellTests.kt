import pt.isel.canvas.*
import kotlin.test.*

class CellTests {
    @Test fun cell00Isvalid() {
        val cell = Cell(0,0)
        assertTrue(cell.isValid(),"must be valid")
    }
    @Test fun otherCellValid() {
        val cell = Cell(ROWS-1,COLS-1)
        assertTrue(cell.isValid())
    }
    @Test fun negativeRowIsInvalid() {
        val cell = Cell(-1,0)
        assertFalse(cell.isValid())
    }
    @Test fun moveCellDown() {
        val cell = Cell(0,0)
        val kDown = KeyEvent(' ',DOWN_CODE,"Down")
        val newCell = cell.moveByKey(kDown)
        //assertEquals(0, newCell.col)
        //assertEquals(1, newCell.row)
        assertEquals(Cell(1,0),newCell)
    }
    @Test fun moveCellRight() {
        val cell = Cell(0,0)
        val kRight = KeyEvent(' ',RIGHT_CODE,"")
        val newCell = cell.moveByKey(kRight)
        assertEquals(Cell(0,1),newCell)
    }
    @Test fun addDirToCell() {
        val sut = Cell(0,0) + Dir.DOWN
        assertEquals(Cell(1,0), sut)
    }
}