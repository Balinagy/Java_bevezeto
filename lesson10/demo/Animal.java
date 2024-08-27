package demo;
public class Animal
{
    private String color;
    public Animal(String color)
    {
        this.color = color;
    }

    public void makesound()
    {
        System.out.println("...");
    }

    @Override
    public String toString()
    {
        String returned = ("Color of animal:" + this.color);
        System.out.println(returned);
        return returned;
    }
}