public class operacionesmatematicas {
    // Atributos
    private int n1;
    private int n2;

    // Constructor permite inicializar la clase 
    //(tiene el mismo nombre de la clase)
    /*
     * firma del metodo constructor
     * visibilidad: publico
     * nombre: operacionesmatematicas
     * cuantos parametros: 2
     * de que tipo son los parametros
     * parametro 1 tipo entero
     * parametro 2 tipo entero
     */

    public operacionesmatematicas(int n1, int n2) {
        this.n1 = n1; //this es una autoreferencia al atributo de la clase
        this.n2 = n2;
    }
    // Metodos (funciones o acciones que hace el objeto)
     
    public int sumar (){
        return n1 + n2;
    }
    public int restar (){
        return n1 - n2;
    }
    public int multiplicar (){
        return n1 * n2;
    }
    public double dividir (){
        double resultado = 0.0;
        if (n2 == 0){
            resultado = 0.0;
        } else {
                resultado = (double) n1 / (double) n2; 
            }
        return resultado;
    }
    // ...existing code...

    public int elevarAlCuadrado() {
        return n1 * n1;
    }

    public int elevarAlCubo() {
        return n1 * n1 * n1;
    }

    public double elevarAN(int exponente) {
        return Math.pow(n1, exponente);
    }

    public double raizCuadrada() {
        return Math.sqrt(n1);
    }

    public double raizCubica() {
        return Math.cbrt(n1);
    }

    public double raizN(int n) {
        return Math.pow(n1, 1.0 / n);
    }

}
    
