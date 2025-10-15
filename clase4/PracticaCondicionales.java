public class PracticaCondicionales {
  public static void main (String[] args) {

/*
 * ejercicio 4.1a
 * requerimientos: si un angulo es igual a 90 grados,
 * imprimir el mensaje "es un anuglo recto" si no imprimir e mensaje "no es un agulo recto"
 * 
 * entrada: angulo
 * proceso:validar si el anuglo es igual a 90 grados 
 * salida: obtener el mensaje
 */
 int angulo = 80;
 
 if (angulo == 90){
    System.out.println("es un anuglo recto");
 } else { 
    System.out.println("no es un agulo recto");
 }

  
/*Si la temperatura es superior a 100 grados, visualizar el mensaje “por encima del punto de ebullición del agua” sino visualizar el mensaje “por
debajo del punto de ebullición del agua”.
 * entrada: temperatura
 * proceso:validar si la temperatura es superior a 100 grados
 * salida: obtener el mensaje si es mayor o menor
 *
 */
 int temp = 101;
  if (temp > 100){
    System.out.println("por encima del punto de ebullición del agua");
 } else{
    System.out.println("por debajo del punto de ebullición del agua");
 }
}

}
 