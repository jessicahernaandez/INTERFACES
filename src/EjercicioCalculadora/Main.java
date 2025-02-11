/*Clase Main: 
-> Comprobamos el funcionamiento de la Interfaz Operaciones y las clases Calculadora Simple, CalculadoraAvanzada
y CalAvanzadaInter
-> Implementamos una clase como subclase de Calculadora Simple y tambien implementamos otra utilizando la Interfaz*/
package EjercicioCalculadora;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Objeto de CalculadoraSimple
        CalculadoraSimple calcu1 = new CalculadoraSimple ();
        //Objeo de CalculadoraAvanzada V1
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        //Objeto de CalculadoraAvanzanzada V2
        CalAvanzadaInter calcu2 = new CalAvanzadaInter ();

        System.out.println("Ingresa un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro número: ");
        int num2 = sc.nextInt();
        
        /*En este caso los métodos potencia y modulo no se pueden utilizar, son de la clase CalculadoraAvanzada.*/
        System.out.println("****************************CALCULADORA SIMPLE*************************");
        System.out.println("Suma: " + calcu1.sumar(num1, num2));
        System.out.println("Resta: " + calcu1.restar(num1, num2));
        System.out.println("Multiplicación: " + calcu1.multiplicar(num1, num2));
        System.out.println("División: " + calcu1.dividir(num1, num2));
        System.out.println("***********************************************************************");

        System.out.println("**************CALCULADORA AVANZADA COMO SUBCLASE**********************");
        System.out.println("Suma: " + calculadora.sumar(num1, num2));
        System.out.println("Resta: " + calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + calculadora.multiplicar(num1, num2));
        System.out.println("División: " + calculadora.dividir(num1, num2));
        System.out.println("Modulo de la división: " + calculadora.modulo(num1, num2));
        System.out.println("Potencia: " + calculadora.potencia(num1, num2));
        System.out.println("***********************************************************************");
        
        System.out.println("**************CALCULADORA AVANZADA IMPLEMENTANDO INTERFAZ***************");
        System.out.println("Suma: " + calcu2.sumar(num1, num2));
        System.out.println("Resta: " + calcu2.restar(num1, num2));
        System.out.println("Multiplicación: " + calcu2.multiplicar(num1, num2));
        System.out.println("División: " + calcu2.dividir(num1, num2));
        System.out.println("Modulo de la división: " + calcu2.modulo(num1, num2));
        System.out.println("Potencia: " + calcu2.potencia(num1, num2));
        System.out.println("***********************************************************************");
        
        
    }
}
