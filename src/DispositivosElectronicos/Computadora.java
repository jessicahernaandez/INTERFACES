/*Clase computadora: Simula a una Computadora
-> Implementa los métodos de la Interfaz Dispositivos*/
package DispositivosElectronicos;


public class Computadora implements Dispositivo {

    @Override
    public void encender() {
        System.out.println("Encendiendose...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagandose..");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciandose...");
    }
    
    
    
    
}
