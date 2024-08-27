public class Nyolcadik
{
    public static void main(String[] args)
    {
        System.out.println("Adja meg n-t");
        int n = Integer.parseInt(System.console().readLine());
        int sum = 1;
        while (n > 1)
        {
            sum *= n;
            n--;
        }
        System.out.println("n! : " + sum);
    }
}