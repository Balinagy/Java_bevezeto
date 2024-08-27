package plane;
import point2d.*;
public class PublicCircle
{
    public PublicCircle(double a,double b, double rad)
    {
        this.x = a;
        this.y = b;
        this.radius = rad;
    }
    double x;
    double y;
    public double radius = 1;
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}