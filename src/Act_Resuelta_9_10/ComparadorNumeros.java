
package Act_Resuelta_9_10;

import java.util.Comparator;


public class ComparadorNumeros implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Integer)o1) - ((Integer)o2);
    }
    
}
