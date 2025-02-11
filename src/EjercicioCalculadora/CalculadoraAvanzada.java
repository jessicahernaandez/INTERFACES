/*CalculadoraAvanzada: Hereda de la clase CalculadoraSimple sus métodos
-> Implementa métodos propios*/
package EjercicioCalculadora;


public class CalculadoraAvanzada extends CalculadoraSimple {
    
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
