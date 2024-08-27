package math.operation;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;

public class PowerTest {
    @Test
    public void test0() {
        assertEquals(1, new Power().power(100,0));
    }

    @Test
    public void testminus() {
        assertEquals((double)1/(double)36, new Power().power(6,-2));
    }

    @Test
    public void testplus() {
        assertEquals(36, new Power().power(6,2));
    }

    @ParameterizedTest(name = "TestPower")
    @CsvSource(textBlock = """
        6, 2, 36
        6, -2, 0.027777777777777776
        6, 0, 1
    """)
    @DisableIfHasBadStructure
    public void testPow(int a, int b, double res) {
        Power pow = new Power();

        assertEquals(res, pow.power(a,b));
    }
}
