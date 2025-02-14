/**/
package Pilas_y_Colas;

import java.util.Arrays;

public class Lista {

    //Datos de la clase
    Integer numLista[];
    int contadornumLista;

    /*Constructor de la clase*/
    public Lista() {
        numLista = new Integer[0];
        contadornumLista = 0;
    }

    /*Método que devuelve al usuario el numero de elementos que hay insertados en el Array*/
    public int getnumElementos() {
        return contadornumLista;
    }

    /*Método que inserta un número al final de la lista*/
    public void insertaNumFinal(Integer num) {
        numLista = Arrays.copyOf(numLista, numLista.length + 1);
        numLista[contadornumLista] = num;
        contadornumLista++;
    }

    /*Insertar un número al principio de la lista*/
    public void insertaNumInicio(Integer num) {
        Integer otroArray[] = new Integer[contadornumLista + 1];

        /*Copiamos la tabla original en una nueva desde el indice 1 todos 
       los elementos que tengamos en la tabla (contadornumLista) en la tabla de repuesto
       comenzando desde el indice 1, dejando el hueco del principio vacio.*/
        System.arraycopy(numLista, 0, otroArray, 1, contadornumLista + 1);
        otroArray[0] = num;
        contadornumLista++;
        numLista = Arrays.copyOf(otroArray, otroArray.length);
    }

    /*Insertar un número en un lugar de la lista especificado de la tabla.*/
    public void insertanumIndice(int indiceUsuario, Integer num) {

        //Verificamos si el indice dado esta en el Array
        if (indiceUsuario > contadornumLista || indiceUsuario < 0) {
            System.out.println("El índice especificado no existe en la tabla");
        } else {
            /*Si esta, primero verificamos si esta vacio, de ser asi, insertamos el numero dado.*/
            for (int i = 0; i < indiceUsuario; i++) {
                if (numLista[indiceUsuario] == null) {
                    numLista[indiceUsuario] = num;
                    contadornumLista++;
                } else {
                    /*Si no esta, hacemos un array de repuesto*/
                    Integer listaCopia[] = new Integer[contadornumLista + 1];

                    /*Copiamos los elementos desde el indice 0, a la copiaArray en el indice 0,
                    se copian solo los elementos justo antes del indice dado por el Usuario.*/
                    System.arraycopy(numLista, 0, listaCopia, 0, indiceUsuario);

                    /*Ahora, hacemos la copia desde ese indice a la otra tabla, desde ese indice + 1, asi dejamos el hueco
                    disponible para poder introducir el elemento nuevo.*/
                    System.arraycopy(numLista, indiceUsuario, listaCopia, indiceUsuario + 1, contadornumLista - indiceUsuario);

                    listaCopia[indiceUsuario] = num;
                    contadornumLista++;
                    numLista = Arrays.copyOf(listaCopia, listaCopia.length);

                }
            }
        }
    }

    /*Añadir al final de la lista, los elementos de otra lista que se pasa como parámetro*/
    public void insertarElementosLista(Integer[] otraLista) {
        
        
        

    }

}
