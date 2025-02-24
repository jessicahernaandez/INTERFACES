/**/
package Act_Aplicacion_9_13;

import java.util.Comparator;


public class OrdenarEdades implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
       return ((Futbolista)o1).edad - ((Futbolista)o2).edad;
    }
    
    
}
