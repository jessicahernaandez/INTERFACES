/**/
package CARP;


public abstract class MiembroClub {
    
    //Atributos basicos
    String nombre;
    int aniosExperiencia;
    String dni;
    int cuota;
    
    /*Constructor de la clase*/
    public MiembroClub (String n, int anios, String DNI, int cuotaFut) {
        nombre = n;
        aniosExperiencia = anios;
        dni = DNI;
        cuota = cuotaFut;
    }
    
    /*Método Abstracto*/
    abstract String mostrarRol();
    
      
}
