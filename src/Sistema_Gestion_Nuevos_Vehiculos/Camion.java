/**/
package Sistema_Gestion_Nuevos_Vehiculos;


public class Camion extends Vehiculo {
    
    //Atributo Adicional
    int capacidadCarga; /*en toneladas*/

    /*Constructor de la clase*/
    public Camion(String marcaUsu, String modeloUsu, int anioUsu, int capacidad) {
        super(marcaUsu, modeloUsu, anioUsu);
        capacidadCarga = capacidad;
    }

    @Override
    public double calcularImpuesto() {
        return 0.10 * anio * 200;
    }
    
    @Override
    public String toString () {
        return super.toString() + ", Capacidad de carga: " + capacidadCarga + ", Impuesto: " + calcularImpuesto() + "\n";
    }
    
}
