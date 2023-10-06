public class Ejercicio21{

    public static void main(String[] args) {
        double celsius = 25.0; 
        double fahrenheit = convertirCelsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.");
    }

    public static double convertirCelsiusAFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
