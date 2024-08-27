package text.to.numbers;
import java.io.*;

public class MultiLineFile
{
    public int addNumbers(String filepath, char split)
    {
        String splitter = Character.toString(split);
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath)))
        {
            String line = reader.readLine();
            if(line == null) {throw new IllegalArgumentException("Empty file");}

            while(line != null)
            {
                String[] splittedLine = line.split(splitter);
                for(String word : splittedLine)
                {
                    try
                    {
                        System.err.println(Integer.parseInt(word));
                    }
                    catch (NumberFormatException e)
                    {

                    }
                }
                line = reader.readLine();
            }
        }
        catch(IOException e)
        {

        }
        return 1;
    }
}