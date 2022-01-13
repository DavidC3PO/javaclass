/**
 *
 * @author
 * @version
 */
import java.io.*; // Needed for PrintWriter and IOException
import java.util.Scanner;   // Needed for Scanner class

/**
 * Chapter 5
 * Programming Challenge 3: Distance File
 * This program demonstrates the Distance class.
 */

public class ModifiedDistanceDemo
{
   public static void main(String[] args)
                      throws IOException
   {
      String filename;  // File name
      double speed;     // Vehicle's speed
      int maxHours;     // Number of hours
      int period;       // Counter for time periods

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the file name.
      System.out.print("The distance report will be " +
                       "written to a file.\nEnter the " +
                       "file name: ");
      filename = keyboard.nextLine();

      // Open the file; use PrintWriter class; name the PrintWriter class object outfile.
      PrintWriter outputFile = new PrintWriter(filename);
      
      // Get the speed.
      System.out.print("Enter the vehicle's speed: ");
      speed = keyboard.nextDouble();
      
      // Validate the speed.
      while (speed < 1)
      {
         System.out.print("Enter a valid speed: ");
         speed = keyboard.nextDouble();
      }
      
      // Get the number of hours.
      System.out.print("Enter the number of hours the " +
                       "vehicle was in motion: ");
      maxHours = keyboard.nextInt();

      // Validate the hours.
      while (maxHours < 1)
      {
         System.out.print("Enter a vaid time: ");
         maxHours = keyboard.nextInt();
      }
      
      // Write the table header.
      outputFile.println("Hour\tDistance Traveled");
      outputFile.println("----------------------------------");
      
      // Write the table of distances.
      period = 1;
      while (period <= maxHours)
      {
         // Create a Distance object for this period.
         Distance d = new Distance(speed, period);
         
         // Write the distance for this period to the file.
         outputFile.println(d.getDistance());
         
         // Increment period.
         period++;
      }
      
      // Close the file.
      outputFile.close();
   }
}
