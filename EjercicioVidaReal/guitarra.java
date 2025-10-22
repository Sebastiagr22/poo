public class guitarra extends instrumento {
    private int cuerdas;

    public guitarra(String nombre, String tipo, int cuerdas){
        super (nombre, tipo);
        this.cuerdas = cuerdas;
    }
    @Override 
    protected String tocar (){
        return "suena como strum strum";
    }

     public String afinar() {
        return nombre + " está siendo afinada. Tiene " + cuerdas + " cuerdas.";
    }
}
