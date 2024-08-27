public class nyolcadik{
    public static void main(String[] args){
        System.out.println("Give me n!");
        int n = Integer.parseInt(System.console().readLine());
        int sum = 1;
        for(int i = n ; i > 0; i--){
            sum*=i;
        }
        System.out.println("Sum is:" + sum);
    }
}