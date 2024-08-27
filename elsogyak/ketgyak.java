public class ketgyak{
    public static void main(String[] args){
        System.out.println("Give a number!");
        int n = Integer.parseInt(System.console().readLine());
        for(int s = 0; s <= n; s++)
        {
            int sum = 0;
            for(int i = s; i>0;i--){
                if(s%i==0){
                    sum+=i;
                }
            }
            if(s*2==sum){
                System.out.println(s + " is perfect.");
            }
            else{
                System.out.println(s + " is imperfect.");
            }
        }
    }
}