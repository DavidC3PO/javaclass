
/**
 * Creates car objects.
 *
 * @author
 * @version
 */
public class CarDemo
{
    public static void main(String [] args)
    {
        Car cyberTruck = new Car("Tesla", "Cybertruck", 40000);
        Car roadster = new Car("Tesla", "Roadster", 200000);

        System.out.println("Make: " + cyberTruck.getMake());
        System.out.println("Model: " + cyberTruck.getModel());
        System.out.println("Price: " + cyberTruck.getPrice());

        System.out.println("--------------------------------");

        System.out.println("Make: " + roadster.getMake());
        System.out.println("Model: " + roadster.getModel());
        System.out.println("Price: " + roadster.getPrice());
    }
}
