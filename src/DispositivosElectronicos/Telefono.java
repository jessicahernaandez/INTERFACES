/*Clase Telefono: Simula un telefono. 
-> Implementa la interfaz Dispositivos*/
package DispositivosElectronicos;


public class Telefono implements Dispositivo {

    @Override
    public void encender() {
        System.out.println("Encendiendose...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagandose...");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciandose...");
    }
    
    
    
    
}
