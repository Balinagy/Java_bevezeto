public class Hatodik
{
    public static void main(String[] args)
    {
        System.console().printf("Kérem adjon meg két számot!");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        if(a < b)
        {
            for(int i = a+1; i < b; i++)
            {
                System.out.println((float)i/2);
            }
        }
        else
        {
            for(int i = a-1; i > b; i--)
            {
                System.out.println((float)i/2);
            }
        }
    }
}