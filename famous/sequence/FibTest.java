package famous.sequence;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import famous.sequence.*;

public class FibTest {
    @Test
    public void testforsix() {
        assertEquals(8, Fibonacci.fib(6));
    }

    @ParameterizedTest(name = "{2}:{3} vs {4}:{5} = {0}:{1}")
    @CsvSource(textBlock = """
        3, 2
        6, 8
        7, 13
    """)
    @DisableIfHasBadStructure
    public void paramTest(int nr, int expected) {
    }
}