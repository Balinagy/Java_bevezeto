package point2d;

public class Point{
        public double x;
        public double y;
        public Point(double a, double b)
        {
            this.x=a;
            this.y=b;
        }
        public void move(double dx, double dy)
        {
            x+=dx;
            y+=dy;
        }
        public void mirror(Point a)
        {
            this.x = a.x+(a.x-this.x);
            this.y = a.y+(a.x-this.y);
        }
        public double distance(Point p)
        {
            return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
        }
}