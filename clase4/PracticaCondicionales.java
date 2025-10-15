public class PracticaCondicionales {
    public static void main(String[] args) {

        /*
         * ejercicio 4.1a
         * requerimientos: si un angulo es igual a 90 grados,
         * imprimir el mensaje "es un anuglo recto" si no imprimir e mensaje
         * "no es un agulo recto"
         * 
         * entrada: angulo
         * proceso:validar si el anuglo es igual a 90 grados
         * salida: obtener el mensaje
         */
        int angulo = 80;

        if (angulo == 90) {
            System.out.println("es un anuglo recto");
        } else {
            System.out.println("no es un agulo recto");
        }

        /*
         * Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima
         * del punto de ebullición del agua”
         * sino visualizar el mensaje “por
         * debajo del punto de ebullición del agua”.
         * entrada: temperatura
         * proceso:validar si la temperatura es superior a 100 grados
         * salida: obtener el mensaje si es mayor o menor
         *
         */
        int temp = 101;
        if (temp > 100) {
            System.out.println("por encima del punto de ebullición del agua");
        } else {
            System.out.println("por debajo del punto de ebullición del agua");

        }
        /*
         * Si el número es positivo, sumar el número a total
         * de positivos, sino sumar al total de negativos.
         * 
         */
        int nume = -33;
        int positivo = 3;
        int negativos = -3;

        if (nume > 0) {
            positivo = positivo + nume;
            System.out.println("el total positivos es " + positivo);
        } else {
            negativos = negativos + nume;
            System.out.println("el total negativos es " + negativos);
        }

        /*
         * Si x es mayor que y, y z es menor que 20, leer
         * un valor para p.
         * 
         */
        int p = 0;
        int x = 4;
        int y = 3;
        int z = 19;
        if (x > y && z < 20) {
            p = 1;
            System.out.println("valor de p " + p);
        } else {
            p = 0;
            System.out.println("no se e da valor a p ");
        }

        /*
         * Un ángulo se considera agudo si es menor de 90
         * grados, obtuso si es mayor de 90 grados y recto si
         * es igual a 90 grados. Utilizando esta información,
         * escribir un algoritmo que acepte un ángulo en grados
         * y visualice el tipo de ángulo correspondiente a los
         * grados introducidos.
         * 
         * entrada: angulo
         * proceso: validar si el angulo esta entre los siguientes rangos
         * salida: mostrar si es un angulo agudo, obtuso, o recto
         */

        int a = 90;
        if (a < 90) {
            System.out.println("angulo agudo");
        } else {
            if (a > 90) {
                System.out.println("angulo obtuso");
            } else {

                System.out.println("el amgulo es recto");
            }
        }
    }

}
