public class Ejercicio06 {
    public static void main(String[] args) {
        var valorConDescuento = 34;
        var porcentajeDescuento = 15.0;
        // calcular el valor original
        var valorSinDescuento = valorConDescuento / (1 - (porcentajeDescuento / 100));
        System.out.println("El valor de los pantalones sin el descuento es de: " +valorSinDescuento+"€");
    }
}
