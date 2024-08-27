package famous1.sequence1;

import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import famous1.sequence1.*;

public class FibTest {
    @Test
    public void testforsix() {
        assertEquals(8, Fibonacci.Fib(6));
    }
}