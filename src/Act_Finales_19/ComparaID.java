/**/
package Act_Finales_19;

import java.util.Comparator;


public class ComparaID implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        
        if(((SocioN)o1).edad() - ((SocioN)o2).edad() == 0) {
            System.out.println("Edades Iguales, se ordenara por número de ID");
            return ((SocioN)o1).id - ((SocioN)o2).id;
        } else {
            return ((SocioN)o1).compareTo(o2);
            
        }      
    }
    
}
