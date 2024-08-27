public class Point{
    public double x;
    public double y;

    public void move(int dx, int dy){
        this.x += dx; //this azt jelöli, hogy ebben az osztályban lévő x-re és y-ra vonatkozik
        this.y += dy;
    }

    public void mirror(Point a){
        this.x = a.x+(a.x-this.x);
        this.y = a.y+(a.x-this.y);
    }

    public double distance(Point a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
    }
}