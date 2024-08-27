package linear.program;
import java.util.*;
import linear.program.utils.*;

public class ILPSolver
{
    private static final int MAX_ITERATION_COUNT = 10000000;
    private List<Variable> variables;
    private List<Constraint> constraints;
    private Heuristic heuristic;
    public ILPSolver(Heuristic heuristic)
    {
        this.heuristic = heuristic;
        variables = new ArrayList<Variable>();
        constraints = new ArrayList<Constraint>();
    }

    public void addVar(int low, int upper, String name)
    {
        variables.add(linear.program.utils.Variable.makeVar(low,upper,name));
    }

    public void addConstraint(Constraint constraint)
    {
        
    }
}