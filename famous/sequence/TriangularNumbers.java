package famous.sequence;

public class TriangularNumbers
{
    public static boolean getTriangularNumber(int n)
    {
        int a = 1;
        int sum = 0;
        while (sum <= n)
        {
            sum += a;
            if(sum == n)
            {
                return true;
            }
            a++;
        }
        return false;
    }

    public static boolean getTriangularNumberAlternative(int n)
    {
        for(int i = 1; i<=n ; i++)
        {
            if((i*(i+1)/2)==n)
            {
                return true;
            }
        }
        return false;
    }
}