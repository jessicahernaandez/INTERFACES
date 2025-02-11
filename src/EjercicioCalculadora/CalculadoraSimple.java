/*Clase CalculadoraSimple: Utiliza la Interfaz Operaciones y hace la implementacion 
de todos sus métodos abstractos*/

package EjercicioCalculadora;

public class CalculadoraSimple implements Operaciones {

    /*Suma 2 números*/
    public int sumar(int a, int b) {
        return a + b;
    }

    /*Resta 2 números*/
    public int restar(int a, int b) {
        return a - b;
    }

    /*Multiplica 2 números*/
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /*Divide 2 números*/
    public double dividir(int a, int b) {

        if (b == 0) {
            System.out.println("No se pude dividir entre 0");
        }

        return (double) a / b;
    }
}
