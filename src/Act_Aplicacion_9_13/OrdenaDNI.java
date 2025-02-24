/**/
package Act_Aplicacion_9_13;

import java.util.Comparator;


public class OrdenaDNI implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Futbolista otro = (Futbolista) o2;
        return ((Futbolista)o1).dni.compareToIgnoreCase(otro.dni);
    }
    
}
