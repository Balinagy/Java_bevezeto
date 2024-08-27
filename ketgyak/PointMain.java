public class PointMain{
    public static void main(String[] args){
        Point p = new Point();
        Point a = new Point();
        p.x = 0;
        p.y = 0;
        a.x = -2;
        a.y = -2;
        System.out.println("Coordinate x: " + p.x + "\nCoordinate y: " + p.y);
        p.move(-1,-1);
        p.mirror(a);
        System.out.println("The distance between the two coordinates is: " + p.distance(a));
        System.out.println("Coordinate x: " + p.x + "\nCoordinate y: " + p.y);
    }
}