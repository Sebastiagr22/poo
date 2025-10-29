public class Vehiculo {
    private String placa;
    private Motor motor;

    public Vehiculo(String placa, Motor motor){
        this.placa = placa;
        this.motor = motor;

    }
public void asignarConductor (conductor conductor) {
    System.out.println("el conductor(a): " + conductor + "fue asignado");
}
 @Override
 public String toString (){
     return "vehiculo {placa:" + placa + "motor" + motor + "}";
 }
}
