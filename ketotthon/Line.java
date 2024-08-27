public class Line
{
    public double a,b,c;
    public boolean contains(Point p)
    {
        if(p.x*a+p.y*b == c)
        {
            return true;
        }
        return false;
    }

    public boolean isParallelWith(Line l)
    {
        if(this.a/l.a == this.b/l.b)
        {
            return true;
        }
        return false;
    }

    public boolean isOrthogonalTo(Line l)
    {
        if(this.a*l.a+this.b*l.b == 0)
        {
            return true;
        }
        return false;
    }
}