package academy.learnprogramming;
public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.6215d);
    }

    public static void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
