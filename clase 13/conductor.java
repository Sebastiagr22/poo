public class conductor {
    private int cedula;
    private String nombre;

    public conductor (int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;   
    }
    @Override
    public String toString(){
        return "conductor [cedula" + cedula + ", nombre" + nombre + "]";
    }
}
