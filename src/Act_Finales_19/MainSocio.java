/**/
package Act_Finales_19;

import java.util.Arrays;

public class MainSocio {

    public static void main(String[] args) {

        //Objetos
        SocioN[] socios = new SocioN[]{
            new SocioN(4, "Andrea", "17-01-2011"),
            new SocioN(4, "Liza", "15-05-1999"),
            new SocioN(2, "Alejandra", "22-01-2011"),
        
        };

        //Orden natural
        Arrays.sort(socios);
        System.out.println("Ordenacion natural (por edad de manera creciente): \n" + Arrays.deepToString(socios) + "\n");
        
        //Utilizando el metodo de Comparator
        System.out.println("Utilizando método de comparacion con ID, si existen edades iguales: \n");
        Arrays.sort(socios, new ComparaID());
        System.out.println(Arrays.deepToString(socios));
                
    }

}
