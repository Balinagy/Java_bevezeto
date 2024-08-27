package linear.program.utils;
import java.util.*;

public class Constraint
{
    public Constraint(int[] a, int val)
    {
        this.coeffs = new int[a.length];
        for(int i = 0; i < a.length; i++)
        {
            coeffs[i] = a[i];
        }
        this.vars = new ArrayList<Variable>();
        this.value = val;
    }
    protected int[] coeffs;
    protected int value;
    private List<Variable> vars;
    public void setVars(List<Variable> a)
    {
        if(a.size() != coeffs.length){
            throw new IllegalArgumentException();
        }
        else
        {
            this.vars = a;
        }
    }

    public boolean compare(int a, int b)
    {
        throw new UnsupportedOperationException();
    }
    public String getCompareString()
    {
        throw new UnsupportedOperationException();
    }

    public boolean checkConstraint(int [] values)
    {
        if(values.length != coeffs.length)
        {throw new IllegalArgumentException();}
        int sum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sum += values[i]*coeffs[i];
        }
        return compare(sum, value);
    }

    @Override
    public String toString()
    {
        if(vars.size() != coeffs.length){
            throw new IllegalStateException();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < vars.size(); i++)
        {
            if(coeffs[i] == 0)
            {
                
            }
            else if(coeffs[i] == 1)
            {
                if(i < vars.size()-1)
                {
                    sb.append(vars.get(i));
                    sb.append(" + ");
                }
                else
                {
                    sb.append(vars.get(i));
                }
            }
            else
            {
                if(i < vars.size()-1)
                {
                    sb.append(coeffs[i]);
                    sb.append(vars.get(i));
                    sb.append(" + ");
                }
                else
                {
                    sb.append(coeffs[i]);
                    sb.append(vars.get(i));
                }
            }
        }
        sb.append(" " + this.getCompareString() + " " + value);
        return sb.toString();
    }
}