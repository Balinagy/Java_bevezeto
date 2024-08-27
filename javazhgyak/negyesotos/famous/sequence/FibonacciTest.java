package famous.sequence;
import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;

public class FibonacciTest {
    @Test
    public void testFib1() {
        assertEquals(1, new Fibonacci().fib(1));
    }

    @Test
    public void testFib5() {
        assertEquals(5, new Fibonacci().fib(5));
    }

    @Test
    public void testFib10() {
        assertEquals(55, new Fibonacci().fib(10));
    }
}