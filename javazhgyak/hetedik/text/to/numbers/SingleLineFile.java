package text.to.numbers;
import java.io.*;

public class SingleLineFile
{
    public int addNumbers(String filepath) throws IOException
    {
        String filePath = filepath;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            
            if(line == null) { throw new IllegalArgumentException("Empty file!");}
            String[] words = line.split("\\s+");
            for(String word : words)
            {
                try
                {
                    System.err.println(Integer.parseInt(word));
                }
                catch(NumberFormatException e)
                {
                    
                }
            }


        } catch (IOException e) {
            System.out.println("File does not exist");
        }
        return 1;
    }
}