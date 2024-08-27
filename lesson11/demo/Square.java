public class Square implements Shape
{
    public void rotate(int degree)
    {

    }  

    private int sideLength;

    public Square(int side)
    {
        this.sideLength = side;
    }

    public int getSideLength()
    {
        return this.sideLength;
    }

    public boolean equals(Square anotherObject)
    {
        return this.sideLength == anotherObject.getSideLength();
    }
}