package demo;

public class Dog extends Animal
{
    public String specie;

    public Dog(String specie, String color)
    {
        super(color);
        this.specie = specie;
    }

    @Override
    public void makesound()
    {
        System.out.println("Woof");
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " and says: Woof";
    }
}