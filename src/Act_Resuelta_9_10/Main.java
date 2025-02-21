
package Act_Resuelta_9_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class Main {

    public static void numAleatorios (Integer [] array) {
        
        Random random = new Random();
        
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }
    
    
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[20];
          
        //Introducir numeros Aleatorios
        numAleatorios(numeros);
        
        //Objeto de la clase Comparator, manera creciente
        Comparator comCrece = new ComparadorNumeros();
        
        //Comparar los numeros de manera decreciente
        Comparator comDecre = comCrece.reversed();
        
        Arrays.sort(numeros,comCrece);
        System.out.println("Numeros Aletorios ordenados de manera Creciente: " + Arrays.deepToString(numeros));
        
        Arrays.sort(numeros, comDecre);
        System.out.println("Numeros Aletorios ordenados de manera Decreciente: " + Arrays.deepToString(numeros));
    }
    
}
