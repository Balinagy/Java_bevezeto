public class udvozlo{
    public static void main(String[] args){
        System.console().printf("Give me your name!\n");
        String name = System.console().readLine();
        System.console().printf("Hello %s!\n", name);
    }
}