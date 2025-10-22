public class practicas {
    private String perro;
    private int edad;
    private double peso;
   
    public practicas() {
        this.perro = "";
        this.edad = 0;
        this.peso = 0.0;

    public practicas (String perro, int edad, double peso){
        setPerro (perro);
        setEdad (edad);
        setPeso (peso);

        getperro(){
            retrun perro;
        }

        public void setperro(String perro){
        if (perro != null && !perro.trim().isEmpty()){
         this.perro = perro;
          }
        }

    

        getedad(){
            retrun edad;
        }
        public void setedad(int edad){
            if (edad >=0){
                this.edad = edad;

            }
        }
      
        getpeso(){
            retrun peso;
        }
        public void setpeso

        

       }




    }
}