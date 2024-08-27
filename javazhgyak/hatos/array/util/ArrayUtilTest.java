package array.util;
import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;


public class ArrayUtilTest {
    @Test
    public void maxLength0() {
        assertEquals(0, new ArrayUtil().max(new int[]{}));
    }

    @ParameterizedTest(name = "parMaxLength1")
    @CsvSource(textBlock = """
        0, 0, -1, -2, -12, -34
        21, 6, 11, 8, 7, 21
        96, 34, 23, -59, 96, 34
    """)
    @DisableIfHasBadStructure
    public void maxLength1(int res, int a, int b, int c, int d, int e) {
        int[] test = new int[]{a,b,c,d,e};
        ArrayUtil arr = new ArrayUtil();
        assertEquals(res, arr.max(test));
        assertEquals(res, arr.max2(test));
        assertEquals(res, arr.max3(test));
        assertEquals(res, arr.max4(test));
    }

    @Test
    public void minMaxLengthN() {
        ArrayUtil arr = new ArrayUtil();
        int[] test1 = new int[]{};
        int[] test2 = new int[]{1};
        int[] test3 = new int[]{5,12,3,-1};
        
        assertArrayEquals(new int[]{0,0}, arr.minMax(test1));
        assertArrayEquals(new int[]{1,1}, arr.minMax(test2));
        assertArrayEquals(new int[]{-1,12}, arr.minMax(test3));
    }
}