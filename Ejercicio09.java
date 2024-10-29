public class Ejercicio09 {
    public static void main(String[] args) {
        var gradosCelsius = 65;
        var fahrenheit = gradosCelsius * 9/5 + 32;
        var kelvin = gradosCelsius + 273.15;

        System.out.println("CONVERTIDOR DE GRADOS CELSIUS A FAHRENHEIT Y KELVIN");
        System.out.println("Grados Celsius a conventir " +gradosCelsius );
        System.out.println("Grados Celsius a Fahrenheit: " +fahrenheit);
        System.out.println("Grados Celsius a Kelvin: " +kelvin);
    }
}
