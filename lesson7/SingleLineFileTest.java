import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.*;
import text.to.numbers.*;

public class SingleLineFileTest{
    @Test
    public void Test1() {
        try
        {
            SingleLineFile.addNumbers("");
        }
        catch(Exception e)
        {
            assertEquals("Empty file!", e.getMessage());
        }
    }
    @Test
    public void Test2() {
        try
        {
            SingleLineFile.addNumbers("./helptext2.txt");
        }
        catch(Exception e)
        {
            assertEquals("Empty file!", e.getMessage());
        }
    }

    @Test
    public void Test3() {
        try
        {
            assertEquals(-115,SingleLineFile.addNumbers("./helptext2.txt"));
        }
        catch(Exception e)
        {
            assertEquals("", e.getMessage());
        }
    }
}