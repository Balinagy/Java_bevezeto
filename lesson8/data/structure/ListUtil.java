package data.structure;
import java.util.*;
import java.io.*;

public class ListUtil
{
    public static ArrayList dividors(int a)
    {
        ArrayList<Integer> divs = new ArrayList<Integer>();
        for(int i = 1; i <= a; i++)
        {
            if(a%i == 0)
            {
                divs.add(i);
            }
        }
        for(int i : divs)
        {
            System.out.println(i);
        }
        return divs;
    }

    public ArrayList<String> withSameStartEnd(ArrayList<String> input)
    {
        ArrayList<String> output = new ArrayList<String>();
        for(String part : input)
        {
            if(part != null && part != "" && (part.toCharArray()[0] == part.toCharArray()[part.toCharArray().length()]))
            {
                output.add(part);
            }
        }
        return output;
    }
}