import static check.CheckThat.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import linear.program.utils.*;
import java.util.*;

public class ConstraintTest {
    @ParameterizedTest(name = "ConstraintTest")
    @CsvSource(textBlock = """
        1, 2, 90
    """)
    @DisableIfHasBadStructure
    public void paramTwoCoeffs(int a, int b, int res) {
        EqualityConstraint f = new EqualityConstraint(new int[]{a,b}, res);
        InequalityConstraint s = new InequalityConstraint(new int[]{a,b}, res);
        Variable first = linear.program.utils.Variable.makeVar(1,2,"a");
        Variable sec = linear.program.utils.Variable.makeVar(1,2,"b");
        List<Variable> in = new ArrayList<Variable>();
        in.add(first);
        in.add(sec);
        f.setVars(in);
        s.setVars(in);
        assertEquals(true, f.checkConstraint(new int[]{30,30}));
        assertEquals(true, s.checkConstraint(new int[]{20,30}));
    }

    @ParameterizedTest(name = "ConstraintTest")
    @CsvSource(textBlock = """
        -1, 0, 6
    """)
    @DisableIfHasBadStructure
    public void paramTwoCoeffs1(int a, int b, int res) {
        EqualityConstraint f = new EqualityConstraint(new int[]{a,b}, res);
        InequalityConstraint s = new InequalityConstraint(new int[]{a,b}, res);
        Variable first = linear.program.utils.Variable.makeVar(1,2,"a");
        Variable sec = linear.program.utils.Variable.makeVar(1,2,"b");
        List<Variable> in = new ArrayList<Variable>();
        in.add(first);
        in.add(sec);
        f.setVars(in);
        s.setVars(in);
        assertEquals(true, f.checkConstraint(new int[]{-6,0}));
        assertEquals(false, s.checkConstraint(new int[]{-7,0}));
    }

    @ParameterizedTest(name = "ConstraintTest")
    @CsvSource(textBlock = """
        3, -4, 11
    """)
    @DisableIfHasBadStructure
    public void paramTwoCoeffs2(int a, int b, int res) {
        EqualityConstraint f = new EqualityConstraint(new int[]{a,b}, res);
        InequalityConstraint s = new InequalityConstraint(new int[]{a,b}, res);
        Variable first = linear.program.utils.Variable.makeVar(1,2,"a");
        Variable sec = linear.program.utils.Variable.makeVar(1,2,"b");
        List<Variable> in = new ArrayList<Variable>();
        in.add(first);
        in.add(sec);
        f.setVars(in);
        s.setVars(in);
        assertEquals(false, f.checkConstraint(new int[]{30,30}));
        assertEquals(true, s.checkConstraint(new int[]{30,30}));
    }

    @Test
    public void noVars1() {
        try{
            EqualityConstraint f = new EqualityConstraint(new int[]{1,4}, 42);
            Variable a = linear.program.utils.Variable.makeVar(0,2,"alma");
            List <Variable> l = new ArrayList<Variable>();
            l.add(a);
            f.setVars(l);
            fail("Expected IllegalArgumentException to be thrown");
        }
        catch(IllegalArgumentException e)
        {
            assertEquals(0, 0);
        }
    }

    @Test
    public void noVars2() {
        try{
            InequalityConstraint f = new InequalityConstraint(new int[]{1,4}, 42);
            Variable a = linear.program.utils.Variable.makeVar(0,2,"alma");
            List <Variable> l = new ArrayList<Variable>();
            l.add(a);
            f.setVars(l);
            fail("Expected IllegalArgumentException to be thrown");
        }
        catch(IllegalArgumentException e)
        {
            assertEquals(0, 0);
        }
    }
}