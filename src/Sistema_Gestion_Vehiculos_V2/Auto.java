/*Clase Auto: Representa a un coche
-> Hereda atributos y métodos de la clase Vehiculo*/
package Sistema_Gestion_Vehiculos_V2;


public class Auto extends Vehiculo {
    
    //Atributo adicional
    int numeroPuertas;
    double impuesto;

    /*Constructor de la clase (llama al constructor de la superClase)*/
    public Auto(String mar, String mod, int anioVeh, Propietario propietario, int numP) {
        super(mar, mod, anioVeh, propietario);
        numeroPuertas = numP;
    }
    
    /*Implementación del método abstracto calcularImpuesto*/
    @Override
    public void calcularImpuesto () {
        impuesto = 0.5 * anio * 100;
    }
    
    /*Implementacion del método toString*/
    @Override
    public String toString () {
        return super.toString() + " numero de Puertas: " + numeroPuertas + " Impuesto: " + impuesto + "]";
    }
}
