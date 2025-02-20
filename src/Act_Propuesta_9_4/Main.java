package Act_Propuesta_9_4;

import java.util.Arrays;
public class Main {

    public static void ordenarNombres(SocioV2[] socios) {
        int longitud = socios.length;

        for (int contExterior = 0; contExterior < longitud - 1; contExterior++) {
            for (int contInterior = 0; contInterior < longitud - contExterior - 1; contInterior++) {
                if (socios[contInterior].compareTo(socios[contInterior + 1]) > 0) {
                    SocioV2 temporal = socios[contInterior];
                    socios[contInterior] = socios[contInterior + 1];
                    socios[contInterior + 1] = temporal;

                }

            }
        }
    }

    public static void main(String[] args) {

        //Creamos un array de socios e introducimos objetos de tipo Socio
        SocioV2[] socios = new SocioV2[]{
            new SocioV2(54, "Jessica", "23-09-2004"),
            new SocioV2(35, "Andrea", "17-01-2011"),
            new SocioV2(12, "Luna", "12-12-2023"),
            new SocioV2(34, "Liza", "20-09-2002"),
            new SocioV2(23, "Tatiana", "07-02-1994"),
            new SocioV2(23, "Alejandra", "11-05-2003")
        };

        System.out.println("Tabla Ordenada Alfabeticamente: ");
        ordenarNombres(socios);
        
        System.out.println(Arrays.deepToString(socios));
    }

}
