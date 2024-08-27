package action.user;
import action.*;

public class MultiDimensionalPoint implements Undoable, Scalable, Comparable<MultiDimensionalPoint>
{
    private int[] coordinates;
    private int[] lastCoordinates;

    @Override
    public int hashCode()
    {
        return 1;
    }

    public void undoLast()
    {
        this.coordinates = this.lastCoordinates;
    }

    public void scale(int times)
    {
        for(int i = 0; i < coordinates.length; i++)
        {
            coordinates[i] = coordinates[i]*times;
        }
    }

    public MultiDimensionalPoint(int... a)
    {
        coordinates = a;
    }

    @Override
    public int compareTo(MultiDimensionalPoint a)
    {
        return 1;
    }

    @Override
    public boolean equals(Object anotherPoint)
    {
        return true;
    }

    public int get(int a)
    {
        if(a < coordinates.length)
        {
            return coordinates[a];
        }
        else
        {
            throw new IllegalArgumentException("Index out of bounds");
        }
    }

    public void set(int a, int b)
    {
        if(a < coordinates.length)
        {
            coordinates[a] = b;
        }
        else
        {
            throw new IllegalArgumentException("Index out of bounds");
        }
    }

    private void saveToLast()
    {
        
    }
}