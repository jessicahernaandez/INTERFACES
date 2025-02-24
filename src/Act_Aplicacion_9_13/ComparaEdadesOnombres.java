
package Act_Aplicacion_9_13;

import java.util.Comparator;


public class ComparaEdadesOnombres implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        
        if(((Futbolista)o1).edad - ((Futbolista)o2).edad == 0) {
            System.out.println("Existen edades iguales, se compararan por nombre");
            Futbolista otro = (Futbolista) o2;
            return (((Futbolista)o1).dni.compareToIgnoreCase(otro.dni));      
        } else {
            return ((Futbolista)o1).edad - ((Futbolista)o2).edad;
        }
    }
    
    
    
}
