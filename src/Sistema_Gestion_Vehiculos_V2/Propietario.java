/*Clase Propietario: Representa al propietario del vehiculo*/
package Sistema_Gestion_Vehiculos_V2;


public class Propietario {
    
    //Datos de la clase
    String nombre;
    String apellido;
    String dni;
    String direccion;
    
    /*Constructor de la clase*/
    public Propietario (String nom, String apell, String dniUsu, String dire) {
        nombre = nom;
        apellido = apell;
        dni = dniUsu;
        direccion = dire;
    }
    
    /*Método toString para mostrar información del Propietario*/
    @Override
    public String toString () {
        return "Propietario [nombre: " + nombre + " apellido: " + apellido + " dni: " + dni + " direccion: " + direccion + "]";
    }
    
}
