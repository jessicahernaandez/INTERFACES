/*Clase Madre*/
package Sistema_Gestion_Nuevos_Vehiculos;


public abstract class Vehiculo extends ComparaMarcas implements Impuestos, Comparable {
    
    //Datos de la clase
    String marca;
    String modelo;
    int anio;
    
    /*Constructor para inicializar la clase*/
    public Vehiculo (String marcaUsu, String modeloUsu, int anioUsu) {
        marca = marcaUsu;
        modelo = modeloUsu;
        anio = anioUsu;
    }
    
    /*Método toString sobreescrito*/
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }
    
    /*Método de ordenacion Natural*/
    public int compareTo(Object o) {
        int comparaNatural = -(anio - ((Vehiculo)o).anio);
        
        if (comparaNatural == 0) {
            System.out.println("Las años son iguales, se comparará por marcas");
             return marca.compareTo(((Vehiculo)o).marca);
        } else {
            return comparaNatural;
        }
    }
    
}
