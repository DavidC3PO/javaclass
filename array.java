

/**
 * Car blueprint.
 *
 * @author
 * @version
 */
public class array
{
    private String make;
    private String model;
    private int price;

    public array(String carMake, String carModel, int carPrice)
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
        return "Make: " + make +  ", Model:" + model + ", Price: " + price;
    }

    
}

    
    
    

