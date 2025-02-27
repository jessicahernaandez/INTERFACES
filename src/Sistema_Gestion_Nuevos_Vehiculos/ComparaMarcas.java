/**/
package Sistema_Gestion_Nuevos_Vehiculos;

import java.util.Comparator;


public class ComparaMarcas implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Vehiculo)o1).marca.compareTo(((Vehiculo)o2).marca);
    }
    
}
