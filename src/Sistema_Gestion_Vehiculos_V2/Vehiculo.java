/*Clase Vehiculo: Clase abstracta porque posee un método abstracto.
-> SuperClase.*/
package Sistema_Gestion_Vehiculos_V2;


public abstract class Vehiculo {
    
    //Datos de la clase
    protected String marca;
    protected String modelo;
    protected int anio;
    Propietario propietario;
    
    //Objeto de la clase Propietario
    
    /*Constructor de la clase*/
    public Vehiculo (String mar, String mod, int anioVeh, Propietario propietarioUsu) {
        marca = mar;
        modelo = mod;
        anio = anioVeh;
        propietario = propietarioUsu;
    }
    
    /*Método sustituido de la clase Objecto (toString)*/
    @Override
    public String toString () {
        return "Vehiculo [marca: " + marca + " modelo: " + modelo + " anio: " + anio + " Propietario: " + propietario;
    }
    
    /*Método abstracto*/
    abstract void calcularImpuesto ();
    
}
