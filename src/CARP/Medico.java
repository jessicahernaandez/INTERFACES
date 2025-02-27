//
package CARP;


public class Medico extends MiembroClub implements Asignable {

    ESPECIALIDAD especialidad;
    
    public Medico(String n, int anio, String DNI, int cuotaFut, ESPECIALIDAD especialidadMedico) {
        super(n, anio, DNI, cuotaFut);
        especialidad = especialidadMedico;
    }

    @Override
    String mostrarRol() {
        return "Jugador [nombre: " + nombre + " Especialidad: " + especialidad + " año: " + aniosExperiencia + " DNI: " + dni + " Cuota: " + cuota;
    }

    @Override
    public void asignarActividad() {
        System.out.println("Revisar Jugador");
    }

    @Override
    public void liberarActividad() {
        System.out.println("Dar de Alta");
    }
    
}
