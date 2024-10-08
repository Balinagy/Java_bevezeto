package famous1.sequence1;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;
import famous1.sequence1.*;

public class FibonacciStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("famous1.sequence1.Fibonacci")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void constructor() {
        it.has(DEFAULT_CONSTRUCTOR);
    }

    @Test
    public void methodFib() {
        it.hasMethod("Fib", withParams("n: int"))
            .thatIs(FULLY_IMPLEMENTED, USABLE_WITHOUT_INSTANCE, VISIBLE_TO_ALL)
            .thatReturns("int");
    }
}

