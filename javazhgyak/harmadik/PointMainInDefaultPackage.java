import point2d.*;
public class PointMainInDefaultPackage
{
    public static void main(String[] args)
    {
        Point a = new Point(3,5);
        Point b = new Point(5,7);
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.move(1,1);
        System.out.println(a.getX());
        System.out.println(a.getY());
        a.mirror(b);
        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a.distance(b));
    }
}