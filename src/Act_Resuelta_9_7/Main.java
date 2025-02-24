/*Comprobacion de las dos implementaciones del método CompareTo*/
package Act_Resuelta_9_7;

public class Main {

    public static void main(String[] args) {
        
        //Objetos de la clase Socio
        Socio socio1 = new Socio(54, "Jessica", "23-09-2004");
        Socio socio2 = new Socio(35, "Andrea", "17-01-2011");
        
        System.out.println("***Comparacion con uno mayor***");
        socio1.toString();
        socio2.toString();
        System.out.println("¿Cual de los dos tiene el mayor id?");   
        
        if (socio1.compareTo(socio2) > 0) {
            System.out.println(socio1.nombre + " tiene un número de id superior a " + socio2.nombre);
        } else if (socio1.compareTo(socio2) < 0) {
            System.out.println(socio2.nombre + " tiene un número de id superior a " + socio1.nombre);
        } else {
            System.out.println("Los dos tienen el mismo id");
        }
    }
}
