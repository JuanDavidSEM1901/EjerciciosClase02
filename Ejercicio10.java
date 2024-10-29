import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);
        double num1, num2, num3;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        num3 = entrada.nextDouble();

        
        double mediaAritmetica = (num1 + num2 + num3) / 3;

        System.out.println("La media aritmetica de los numeros ingresados es: " +mediaAritmetica);

        entrada.close();


    }
}
