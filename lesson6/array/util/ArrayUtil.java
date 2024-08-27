package array.util;

public class ArrayUtil
{
    //ezt fordító alapvetően is ideírja ha nincs itt
    public ArrayUtil(){}
    public static int max(int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int max2 (int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< numbers.length; i++)
        {
            max = numbers[i] > max ? numbers[i] : max;
        }
        return max;
    }

    public static int max3 (int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< numbers.length; i++)
        {
            max = Math.max(numbers[i], max);
        }
        return max;
    }

    public static int max4 (int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        for (int nr : numbers)
        {
            max = Math.max(nr, max);
        }
        return max;
    }

    public static int[] minMax(int[] numbers)
    {
        int[]minimax = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
            if(numbers[i] < min)
            {
                min = numbers[i];
            }
        }
        minimax[0] = min;
        minimax[1] = max;
        return minimax;
    }
}