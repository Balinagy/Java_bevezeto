public class Circle
{
    private double x;
    private double y;
    public double radius;
    public Circle(double a, double b, double rad)
    {
        this.x = a;
        this.y = b;
        this.radius = rad;
    }
    public void enlarge(double f)
    {
        this.radius *= f;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}