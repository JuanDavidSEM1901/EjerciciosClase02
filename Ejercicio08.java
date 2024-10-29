import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        var entrada = new Scanner (System.in);
        double base;
        double altura;

        System.out.print("Ingrese la base del rectangulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = entrada.nextDouble();

        var formulaArea = base * altura;
        var formulaPerimetro = 2 * (base + altura);

        System.out.println("HALLAR AREA Y PERIMETRO DE UN RECTANGULO\nCon una base de "+base+" y una altura de "+altura);
        System.out.println("El area del rectangulo es de: " +formulaArea);
        System.out.println("El perimetro del rectangulo es de: " +formulaPerimetro);

        entrada.close();
    }

}
