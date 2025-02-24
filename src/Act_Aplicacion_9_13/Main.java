/**/
package Act_Aplicacion_9_13;

import java.util.Arrays;
import java.util.Comparator;


public class Main {

    
    public static void main(String[] args) {
        
        Futbolista [] futbolistas = new Futbolista [] {
            new Futbolista ("B06758171", "Jessica", 20, 15),
            new Futbolista ("A56450923", "Cynthia", 29, 25),
            new Futbolista ("38478251Z", "Andrea", 15, 20),
            new Futbolista ("J63883847", "Liza", 20, 10),
            new Futbolista ("38473742K", "Alba", 25, 5),
        };
        
        //Objetos Comparator
        //Maneras Crecientes (naturales)
        Comparator c1 = new OrdenaDNI();  
        Comparator c2 = new OrdenarNombres(); 
        Comparator c3 = new OrdenarEdades();
        
        //Maneras Decrecientes
        Comparator c1D = c1.reversed();  
        Comparator c2D = c2.reversed(); 
        Comparator c3D = c3.reversed();
            
        //Ordenados por DNI
        Arrays.sort(futbolistas,c1);
        System.out.println("Futbolistas ordenados de manera creciente por su DNI: \n" + Arrays.deepToString(futbolistas));
        Arrays.sort(futbolistas,c1D);
        System.out.println("Futbolistas ordenados de manera decreciente por su DNI: \n" + Arrays.deepToString(futbolistas));
        
        //Ordenados por nombre
        Arrays.sort(futbolistas,c2);
        System.out.println("Futbolistas ordenados de manera creciente por su nombre: \n" + Arrays.deepToString(futbolistas));
        Arrays.sort(futbolistas,c2D);
        System.out.println("Futbolistas ordenados de manera decreciente por su nombre: \n" + Arrays.deepToString(futbolistas));
        
        //Ordenados por edad
        Arrays.sort(futbolistas,c3);
        System.out.println("Futbolistas ordenados de manera creciente por su edad: \n" + Arrays.deepToString(futbolistas));
        Arrays.sort(futbolistas,c3D);
        System.out.println("Futbolistas ordenados de manera decreciente por su edad: \n" + Arrays.deepToString(futbolistas));
        
        //Llamamos el nuevo método
        Comparator c4 = new ComparaEdadesOnombres();
        Arrays.sort(futbolistas, c4);
        System.out.println("Comparando si hay edades iguales, se compara a nombres: \n" + Arrays.deepToString(futbolistas));
    }
    
    
}
