/*Clase Consecionario*/
package Sistema_Gestion_Vehiculos_V2;


public class Concesionario {
    
    //Datos de la clase
    String nombre;
    String direccion;
    Vehiculo [] vehiculos = new Vehiculo[10];
    int contadorVehiculos = 0;
    
    /*Constructor de la clase*/
    public Concesionario (String nomCon, String direCon) {
        nombre = nomCon;
        direccion = direCon;
    }
    
    /*Método que permite poder agregar un vehiculo a la lista*/
    public void agregarVehiculo (Vehiculo v) {
        if (contadorVehiculos < vehiculos.length) {
            vehiculos [contadorVehiculos] = v;
            contadorVehiculos++;
            System.out.println("Vehiculo Agregado correctamente");
        } else {
            System.out.println("El vehiculo no se pudo agregar. Almacenamiento Ocupado");
        }
    }
    
    /*Método que muestra los vehiculos disponibles en el concesionario*/
    public void listarVehculos () {
        System.out.println("Vehiculos disponibles en " + nombre);
        for (int i = 0; i < contadorVehiculos; i++) {
            System.out.println(vehiculos[i]);
        }
    }
    
    @Override
    public String toString () {
        return "Concesionario [nombre: " + nombre + " dirección: " + direccion + "]";
    }
}
