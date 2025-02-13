/*Implemeta las Intefaces ANfibio y Navegable*/
package Herencia_Interfaces;


public class VehiculoAnfibio implements Anfibio {

    private String modoVehiculo = "tierra";

    @Override
    public void flotar() {
        System.out.println("El vehiculo anfibio está flotando...");
    }

    @Override
    public void arrancar() {
        System.out.println("El vehículo anfibio está arrancando en modo " + modoVehiculo + "...");
    }

    @Override
    public void cambiarModo(String modo) {
        String modoMinus = modo.toLowerCase();

        if (modoMinus.equals("tierra") || modoMinus.equals("agua")) {
            if (!modoMinus.equals(modoVehiculo)) {
                modoVehiculo = modoMinus;
                System.out.println("Cambiando a modo " + modoVehiculo);
            } else {
                System.out.println("Ese modo esta activo actualmente...");                  
            }

        } else {
            System.out.println("Modo no disponible");
        }

    }

}
