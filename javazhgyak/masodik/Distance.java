public class Distance
{
    public static void main(String[] args)
    {
        Point[] points = new Point[(int)(args.length/2)];
        if(args.length%2 != 0)
        {
            System.out.println("Nem jók a paraméterek.");
        }
        else
        {
            for(int i = 0; i < args.length-1; i++)
            {
                points[(int)((float)i/2)] = new Point(Double.parseDouble(args[i]), Double.parseDouble(args[i+1]));
                i=i+1;
            }
            double dis = 0;
            for(int i = 0; i < points.length-1; i++)
            {
                dis += points[i].distance(points[i+1]);
            }
            System.out.println(dis);
        }
    }
}