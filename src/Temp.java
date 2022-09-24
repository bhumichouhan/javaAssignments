/* Temp < 0 then Freezing weather
        Temp 0-10 then Very Cold weather
        Temp 10-20 then Cold weather
        Temp 20-30 then Normal weather
        Temp 30-40 then Hot weather
        Temp >=40 then Very Hot weather

 */
public class Temp {
    public void temperature(int t) {
        if (t < 0)
            System.out.println(" Freezing weather");
        else if (t >= 0 && t < 10)
            System.out.println("Very Cold weather");
        else if (t >= 10 && t < 20)
            System.out.println("Cold weather");
        else if (t >= 20 && t < 30)
            System.out.println(" Normal weather");
        else if (t >= 30 && t < 40)
            System.out.println(" Hot weather");
        else if (t >= 40)
            System.out.println("very hot weather");
    }
}
