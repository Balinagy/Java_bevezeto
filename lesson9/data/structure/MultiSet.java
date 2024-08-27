package data.structure;
import java.util.*;

public class MultiSet <E>
{
    private HashMap<E, Integer> elemToCount;
    public HashMap<E, Integer> getelem()
    {return elemToCount;}

    public MultiSet(E[] elements)
    {
        elemToCount = new HashMap<>();

        for(E element : elements)
        {
            if(elemToCount.containsKey(element))
            {
                elemToCount.replace(element, this.elemToCount.get(element) + 1);
            }
            else
            {
                elemToCount.put(element, 1);
            }
        }
    }

    public int add(E element)
    {
        if(elemToCount.containsKey(element))
        {
            elemToCount.replace(element, this.elemToCount.get(element) + 1);
        }
        else
        {
            elemToCount.put(element, 1);
        }
        return this.elemToCount.get(element);
    }

    public int getCount(E element)
    {
        return this.elemToCount.get(element);
    }

    public MultiSet intersect(MultiSet<E> input)
    {
        MultiSet<E> output = new MultiSet<>(null);
        for(Map.Entry<E, Integer> entry : elemToCount.entrySet())
        {
            if(input.getelem().containsKey(entry.getKey()))
            {
                output.add(entry.getKey());
            }
        }
        return output;
    }
}