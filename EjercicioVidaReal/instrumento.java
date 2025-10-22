public class instrumento {
    protected String nombre;
    protected String tipo;

    public instrumento(String nombre, String tipo){
    this.nombre = nombre;
    this.tipo = tipo;
  }
  protected String tocar(){
    return "hace sonidos";
  }
  public String Descripcion (){
    return "instrumento" + nombre + "tipo" + tipo + "sonido" + tocar(); 
  }
}