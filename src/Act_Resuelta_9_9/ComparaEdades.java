/*Clase Comparadora -> Implementa la clase Comparator*/
package Act_Resuelta_9_9;

import java.util.Comparator;


public class ComparaEdades implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((SocioV3)o1).edad() - ((SocioV3)o2).edad();
    }    
    
    
}
