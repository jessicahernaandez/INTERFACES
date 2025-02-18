/*Clase Camion: Representa un camión 
-> Hereda los atributos y métodos de la clase Vehiculo.*/
package Sistema_Gestion_Vehiculos_V2;


public class Camion extends Vehiculo {
    
    //Atributo Adicional 
    int cargaCapacidad; //en toneladas
    double impuesto;

    /*Constructor de la clase*/
    public Camion(String mar, String mod, int anioVeh, Propietario propietario, int cargaCap) {
        super(mar, mod, anioVeh,propietario);
        cargaCapacidad = cargaCap;
    }

    /*Método definido*/
    @Override
    void calcularImpuesto() {
        impuesto = 0.10 * anio * 200; 
    }
    
    /*Método toString*/
    public String toString () {
        return super.toString() + " capacidad de carga: " + cargaCapacidad + " Impuestos: " + impuesto + "]";
    }
      
}
