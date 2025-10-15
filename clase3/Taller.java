package clase3;

public class Taller {
    public static void main (String [] args){

     Double d1= 42.0;
     double d2= 58.5; 
     double d3= 37.2;
     double t1= 0.9;
     double t2=1.4;
     double t3=0.8;
     double v1= 0;
     double v2= 0;
     double v3= 0;
     double vprom= 0;
     double l1= 5.1;
     double l2= 6.9;
     double l3= 4.3;
     double kml1 = 0;
     double kml2 = 0;
     double kml3 = 0;
     double kmltotal = 0;
     double precioLitro = 1.35; 
     double masaCargaKg = 1200;
     double largo = 2.0;
     double ancho = 1.2; 
     double alto = 1.1; 
     double costoComb = 0;
     double deprec = 0;
     double deprecPorKm = 0.08;
     double volCamionM3 = 10.0;
     double p1 = 2.5; 
     double p2 = 3.0; 
     double p3 = 2.0; 
     double peajes = 0;
     double costoDirecto = 0;
     double costoPorKm = 0;
     double volumenM3 = 0;
     double ocupacion = 0;
     double densidad = 0;
     double fco= 2.68;
     double co2total = 0;
     double co2porkm = 0;
     double vms = 0;
     double galTot = 0;
     double galPorLitro = 0.264172; 
     double vmmın = 30;
     double vmmax = 90;
     double vnormal = 0;
     double  σ = 0; 
     double vmedia =0;
     double vpond = 0;
     double va = 40, vb = 80, ca = 0.05, cb = 0.09;
     double a = -0.0008, b = 0.08, c = 4.0;
     double c_vprom = 0;
     double costoMant = 0;
     double kmlModelo = 0;
     double litrosModelo = 0;
     double w1 = 0.25, w2 = 0.25, w3 = 0.25, w4 = 0.25; 
     double score = 0;
         

     v1= d1/t1;
     v2= d2/t2;
     v3= d3/t3;
     vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);
     kml1 = d1/l1;
     kml2 = d2/l2;
     kml3 = d3/l3;
     kmltotal = (d1  + d2 +d3) / (l1 + l2 + l3);
     costoComb = (l1 + l2 + l3) * precioLitro;
     deprec = (d1+d2+d3)* deprecPorKm;
     peajes = p1+p2+p3;
     costoDirecto = costoComb + deprec + peajes;
     costoPorKm = costoDirecto / (d1 + d2 + d3);
     volumenM3 = largo * ancho * alto ;
     densidad = masaCargaKg / volumenM3 ;
     ocupacion = volumenM3 / volCamionM3; 
     co2total = (l1 + l2 + l3) * fco;
     co2porkm = co2total / (d1 + + d2 + d3);
     vms = vprom * (1000/3600);
     galTot = (l1 + l2 + l3) * galPorLitro;
     vnormal = (vprom - vmmın) / (vmmax - vmmın);
     vmedia = (v1 + v2 + v3) / 3;
     σ = Math.sqrt((Math.pow(v1 - vmedia, 2) + Math.pow(v2 - vmedia, 2) + Math.pow(v3 - vmedia, 2)) / 3);
     vpond = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);
     c_vprom = ca + (cb - ca) * (vprom - va) / (vb - va);
     costoMant = c_vprom * (d1+d2+d3);
     kmlModelo = a*vprom*vprom + b*vprom + c;
     litrosModelo = (d1+d2+d3) / kmlModelo;
     score = w1*(1/costoPorKm) + w2*kmltotal + w3  * (1/ co2porkm ) + w4*(1/(1+ σ ));


       System.out.println("el resultado es: " + vprom);
       System.out.printf("el resultado es :" + v1);
       System.out.println("el resultado es :" + v2);
       System.out.println("el resultado es :" + v3);
       System.out.println("km1 " + kml1);
       System.out.println("km1 " + kml2);
       System.out.println("km1 " + kml3);
       System.out.println("km1 " + kmltotal);
       System.out.println("costocomb " + costoComb);
       System.out.println("deprec " + deprec);
       System.out.println("peajes " + peajes);
       System.out.println("costo directo " + costoDirecto);
       System.out.println("costo por km " + costoPorKm );
       System.out.println("volumen " + volumenM3);
       System.out.println("densidad " + densidad);
       System.out.println("ocupacion " + ocupacion);
       System.out.println(" c2total " + co2total);
       System.out.println("co2 por km " + co2porkm);
       System.out.println("vms " + vms);
       System.out.println("galon total " + galTot);
       System.out.println("valor normal " + vnormal);
       System.out.println("theta " + σ);
       System.out.println("vpond " + vpond);
       System.out.println ("c prom " + c_vprom);
       System.out.println("costo mant " + costoMant);
       System.out.println("litros modelo " + litrosModelo);
       System.out.println("kml modelo " + kmlModelo);
       System.out.println("score " + score );








    }
}
