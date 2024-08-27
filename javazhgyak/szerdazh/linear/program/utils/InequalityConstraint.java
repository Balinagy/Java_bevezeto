package linear.program.utils;
import java.util.*;

public class InequalityConstraint extends Constraint
{
    public InequalityConstraint(int[]a, int b)
    {
        super(a, b);
    }
    @Override
    public String getCompareString()
    {
        return " <= ";
    }
    @Override
    public boolean compare(int a, int b)
    {
        return a <= b;
    }
}