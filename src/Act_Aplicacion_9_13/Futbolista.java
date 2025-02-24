/* */
package Act_Aplicacion_9_13;

public class Futbolista {

    //Datos de la clase
    String dni;
    String nombre;
    int edad;
    int numGoles;

    /*Constructor de la clase*/
    public Futbolista(String dniUsu, String nombreUsu, int edadFut, int numeroGoles) {
        dni = dniUsu;
        nombre = nombreUsu;
        edad = edadFut;
        numGoles = numeroGoles;
    }
    
    @Override
    public String toString() {
        return "Futbolistas [nombre : " + nombre + " dni: " + dni + " edad: " + edad + " número de goles: " + numGoles + " ]\n"; 
    }
    
    @Override
    public boolean equals(Object otro) {
        //Casting
        Futbolista futOtro = (Futbolista) otro;
        
        boolean iguales = false;
        
        if(dni.equals(futOtro.dni)) {
            iguales = true;
        }
        
        return iguales;
    }

}
