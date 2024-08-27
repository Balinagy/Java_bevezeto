package plane.but.not.flying;
import plane.*;

public class CircleMain
{
    public static void main(String[] args)
    {
        PublicCircle a = new PublicCircle(5,2,10);
        System.out.println(a.getArea());

        Circle c = new Circle(0,0,1);
        c.setRadius(4);
        System.out.println(c.getArea());
    }
}