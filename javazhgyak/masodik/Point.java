public class Point
{
    public Point(double a, double b)
    {
        this.x = a;
        this.y = b;
    }
    private double x;
    private double y;
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    public void move(double dx, double dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public void mirror(Point p)
    {
        this.x += (p.getX()-this.x)*2;
        this.y += (p.getY()-this.y)*2;
    }

    public double distance(Point p)
    {
        return Math.sqrt((this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()));
    }
}