/*Implementa unicamente la interfaz Anfibio*/
package Herencia_Interfaces;

/*Como Anfibio ha heredado de las Interfaces Navegable y Arrancar, posee cada método de la clase.*/
public class Coche implements Anfibio {

    
    @Override
    public void flotar() {
        System.out.println("Flotando...");   
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando...");
        
    }
    
}
