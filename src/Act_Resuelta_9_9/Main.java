package Act_Resuelta_9_9;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        SocioV3[] socios = new SocioV3[]{
            new SocioV3(54, "Jessica", "23-09-2004"),
            new SocioV3(35, "Andrea", "17-01-2011"),
            new SocioV3(12, "Luna", "12-12-2023"),
            new SocioV3(34, "Liza", "20-09-2002"),
            new SocioV3(23, "Tatiana", "07-02-1994"),
            new SocioV3(23, "Alejandra", "11-05-2003")
        };

        //Objeto de Comparator, para edades crecientes
        Comparator c1 = new ComparaEdades();

        //Para obtener el sentido decreciente, obtenemos c2
        Comparator c2 = c1.reversed();

        //Orden natural
        Arrays.sort(socios);
        System.out.println("Orden natural utilizando Comparable: \n" + Arrays.deepToString(socios));

        //Orden creciente de edad
        Arrays.sort(socios, c1);
        System.out.println("Orden creciente por edades, utilizando Comparator: \n" + Arrays.deepToString(socios));

        //Orden decreciente de edad
        Arrays.sort(socios, c2);
        System.out.println("Orden decreciente por edades, utilizando Comparator.reversed: \n" + Arrays.deepToString(socios));
    }

}
