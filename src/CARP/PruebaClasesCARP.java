/**/
package CARP;

import static CARP.EJUGADOR.DEFENSA;
import static CARP.EJUGADOR.DELANTERO;
import static CARP.ESPECIALIDAD.FISIOTERAPIA;
import static CARP.ESTILOTACTICO.OFENSIVO;
import java.util.Arrays;

public class PruebaClasesCARP {

    public static void main(String[] args) {

        //Clase anonima con los objetos
        MiembroClub[] miembros = new MiembroClub[]{
            new Jugador("Messi", 10, "B2317817", 1000,DELANTERO),
            new Jugador("Julian", 9, "B23173", 950,DELANTERO),
            new Jugador("Diaz", 8, "B22327817", 950, DEFENSA),
            new Entrenador("Gallardo", 50, "38471843", 100, OFENSIVO),
            new Entrenador("Diego", 25, "098771843", 100, OFENSIVO),
            new Medico("Jose", 30, "232471843", 100, FISIOTERAPIA),
    };
        
        System.out.println("Miebros del Club: ");
        for( int i = 0; i < miembros.length; i++) {
            System.out.println(miembros[i].mostrarRol());
        }
}
}
