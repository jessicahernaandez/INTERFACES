/*Haremos pruebas de los métodos implmentados de la Interfaz Cola, pero por medio de números introducidos por el usuario*/
package Encolar_y_DesencolarV2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lista_V3 lista1 = new Lista_V3();

        Scanner sc = new Scanner(System.in);

        int nuevoElemento = 1;

        while (nuevoElemento != -1) {
            System.out.println("Introduce un número (-1 para terminar): ");
            nuevoElemento = sc.nextInt();

            if (nuevoElemento >= 0) {
                lista1.encolar(nuevoElemento);
            } else {
                System.out.println("Solo puedes introducir numeros enteros");
            }
        }

        System.out.println("Haz introducido el \'-1\'");
        System.out.println("Desencolando la lista...");
        int longitud = lista1.getnumElementos();
        for (int i = 0; i <= longitud; i++) {
            lista1.desencolar();
        }

    }

}
