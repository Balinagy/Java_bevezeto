import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import array.util.*;

public class ArrayUtilTest {
    int[] a = {};
    @Test
    public void maxLength0() {
        assertEquals(Integer.MIN_VALUE, ArrayUtil.max(a));
        assertEquals(Integer.MIN_VALUE, ArrayUtil.max2(a));
        assertEquals(Integer.MIN_VALUE, ArrayUtil.max3(a));
        assertEquals(Integer.MIN_VALUE, ArrayUtil.max4(a));
    }

    int[] b = {7};
    @Test
    public void maxLength1() {
        assertEquals(7, ArrayUtil.max(b));
        assertEquals(7, ArrayUtil.max2(b));
        assertEquals(7, ArrayUtil.max3(b));
        assertEquals(7, ArrayUtil.max4(b));
    }

    @ParameterizedTest(name = "teszt")
    @CsvSource(textBlock = """
        1, 2, 2
    """)

    @DisableIfHasBadStructure
    public void maxLength2(int nr, int nr1, int expected) {
        int [] numbers = {nr, nr1};
        assertEquals(expected, ArrayUtil.max(numbers));
        assertEquals(expected, ArrayUtil.max2(numbers));
        assertEquals(expected, ArrayUtil.max3(numbers));
        assertEquals(expected, ArrayUtil.max4(numbers));
    }

    @Test
    public void minMaxLength0() {
        int [] testt0 = {};
        int [] out0 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertArrayEquals(out0, ArrayUtil.minMax(testt0));
    }

    @Test
    public void minMaxLength1() {
        int [] testt0 = {1};
        int [] out0 = {1, 1};
        assertArrayEquals(out0, ArrayUtil.minMax(testt0));
    }

    @Test
    public void minMaxLength2() {
        int [] testt0 = {-123,123};
        int [] out0 = {-123, 123};
        assertArrayEquals(out0, ArrayUtil.minMax(testt0));
    }
}