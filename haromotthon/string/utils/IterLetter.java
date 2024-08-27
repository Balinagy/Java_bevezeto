package string.utils;

public class(String a)
{
    if(a.length == 0)
    {
        throw new IllegalArgumentException();
    }
    private int counter = 0;
    public void printNext()
    {
        if(counter < a.length)
        {
            System.out.println(a[counter]);
            counter++;
        }
        else
        {
            System.out.println();
        }
    }
}