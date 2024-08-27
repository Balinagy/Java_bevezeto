package math.operation.safe;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import math.operation.safe.*;

public class IncrementTest {
    @Test
    public void testfor0() {
        assertEquals(1, Increment.increment(0));
    }

    @ParameterizedTest(name = "nincsparsznincsparsz")
    @CsvSource(textBlock = """
        0, 1
        -2147483648, -2147483647
        321412, 321413
        -321412, -321411
        -1, 0
        2147483647, 2147483647
    """)
    @DisableIfHasBadStructure
    public void paramTest(int nr, int expected) {
        assertEquals(expected, Increment.increment(nr));
    }
}