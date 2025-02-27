/**/
package Sistema_Gestion_Nuevos_Vehiculos;

import java.util.Arrays;


public class Principal {

    
    public static void main(String[] args) {
        
        //Array con 5 vehiculos
        Vehiculo [] vehiculos = new Vehiculo[] {
            new Auto("Toyota", "Corolla", 2015, 4),
            new Auto("Honda", "Civic", 2018, 4),
            new Camion("Volvo", "FH16", 2012, 20),
            new Auto("Ford", "Focus", 2015, 4),
            new Camion("Scania", "R500", 2019, 25),
        };
        
        //Mostrar el Array con todos sus atributos
        System.out.println("Lista de Vehiculos:");
        System.out.println(Arrays.toString(vehiculos));
        
        //Ordenados de manera natural
        Arrays.sort(vehiculos);
        System.out.println("Lista de Vehiculos ordenados: \n" + Arrays.deepToString(args));
    }
    
}
