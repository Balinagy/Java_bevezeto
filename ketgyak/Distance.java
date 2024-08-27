public class Distance
{
    public static void main(String[] args){
        if(args.length<4){
            System.out.println(0.0);
        }
        else if(args.length==4){
            Point a = new Point();
            Point b = new Point();

            a.x = Double.parseDouble(args[0]);
            a.y = Double.parseDouble(args[1]);
            b.x = Double.parseDouble(args[2]);
            b.y = Double.parseDouble(args[3]);

            System.out.println(a.distance(b));
        }
        else if(args.length==6){
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();

            a.x = Double.parseDouble(args[0]);
            a.y = Double.parseDouble(args[1]);
            b.x = Double.parseDouble(args[2]);
            b.y = Double.parseDouble(args[3]);
            c.x = Double.parseDouble(args[4]);
            c.y = Double.parseDouble(args[5]);

            System.out.println((b.distance(c))+(a.distance(b)));
        }
        else{
            System.out.println("Wrong number of arguments!");
        }
    }
}