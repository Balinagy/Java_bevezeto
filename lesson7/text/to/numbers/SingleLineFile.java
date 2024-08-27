package text.to.numbers;
import java.io.*;

public class SingleLineFile
{
    public SingleLineFile(){}

    public static int addNumbers(String fileName) throws IOException {
        /*
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        */

       int sum = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileName));){
        String line = br.readLine();
        if(line == null)
        {
            throw new IllegalArgumentException("Empty file!");
        }
        String[] pieces = line.split(" ");
        int parsed;
        for(String s : pieces)
        {
            try
            {
                parsed = Integer.parseInt(s);
                sum = sum + parsed;
            }
            catch(NumberFormatException nfe)
            {
                System.err.println(s);
            }
        }
    }
    catch(IOException ioe){
            System.err.println("File does not exist!");
        }
        return sum;
    }
}