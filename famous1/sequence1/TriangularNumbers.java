package famous1.sequence1;

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
}