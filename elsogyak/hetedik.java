public class hetedik{
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Give two arguments!");
        }
        else{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int ossz = a+b;
            int kul = a-b;
            int szor = a*b;
            if(b != 0){
                int mod = a%b;
                double oszt = (double)a/(double)b;
                System.out.println("Összeg:" + ossz + " különbség:" + kul + " szorzat:" + szor + " hányados:" + oszt + " modulo:" + mod);
            }
            else{
                System.out.println("Összeg:" + ossz + " különbség:" + kul + " szorzat:" + szor + " hányados modulo nincs");
            }
        }
    }
}