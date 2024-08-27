public class egygyak{
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("Give a number as an argument!");
        }
        else{
            int sum = 0;
            int a = Integer.parseInt(args[0]);
            for(int i = a; i>0;i--){
                if(a%i==0){
                    sum+=i;
                }
            }
            if(a*2==sum){
                System.out.println("Perfect.");
            }
            else{
                System.out.println("Imperfect.");
            }
        }
    }
}