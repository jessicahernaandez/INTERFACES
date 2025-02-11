/*CalAvanzadaInter: Utiliza la Interfaz Operaciones y define todos sus métodos
Ademas, contiene tambien sus propios métodos*/
package EjercicioCalculadora;


public class CalAvanzadaInter implements Operaciones {

    //Métodos implementados de Interfaz Operaciones
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) {
       return a / b;
    }
    
    /*Métodos Adicionales*/
    /*Calcula el modulo de una operación*/
    int modulo (int a, int b) {
        return a % b;
    }
    
    /*Calcula la potencia de un número*/
    double potencia (int base, int exponente) {
        double result = 0;
        for (int i = 0; i <= exponente; i++) {
            result = base * base;
        }
        
        return (double) result;
    }
       
}
