package rental;
import java.util.*;

public class Car
{
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.brand);
        sb.append(" (");
        sb.append(this.licensePlate);
        if(this.price < 10)
        {
            sb.append(")   ");
        }
        else if(this.price < 100) { sb.append(")  "); }
        else { sb.append(") "); }
        sb.append((int)this.price);
        sb.append(",0 EUR");
        return sb.toString();
    }

    private String brand;
    private String licensePlate;
    private double price;
    public double getPrice()
    {
        return this.price;
    }
    private static final double MAX_PRICE = 500.0;

    private final static Car CAR_OF_THE_YEAR = make("Alfa Romeo","ABC 123", MAX_PRICE);

    private Car (String a, String b, double c)
    {
        this.brand = a;
        this.licensePlate = b;
        this.price = c;
    }

    public static Car make(String brand, String license, double price) {
    int brandLength = brand.length();
    if (brandLength < 2) {
        return null;
    }
    for (int i = 0; i < brandLength; i++) {
        char ch = brand.charAt(i);
        if (!Character.isLetter(ch) && ch != ' ') {
            return null;
        }
    }
    Car returnable = new Car(brand, license, price);
    if (!returnable.isValidLicensePlate(license)) {
        return null;
    }
    if (price <= 0 || price > MAX_PRICE) {
        return null;
    }
    return returnable;
    }

    public boolean isCheaperThan(Car a)
    {
        if(a.getPrice() > this.getPrice())
        {
            return true;
        }
        return false;
    }

    public void decreasePrice()
    {
        if(this.price != MAX_PRICE && this.price > 10)
        {
            this.price -= 10;
        }
    }

    private boolean isValidLicensePlate(String license)
    {
            if (license.length() != 7) {
            return false;
        }
        char[] licensePlate = license.toCharArray();
        for (int i = 0; i < 3; i++) {
            if (!Character.isUpperCase(licensePlate[i])) {
                return false;
            }
        }
        if (!(licensePlate[3]==' ')) {
                return false;
            }
        for (int i = 4; i < 7; i++) {
            if (!Character.isDigit(licensePlate[i])) {
                return false;
            }
        }
        return true;
    }
}