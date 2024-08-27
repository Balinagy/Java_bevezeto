package linear.program;
import linear.program.utils.*;
import java.util.*;

public class RandomHeuristic implements Heuristic
{
    private Random random;
    int seed = 0;
    public RandomHeuristic(){}
    public RandomHeuristic(int seed){this.seed = seed;}
    public boolean getNextVariables(List <Variable> vars)
    {
        if(seed == 0)
        {
            for(int i = 0; i < vars.size(); i++)
            {
                vars.get(i).setValue(random.nextInt());
            }
        }
        else
        {
            for(int i = 0; i < vars.size(); i++)
            {
                vars.get(i).setValue(random.nextInt(seed));
            }
        }
        return true;
    }
}