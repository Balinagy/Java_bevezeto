package linear.program.utils;
import java.util.*;

public class Variable
{
    private int lowerBound;
    public int getLowerBound(){return lowerBound;}

    private int upperBound;
    public int getUpperBound(){return upperBound;}

    private String name;
    public String getName(){return this.name;}

    private int value;
    public int getValue(){return value;}
    public void setValue(int val){this.value = val;}

    private Variable(int a, int b, String c)
    {
        this.lowerBound = a;
        this.upperBound = b;
        this.name = c;
    }

    public int getRange()
    {
        return this.upperBound-this.lowerBound+1;
    }

    public static Variable makeVar(int a, int b, String c)
    {
        if(a >= b)
        {
            throw new IllegalArgumentException("Wrong bounds");
        }
        else
        {
            return new Variable(a,b,c);
        } 
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(": ");
        sb.append(this.value);
        return sb.toString();
    }
}