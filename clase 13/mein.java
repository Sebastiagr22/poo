public class mein {
    public static void main (String [] args) throws Exception {
    Motor objmotor = new Motor ("FE345", "Mercedez");
    conductor objcConductor = new conductor(122334, "lio messi");

    System.out.println(objmotor);
    System.out.println(objcConductor);

    Vehiculo objvehiculo = new Vehiculo("pom321", objmotor);
    System.out.println(objvehiculo);
    }
}
