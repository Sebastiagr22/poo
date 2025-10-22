public class ejecutarHerenciaAnimal {
    public static void main(String[] args) {
     
        animales tomoe = new gato() ;
        animales doki = new perro();
        
        tomoe.hacerSonido();
        doki.hacerSonido();
    }
}
