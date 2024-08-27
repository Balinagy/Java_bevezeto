package famous.sequence;

//behúzni alapmappába a fájlokat amik itt vannak, tesztfájlt, stb
//fordítjuk a fájlt, és teszteljük a ./check.sh FibonacciStructureTest.java FibonacciStructureTest paranccsal
//tesztelőben is kell package import
//ha ckeck.sh nem fut, akkor chmod

public class Fibonacci{
    public static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
}