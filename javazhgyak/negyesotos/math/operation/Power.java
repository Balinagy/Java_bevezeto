package math.operation;

public class Power
{
    public static double power(int a, int b)
    {
        int ret=1;
        int c = b*(-1);
        if(b == 0)
        {
            return (double)ret;
        }
        if(b < 0)
        {
            for(int i=0; i < c; i++)
            {
                ret*=a;
            }
            return (double)1/(double)ret;
        }
        for(int i=0; i < b; i++)
            {
                ret*=a;
            }
            return (double)ret;
    }
}