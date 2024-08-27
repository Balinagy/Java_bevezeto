import point2d.Point;
public class PointMainInDefaultPackage
{
    public static void main(String[] args)
    {
        Point a = new Point(10,12);
        Point b = new Point(21,13);
        System.out.println("egyik: " + a.x + " " + "másik: " + a.y);
        a.move(21,1);
        System.out.println("egyik: " + a.x + " " + "másik: " + a.y);

        System.out.println("A távolság: " + a.distance(b));
    }
}