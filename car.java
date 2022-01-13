
/**
 * Write a description of class car here.
 *
 * @author
 * @version
 */
public class car
{
    private String make;
    private String model;
    private int price;

    public car(String carMake, String carModel, int carPrice)
    {
        make = carMake;
        model = carModel;
        price = carPrice;
    }

    // Get Methods

    public String getMake()
    {
        return make;
    }


    public String getModel()
    {
        return model;
    }


    public int getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return make + " " + model + " " + price;
    }
    
    
}
