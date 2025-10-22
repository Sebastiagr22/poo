public class Piano extends instrumento {
    private int teclas;

    public Piano(String nombre, String tipo, int teclas) {
        super(nombre, tipo);
        this.teclas = teclas;
    }

    @Override
    protected String tocar() {
        return "Suena como 'pling pling 🎵'";
    }

    public String abrirTapa() {
        return "Abres la tapa del piano " + nombre + " con " + teclas + " teclas.";
    }
}