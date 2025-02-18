/*Clase Morocicleta: Heredada de la clase abstracta Vehiculo*/
package Sistema_Gestion_Vehiculos_V2;


public class Motocicleta extends Vehiculo {
    
    //Atributo adicional
    int cilindrada; //en centímetros.
    double impuesto;
    
    /*Constructor de la clase*/
    public Motocicleta(String mar, String mod, int anioVeh, Propietario propietario, int cilin) {
        super(mar, mod, anioVeh, propietario);
        cilindrada = cilin;
    }
    
    /*Definición del método CalcularImpuesto*/
    @Override
    void calcularImpuesto() {
        impuesto = 0.3 * anio * 50;
    }
    
    /*Sobreescritura del método toString*/
    @Override
    public String toString () {
        return super.toString() + " cilindrada (en centimetros): " + cilindrada + " impuesto: " + impuesto + "]";
    }
    
    
}
