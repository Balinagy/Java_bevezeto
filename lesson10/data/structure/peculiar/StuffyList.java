package data.structure.peculiar;
import java.util.*;

public class StuffyList <E> extends ArrayList
{
    private E neededElement;
    public StuffyList(E a)
    {
        this.neededElement = a;
    }
    public boolean add(HashSet<E> a)
    {
        if(a.contains(neededElement))
        {
            return true;
        }
        return false;
    }

    public boolean add1(E a)
    {
        if(a.equals(neededElement))
        {
            return true;
        }
        return false;
    }
}