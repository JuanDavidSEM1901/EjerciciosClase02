public class Ejercicio01 {

    public static void main(String[] args) {
        var operacion = 6/2*(1+2); // Cuando no se tiene simbolo antes del parentesis se interpretra como multiplicacion 6/2 * (1+2)
        System.out.println(operacion);

        //¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
        /*
         * El resultado correcto es 9 porque segun el orden de operadores 
         * se resuelven primero los parentesis, luego la potencia, luego la multiplicacion y division 
         * y por ultimo la suma y la resta
         * Quedando así:
         * 6/2*(1+2)
         *  3 *  3
         *  Answer = 9
         */

         //Explique por que la otra calculadora genera un resultado diferente.
         /*
          Simplemente por que no se llevo a cabo el orden de operadores, se opero de izquierda a derecha sin importar el orden.
          6/2 * (1+2)
          6/  2 * 3
          6 / 6
          Answer = 1
          */
    }
}