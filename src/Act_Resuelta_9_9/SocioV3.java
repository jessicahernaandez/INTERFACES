/*Mismo codigo que Socio, solo hemos cambiado la implementacion del metodo CompareTo
En vez de comparar id (enteros), comparamos nombres (Cadenas)*/
package Act_Resuelta_9_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SocioV3 implements Comparable {

    //Datos de la clase
    int id;
    String nombre;
    LocalDate fechaNacimiento;

    /*Constructor de la clase*/
    public SocioV3(int identificador, String nombreSocio, String fecha) {
        id = identificador;
        nombre = nombreSocio;
        //Formato español para las fechas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaNacimiento = LocalDate.parse(fecha, formato);

    }

    int edad() {
        /*El metodo fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS); calcula la cantidad de años entre
        fecha de nacimiento y la fecha actual.
        -> fechaNacimiento.until() devielve un entero long, demasiado largo.
        -> ChronoUnit.YEARS especifica que queremos calcular diferencia en años
        -> La conversion a cast es para acortar en entero largo que devuelve*/
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object ob) {
        SocioV3 otroSocio = (SocioV3) ob;
        return nombre.compareTo(otroSocio.nombre);
    }

    /*Método toString*/
    @Override
    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }
}

