import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import linear.program.utils.*;

public class VariableTest {
    @Test
    public void paramTest() {
        Variable a = linear.program.utils.Variable.makeVar(0,10,"alma");
        assertEquals(0, a.getLowerBound());
        assertEquals(10, a.getUpperBound());
        assertEquals(11, a.getRange());
        assertEquals("alma", a.getName());

        Variable b = linear.program.utils.Variable.makeVar(-100,100,"kiskutya");
        assertEquals(-100, b.getLowerBound());
        assertEquals(100, b.getUpperBound());
        assertEquals(201, b.getRange());
        assertEquals("kiskutya", b.getName());
    }

    @Test
    public void paramTestBadBounds() {
        try{
            Variable a = linear.program.utils.Variable.makeVar(0,0,"alma");
            fail("Expected IllegalArgumentException to be thrown");
        }
        catch(IllegalArgumentException e)
        {
            assertEquals(0, 0);
        }

        try{
            Variable b = linear.program.utils.Variable.makeVar(1,-1,"alma");
            fail("Expected IllegalArgumentException to be thrown");
        }
        catch(IllegalArgumentException e)
        {
            assertEquals(0, 0);
        }
    }
}