/*Implementa unicamente la interfaz Anfibio*/
package Herencia_Interfaces;

/*Como Anfibio ha heredado de las Interfaces Navegable y Arrancar, posee cada método de la clase.*/
public class Coche implements Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("El coche esta arrancando...");
    }
  
}
