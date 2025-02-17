/*Comprueba el funcionamiento de los nuevos metodos en la clase ListaV2
-> Estos métodos vienen implementados de la Interfaz Cola*/
package Encolar_Desencolar;


public class Prueba {

    
    public static void main(String[] args) {
        
        //Objetos
        ListaV2 lista1 = new ListaV2(); 
        
        //Prueba de métodos encolar y desencolar 
        /*ENCOLAR*/
        lista1.encolar(34);
        lista1.encolar(45);
        lista1.encolar(15);
        lista1.encolar(76);
        lista1.encolar(23);
        System.out.println("Elementos en cola: ");
        lista1.mostrarElementos();
        
        /*DESCOLAR*/
        System.out.println("Desencolando elementos...");
        lista1.mostrarElementos();
        lista1.desencolar();
        lista1.mostrarElementos();
        lista1.desencolar();
        lista1.mostrarElementos();
        lista1.desencolar();
        lista1.mostrarElementos();
        lista1.desencolar();
        
        
        
    }
    
}
