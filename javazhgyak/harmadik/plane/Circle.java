package plane;

public class Circle
{
    public Circle(double a,double b, double rad)
    {
        if(rad <= 0)
        {
            throw new IllegalArgumentException("Wrong radius!");
        }
        else
        {
            this.x = a;
            this.y = b;
            this.radius = rad;
        }
    }
    private double x;
    public double getX(){return x;}
    public void setX(double x){this.x = x;}
    private double y;
    public double getY(){return y;}
    public void setY(double y){this.y = y;}
    private double radius = 1;
    public double getRadius(){return radius;}
    public void setRadius(double rad)
    {
        if(rad <= 0)
        {
            throw new IllegalArgumentException("Wrong radius!");
        }
        else
        {
            this.radius = rad;
        }
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}