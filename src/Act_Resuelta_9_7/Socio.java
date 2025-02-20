/**/
package Act_Resuelta_9_7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Socio implements Comparable {

    
    //Datos de la clase
    int id;
    String nombre;
    LocalDate fechaNacimiento;
    
    /*Constructor de la clase*/
    public Socio (int identificador, String nombreSocio, String fecha) {
        id = identificador;
        nombre = nombreSocio;
        //Formato español para las fechas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaNacimiento = LocalDate.parse(fecha, formato);
        
    }
    
    int edad () {
        /*El metodo fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS); calcula la cantidad de años entre
        fecha de nacimiento y la fecha actual.
        -> fechaNacimiento.until() devielve un entero long, demasiado largo.
        -> ChronoUnit.YEARS especifica que queremos calcular diferencia en años
        -> La conversion a cast es para acortar en entero largo que devuelve*/
        return (int)fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
    }
    
    
    /*PRIMERA IMPLEMENTACION DEL MÉTODO ABSTRACTO COMPARETO*/
    /*Método Abstracto de la clase Comparable
    -> Debe ser public*/
    /*
    @Override
    public int compareTo(Object ob) {
        int resultado;
        
        Socio otroSocio = (Socio) ob;
        
        if (id < otroSocio.id) {
            resultado = -1; //Numero negativo: va antes que ob.
        } else if (id > otroSocio.id) {
            resultado = 1; //Numero Positivo: va despues que ob
        } else {
            resultado = 0; //Cero: Son iguales
        }
        
        return resultado;
    } */

    
    /*SEGUNDA IMPLEMENTACION DEL METODO ABSTRACTO COMPARETO
    -> Esta implementación solo se puede hacer cuando se desea
    comporar algun atributo de tipo entero*/
    @Override
    public int compareTo (Object ob) {
        return id - ((Socio)ob).id;
    }
    
    /*Método toString*/
    @Override
    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }
    
    
}
