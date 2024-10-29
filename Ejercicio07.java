import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);

        int num1, num2;
        

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        var suma = num1 + num2;
        var resta = num1 - num2;
        var multiplicacion = num1 * num2;
        var division = num1 / num2;

        System.out.println("CALCULADORA");
        System.out.println("Suma "+num1+" + "+num2+" es: " +suma);
        System.out.println("Resta "+num1+" - "+num2+" es: " +resta);
        System.out.println("Multiplicacion "+num1+" * "+num2+" es: " +multiplicacion);
        System.out.println("Division "+num1+" / "+num2+" es: " +division);


        entrada.close();



    }
}
