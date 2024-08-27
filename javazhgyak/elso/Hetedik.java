public class Hetedik{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.out.println("Adjon meg két argumentumot!");
        }
        else
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            if(b != 0)
            {
                System.out.println((float)a/(float)b);
                System.out.println(a%b);
            }
        }
    }
}