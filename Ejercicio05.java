public class Ejercicio05 {
    public static void main(String[] args) {
        var valorPcSinDescuento = 660;
        var porcentajeD = 10.0;
        var descuento = valorPcSinDescuento * (porcentajeD / 100);
        var totalConDescuento = valorPcSinDescuento - descuento;

        System.out.println("El valor total de la PC con un descuento por pronto pago del 10% es: " +totalConDescuento);



    }
}
