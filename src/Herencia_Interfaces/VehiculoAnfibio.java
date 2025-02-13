/*Implemeta las Intefaces ANfibio y Navegable*/
package Herencia_Interfaces;


public class VehiculoAnfibio implements Anfibio, Navegable {

    @Override
    public void flotar() {
        System.out.println("Vehiculo Anfibio Flotando...");
    }

    @Override
    public void arrancar() {
        System.out.println("Vehiculo Anfibio Arrancando...");
    }
    
}
