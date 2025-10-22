public class Main {
    public static void main(String[] args) {
        // Crear los objetos correctamente
        instrumento i1 = new guitarra("Fender", "Cuerda", 6);
        instrumento i2 = new Piano("Yamaha", "Teclado", 88);

        // Accedemos a métodos propios con casting
        guitarra g = (guitarra) i1;
        Piano p = (Piano) i2;

        System.out.println(g.afinar());
        System.out.println(p.abrirTapa());
    }
}