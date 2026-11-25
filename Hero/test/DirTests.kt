import pt.isel.canvas.*
import kotlin.test.*

class DirTests {
    @Test fun testDownDir() {
        val res = dirOf(DOWN_CODE)
        assertEquals(Dir.DOWN, res)
    }
    @Test fun invalidDir() {
        val res = dirOf(0)
        assertNull(res)
    }
}