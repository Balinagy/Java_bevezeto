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

public class TriangularNumbersTest {
    @Test
    public void testforzero() {
        assertEquals(false, TriangularNumbers.getTriangularNumber(0));
    }

    @Test
    public void testforone() {
        assertEquals(true, TriangularNumbers.getTriangularNumber(1));
    }

    @Test
    public void testfor666() {
        assertEquals(true, TriangularNumbers.getTriangularNumber(666));
    }

    @Test
    public void testformin1() {
        assertEquals(false, TriangularNumbers.getTriangularNumber(-1));
    }

    @Test
    public void testformin312() {
        assertEquals(false, TriangularNumbers.getTriangularNumber(-312));
    }

    @Test
    public void testfor5050() {
        assertEquals(true, TriangularNumbers.getTriangularNumber(5050));
    }

    @ParameterizedTest(name = "lessgo")
    @CsvSource(textBlock = """
        0, false
        1, true
        666, true
        -1, false
        -312, false
        5050, true
        3, true
    """)
    @DisableIfHasBadStructure
    public void paramTest(int nr, boolean expected) {
        assertEquals(expected, TriangularNumbers.getTriangularNumber(nr));

        assertEquals(expected, TriangularNumbers.getTriangularNumberAlternative(nr));
    }
}