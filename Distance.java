/**
 * 
 * @author
 * @version
 */

/**
 * Chapter 5
 * Programming Challenge 2: Distance Traveled
 * The Distance class stores data for a vehicle's distance traveled.
 */

public class Distance
{
   private double speed;   // The vehicle speed
   private int hours;      // The hours traveled

   /**
    * The constructor initializes the object
    * with a vehicle speed and number hours
    * it has traveled.
    */

   public Distance(double s, int h)
   {
       speed = s;
       hours = h;
   }

   /**
    * The setSpeed method sets the vehicle's
    * speed.
    */

   public void setSpeed(double s)
   {
       speed = s;
   }

   /**
    * The setHours method sets the number of
    * hours traveled.
    */

   public void setHours(int h)
   {
       hours = h;
   }

   /**
    * The getSpeed method returns the speed
    * of the vehicle.
    */

   public double getSpeed()
   {
       return speed;
   }

   /**
    * The getHours method returns the number
    * of hours traveled by the vehicle.
    */

   public int getHours()
   {
       return hours;
   }

   /**
    * The getDistance method returns the
    * distance traveled by the vehicle.
    */

   public double getDistance()
   {
       return speed * hours;
   }
}
