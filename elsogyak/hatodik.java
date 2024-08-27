public class hatodik{
    public static void main(String[] args){
        System.out.println("Give me two numbers!");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        for (int i = a+1 ; i < b; i++){
            System.out.println((double)i/2);
        }
    }
}