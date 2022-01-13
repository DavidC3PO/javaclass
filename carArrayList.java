
/**
 * Write a description of class carArrayList here.
 *
 * @author
 * @version
 */
import java.util.ArrayList;
public class carArrayList
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
        car cyberTruck = new car("Tesla", "Cybertruck", 40000);
        car roadster = new car("Tesla", "Roadster", 200000);
        car modelX = new car("Tesla", "Model X", 100000);

        ArrayList<car> cars = new ArrayList<car>();

        cars.add(cyberTruck);
        cars.add(roadster);
        cars.add(modelX);

        System.out.println("Make    Model   Price");
        System.out.println("----------------------");

        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }

    }
}
