package array.util.main;
import array.util.*;

public class Main
{
    public static void main(String [] args)
    {
        System.console().printf("Add meg a tömb hosszát!\n");
        int arrayLenTxt = Integer.parseInt(System.console().readLine());
        int[] array = new int [arrayLenTxt]; 
        for (int i = 0; i< arrayLenTxt; i++)
        {
            array[i] = Integer.parseInt(System.console().readLine());
        }
        System.console().printf("A maximum1: %d\n", ArrayUtil.max(array));
        System.console().printf("A maximum2: %d\n", ArrayUtil.max2(array));
        System.console().printf("A maximum3: %d\n", ArrayUtil.max3(array));
        System.console().printf("A maximum4: %d\n", ArrayUtil.max4(array));
    }
}