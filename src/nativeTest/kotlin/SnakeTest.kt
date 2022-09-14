import kotlin.test.Test
import kotlin.test.assertEquals

class SnakeTest {

    private val snake = Snake(
        cells = listOf(Cell(2, 0), Cell(1, 0), Cell(0, 0)),
        direction = Direction.right
    )

    @Test
    fun `snake moves right`(){
        assertEquals(
            actual = snake.move(),
            expected = Snake(
                cells = listOf(Cell(3, 0), Cell(2, 0), Cell(1, 0)),
                direction = Direction.right
            )
        )
    }

    @Test
    fun `snake changes direction`(){
        assertEquals(
            actual = snake.turn(Direction.down).move(),
            expected = Snake(
                cells = listOf(Cell(2, 1), Cell(2, 0), Cell(1, 0)),
                direction = Direction.down
            )
        )

        assertEquals(
            actual = snake.turn(Direction.left).move(),
            expected = Snake(
                cells = listOf(Cell(3, 0), Cell(2, 0), Cell(1, 0)),
                direction = Direction.right
            )
        )
    }
}