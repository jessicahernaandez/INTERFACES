/* */
package CARP;


public class Entrenador extends MiembroClub implements Asignable {
    
    ESTILOTACTICO estilo;

    public Entrenador(String n, int anio, String DNI, int cuotaFut, ESTILOTACTICO estiloT) {
        super(n, anio, DNI, cuotaFut);
        estilo = estiloT;
    }

    @Override
    String mostrarRol() {
        return "Entrenador [nombre: " + nombre + " Estilo Tactico: " + estilo + " año: " + aniosExperiencia + " DNI: " + dni + " Cuota: " + cuota;
    }

    @Override
    public void asignarActividad() {
        System.out.println("Dirigir Entrenamiento");
    }

    @Override
    public void liberarActividad() {
        System.out.println("Finalizar Entrenamiento");
    }
    
}
