package linear.program;
import linear.program.utils.*;
import java.util.*;

public class BruteForceHeuristic implements Heuristic
{
    public boolean getNextVariables(List<Variable> vars)
    {
        int len = vars.size();
        int c = 0;
        for(Variable a : vars)
        {
            if(a.getValue() == a.getUpperBound())
            {
                c++;
                a.setValue(a.getLowerBound());
            }
            else
            {
                a.setValue(a.getValue()+1);
            }
        }
        if(c == len){return false;}
        return true;
    }
}