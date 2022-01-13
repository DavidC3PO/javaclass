
/**
 * Converts Celsius to Fahrenheit.
 *
 * @author (David Kirchhoff)
 * @version (10-8-2021)
 */
public class centigrade
{
    public static void main (String[] args)
    {
        int MaxNum = 20;
        double fahr = 0;
        double cel = 0;

        System.out.println("Fahr\tCel");
        System.out.println("-----------");

        for (int i = 0; i <= MaxNum; i++)
        {
            fahr = (cel * 9/5) + 32;
            System.out.println(fahr + "\t" +cel);
            cel++;
        }
    }
}
