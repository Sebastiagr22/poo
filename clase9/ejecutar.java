import java.util.Scanner;

public class ejecutar {
    public static void main(String[] args) {
   //clase scaner para leer datos por teclado
   Scanner sc = new Scanner(System.in);

   System.out.println("digite el primer numero....");
    int a = sc.nextInt();
   //con el objeto llamamos los metodos de la clase scanner  
   System.out.println("digite el segundo numero....");
    int b = sc.nextInt();

    /*
     * para leer enteros es nextInt() o nextLong()
     * para leer cadenas es nextLine() o next()
     * para leer reales es nextDouble() o nextFloat()
     * para leer boolean es nextBoolean()
     */

   operacionesmatematicas objOp = new operacionesmatematicas (a,b);
   
    int opcion;
        do {
            System.out.println("\n--- MENU DE OPERACIONES ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar al cuadrado");
            System.out.println("6. Elevar al cubo");
            System.out.println("7. Elevar a la n");
            System.out.println("8. Raiz cuadrada");
            System.out.println("9. Raiz cubica");
            System.out.println("10. Raiz de n");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + objOp.sumar());
                    break;
                case 2:
                    System.out.println("La resta es: " + objOp.restar());
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + objOp.multiplicar());
                    break;
                case 4:
                    System.out.println("La division es: " + objOp.dividir());
                    break;
                case 5:
                    System.out.println("El resultado de elevar al cuadrado es: " + objOp.elevarAlCuadrado());
                    break;
                case 6:
                    System.out.println("El resultado de elevar al cubo es: " + objOp.elevarAlCubo());
                    break;
                case 7:
                    System.out.print("Ingrese el exponente n: ");
                    int exponente = sc.nextInt();
                    System.out.println("El resultado de elevar a la n es: " + objOp.elevarAN(exponente));
                    break;
                case 8:
                    System.out.println("La raiz cuadrada es: " + objOp.raizCuadrada());
                    break;
                case 9:
                    System.out.println("La raiz cubica es: " + objOp.raizCubica());
                    break;
                case 10:
                    System.out.print("Ingrese el valor de n para la raiz n: ");
                    int n = sc.nextInt();
                    System.out.println("La raiz de n es: " + objOp.raizN(n));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }     
        } while (opcion != 0);
sc.close();

  }

}     
