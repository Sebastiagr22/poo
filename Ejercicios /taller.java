
public class taller {
    public static void main(String[] args) {
        /*
         * Escribir un programa que solicite al usuario introducir
         * dos números. Si el primer número introducido es ma-
         * yor que el segundo número, el programa debe impri-
         * mir el mensaje El primer número es el mayor,
         * en caso contrario el programa debe imprimir el men-
         * saje El primer número es el más pequeño.
         * Considerar el caso de que ambos números sean igua-
         * les e imprimir el correspondiente mensaje.
         */

        int num1 = 15;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println("El primer número es el mayor.");
        } else if (num1 < num2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        /*
         * dados 3 numeros deduse cual es el central
         */
        int a = 10;
        int b = 25;
        int c = 15;

        if ((a > b && a < c) && (a > c && a < b)) {
            System.out.println("El número central es: " + a);
        } else if ((b > a && b < c) && (b > c && b < a)) {
            System.out.println("El número central es: " + b);
        } else {
            System.out.println("El número central es: " + c);

            /*
             * Calcular la raíz cuadrada de un número y escribir su
             * resultado. Considerando el caso en que el número sea
             * negativo.
             */

            double num = 25;

            if (num < 0) {
                System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                double raiz = Math.sqrt(num);
                System.out.println("La raíz cuadrada de " + num + " es: " + raiz);
            }

            /*
             * Escribir los diferentes métodos para deducir si una
             * variable o expresión numérica es par.
             */
            if (num % 2 == 0) {
                System.out.println("El número es par (método 1).");
            } else {
                System.out.println("El número es impar (método 1).");
            }

            // dividiendo y multiplicando
            if ((num / 2) * 2 == num) {
                System.out.println("El número es par (método 2).");
            } else {
                System.out.println("El número es impar (método 2).");
            }

            /*
             * Se desea realizar una estadística de los pesos de los
             * alumnos de un colegio de acuerdo a la siguiente tabla:
             * Alumnos de menos de 40 kg.
             * Alumnos entre 40 y 50 kg.
             * Alumnos de más de 50 kg y menos de 60 kg.
             * Alumnos de más o igual a 60 kg.
             */

            int peso = 55;

            if (peso < 40) {
                System.out.println("Alumno de menos de 40 kg");
            } else if (peso >= 40 && peso <= 50) {
                System.out.println("Alumno entre 40 y 50 kg");
            } else if (peso > 50 && peso < 60) {
                System.out.println("Alumno de más de 50 kg y menos de 60 kg");
            } else {
                System.out.println("Alumno de más o igual a 60 kg");
            }

            /*
             * Realizar un algoritmo que averigüe si dados dos núme-
             * ros introducidos por teclado uno es divisor del otro.
             */

            int numero1 = 25;
            int numero2 = 5;

            if (numero1 % numero2 == 0) {
                System.out.println(numero2 + " es divisor de " + numero1);
            } else if (numero2 % numero1 == 0) {
                System.out.println(numero1 + " es divisor de " + numero2);
            } else {
                System.out.println("Ninguno es divisor del otro");
            }

            /*
             * Un ángulo se considera agudo si es menor de 90
             * grados, obtuso si es mayor de 90 grados y recto si
             * es igual a 90 grados. Utilizando esta información,
             * escribir un algoritmo que acepte un ángulo en grados
             * y visualice el tipo de ángulo correspondiente a los
             * grados introducidos.
             */
            
              int angulo = 120;

        if (angulo < 90) {
            System.out.println("El ángulo es agudo");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("El ángulo es obtuso");
        } else if (angulo == 180) {
            System.out.println("El ángulo es llano");
        } else {
            System.out.println("El ángulo no está dentro del rango esperado (0-180)");
        }

/*
 * El sistema de calificación americano (de Estados
Unidos) se suele calcular de acuerdo al siguiente
cuadro:
Grado numérico Grado
en letra

Grado mayor o igual a 90
Menor de 90 pero mayor o igual a 80
Menor de 80 pero mayor o igual a 70
Menor de 70 pero mayor o igual a 69
Menor de 69

Utilizando esta información, escribir un algo-
ritmo que acepte una calificación numérica del es-
tudiante (0-100), convierta esta calificación a su

equivalente en letra y visualice la calificación corres-
pondiente en letra.
 */ 
       int nota = 85; // nota definida de ejemplo
        char letra;

        if (nota >= 90) {
            letra = 'A';
        } else if (nota >= 80) {
            letra = 'B';
        } else if (nota >= 70) {
            letra = 'C';
        } else if (nota >= 69) {
            letra = 'D';
        } else {
            letra = 'F';
        }

        System.out.println("La calificación numérica es: " + nota);
        System.out.println("La calificación en letra es: " + letra);
        }



      }
 }
