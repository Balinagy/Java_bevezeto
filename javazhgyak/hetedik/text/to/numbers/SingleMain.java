package text.to.numbers;
import java.io.*;

public class SingleMain
{
    public static void main(String[] args)
    {
        SingleLineFile a = new SingleLineFile();

        try
        {
            a.addNumbers("teszt.txt");
        }
        catch(IOException e)
        {
            e.getMessage();
        }
    }
}