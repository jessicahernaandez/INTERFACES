/*Comprueba el funcionamiento de la Interfaz Dispositivo y
de las clases que han implementado esta interfaz: Computadora y Telefono*/
package DispositivosElectronicos;


public class Main {

    
    public static void main(String[] args) {
        
        //Objetos
        Computadora computadora = new Computadora ();
        Telefono telefono = new Telefono();
        
        //Comprobar funcionamiento de Objetos
        System.out.println("************COMPUTADORA**************");
        computadora.encender();
        computadora.apagar();
        computadora.reiniciar();
        
        System.out.println("**************TELEFONO****************");
        telefono.encender();
        telefono.apagar();
        telefono.reiniciar();
    }
    
}
