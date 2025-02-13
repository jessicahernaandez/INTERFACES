/*Implementacion de las 3 clases e invocacion de sus métodos.*/
package Herencia_Interfaces;


public class Main {

    
    public static void main(String[] args) {
        
        //Objetos
        Coche coche = new Coche();
        Lancha lancha = new Lancha();
        VehiculoAnfibio vehiculoAnfi = new VehiculoAnfibio();
        
        //Prueba Coche
        System.out.println("Probando el coche:");
        coche.arrancar();
        System.out.println("\n");
        
        //Prueba Lancha
        System.out.println("Probando la lancha:");
        lancha.flotar();
        System.out.println("\n");
        
        //Prueba VehiculoAnfibio
        System.out.println("Probando el vehiculo anfibio:");
        vehiculoAnfi.arrancar();
        vehiculoAnfi.cambiarModo("tierra");
        vehiculoAnfi.cambiarModo("agua");
        vehiculoAnfi.flotar();
        
    }
    
}
