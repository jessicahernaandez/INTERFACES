
package CARP;


public class Jugador extends MiembroClub implements Asignable {
    

    EJUGADOR especialidadJugador;
    
    /*Contructor que llama al super de la clase Madre -> MiembroCLub*/
    public Jugador(String n, int anios, String DNI, int cuotaFut, EJUGADOR Especialidad) {
        super(n, anios, DNI, cuotaFut);
        especialidadJugador = Especialidad;
    }

    @Override
    String mostrarRol() {
        return "Jugador [nombre: " + nombre + " Posicion: " + especialidadJugador + " año: " + aniosExperiencia + " DNI: " + dni + " Cuota: " + cuota;
    }

    @Override
    public void asignarActividad() {
        System.out.println("Jugar Posicion");
    }

    @Override
    public void liberarActividad() {
        System.out.println("Descansar");
    }
    
}
