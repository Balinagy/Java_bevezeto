package array.util;

public class ArrayUtil
{
    public static int max(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0)
        {
            return 0;
        }
        else
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    public static int max2(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0)
        {
            return 0;
        }
        else
        {
            for(int i = 0; i < arr.length; i++)
            {
                max = arr[i] > max?arr[i]:max;
            }
            return max;
        }
    }

    public static int max3(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0)
        {
            return 0;
        }
        else
        {
            for(int i = 0; i < arr.length; i++)
            {
                max = Math.max(max, arr[i]);
            }
            return max;
        }
    }

    public static int max4(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0)
        {
            return 0;
        }
        else
        {
            for(int i : arr)
            {
                max = Math.max(max, i);
            }
            return max;
        }
    }

    public static int[] minMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(arr.length == 0)
        {
            return new int[]{0,0};
        }
        else
        {
            for(int i : arr)
            {
                max = Math.max(max, i);
            }
            for(int i : arr)
            {
                min = Math.min(min, i);
            }
            return new int[]{min,max};
        }
    }
}