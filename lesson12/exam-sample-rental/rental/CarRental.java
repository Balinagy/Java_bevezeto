package rental;
import java.util.*;
import java.io.*;

public class CarRental
{
    @Override
    public String toString()
    {
        return "auto";
    }

    private ArrayList<Car> cars;

    public CarRental(String fileName)
    {
        File file = new File(fileName);
        if (file.exists()) {
            this.cars = new ArrayList<Car>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    String [] elsosplit = line.split(":");
                    String brand = elsosplit[0];
                    String [] masodsplit = elsosplit[1].split(",");
                    String licence = masodsplit[0];
                    double price = Double.parseDouble(masodsplit[1]);
                    Car addcar = Car.make(brand, licence, price);
                    if(addcar != null)
                    {
                        cars.add(addcar);
                    }
                    }
                } catch (IOException e) {
            e.printStackTrace();
        }
        } else {
            this.cars = new ArrayList<Car>();
        }
    }

    public int numberOfCars()
    {
        return cars.size();
    }
}