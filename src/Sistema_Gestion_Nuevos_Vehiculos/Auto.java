/**/
package Sistema_Gestion_Nuevos_Vehiculos;


public class Auto extends Vehiculo {
    
    //Atributo Adicional
    int numeroPuertas;
    
    public Auto(String marcaUsu, String modeloUsu, int anioUsu, int numPuerta) {
        super(marcaUsu, modeloUsu, anioUsu);
        numeroPuertas = numPuerta;
    }

    @Override
    public double calcularImpuesto() {
        return 0.5 * anio * 100;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + numeroPuertas + ", Impuesto: " + calcularImpuesto() + "\n";
    }
    
}
