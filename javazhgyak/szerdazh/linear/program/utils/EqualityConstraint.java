package linear.program.utils;
import java.util.*;

public class EqualityConstraint extends Constraint
{
    public EqualityConstraint(int[]a, int b)
    {
        super(a, b);
    }
    @Override
    public String getCompareString()
    {
        return " == ";
    }
    @Override
    public boolean compare(int a, int b)
    {
        return a == b;
    }
}