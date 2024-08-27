/*
kezdés, bekér egy szót és kiírja konzolba
public class practice1{
    public static void main(String[] args){
        System.out.println("Give me a word!");
        String a = System.console().readLine();
        System.console().printf("The word you gave me: %s\n", a);
    }
}
*/

/*
public class practice1{
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            System.console().printf("%f\n", ((float)i)/2);
        }
    }
}
*/


/*
public class practice1{
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        else {
            return (fibonacci(n-1)+fibonacci(n-2));
        }
        
    }
    public static void main(String[] args){
        System.out.println("Adj meg egy számot!\n");
        int a = Integer.parseInt(System.console().readLine());
        System.console().printf("Fib %i = %i\n", a, fibonacci(a));
    }
}
*/