
package Act_Finales_19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class SocioN implements Comparable {

    //Datos de la clase
    int id;
    String nombre;
    LocalDate fechaNacimiento;
    
    /*Constructor de la clase*/
    public SocioN (int idUsu, String nombreUsu, String fechaNaci) {
        id = idUsu;
        nombre = nombreUsu;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaNacimiento = LocalDate.parse(fechaNaci, formato);
    }
    
    //Devuelve la edad comparando la fecha de nacimiento con la actual.
    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    
    /*Ordenacion natural de la edad*/
    @Override
    public int compareTo(Object o) {
        return edad() - ((SocioN)o).edad();
    }
    
    @Override
    public String toString() {
        return "[Nombre: " + nombre + " ID: " + id + " Fecha de Nacimiento: " + fechaNacimiento + " Edad: " + edad() + "]\n";
    }
    
}
