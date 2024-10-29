public class Ejercicio02 {

    public static void main(String[] args) {
        /*
         * Ejercicio 2: ¿Ves algún error en el precio?
         * En el mercado, podemos encontrar que el precio del producto Pernil Iberic
         * D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor
         * nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el
         * precio?
         * 
         * En este reto tienes que hacer un programa que calcule correctamente el precio
         * por kilo del producto.
         */
        // 100gramos = 5,95 euros// 100gramos*10 = 1kg // 5,95 euros * 10 = precio de un kg
        var precio100G = 5.95;
        var precioPorKilo = precio100G * 10;
        System.out.println("El precio correcto por Kilogramo es "+precioPorKilo+" €");

        // El precio por kilo indicado por el vendedor es incorrecto. 
        //El precio correcto por kilo es 59,5 € 

    }

}
