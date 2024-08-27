public class Line{
    public double a;
    public double b;
    public double c;

    public boolean contains(Point p);
    {
        if(p.x*this.a+p.y*this.b == c){
            return true;
        }
        return false;
    }

    public boolean isParalellWith(Line l){
        
    }
}