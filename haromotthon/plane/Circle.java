package plane;

public class Circle
{
    private double x;
    private double y;
    private double radius;
    public double get_X()
    {
        return this.x;
    }

    public double get_y()
    {
        return this.y;
    }

    public double get_radius()
    {
        return this.radius;
    }

    public void set_x(double x)
    {
        this.x = x;
    }

    public void set_y(double y)
    {
        this.y = y;
    }

    public void set_radius(double radius)
    {
        if (radius <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            this.radius = radius;
        }
    }
    public double getarea()
    {
        return this.radius*this.radius*Math.PI;
    }

    public Circle(double x, double y, double radius)
    {
        set_x(x);
        set_y(y);
        set_radius(radius);
    }
}