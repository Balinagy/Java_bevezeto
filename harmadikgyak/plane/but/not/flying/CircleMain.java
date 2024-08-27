package plane.but.not.flying;
import plane.PublicCircle;

public class CircleMain
{
    public static void main(String[] args)
    {
        PublicCircle circle = new PublicCircle();
        System.out.println(circle.getarea());
        circle.x = 5;
        circle.y = 2;
        circle.radius = 10;
        System.out.println(circle.getarea());
    }
}