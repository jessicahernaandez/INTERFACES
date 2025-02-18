/*Es la misma version que la clase LISTA2
-> Solo cambiaremos en funcionamiento en el main*/
package Encolar_y_DesencolarV2;

import java.util.Arrays;


public class Lista_V3 implements Cola2 {

    //Datos de la clase
    Integer numLista[];
    int contadornumLista;

    /*Constructor de la clase*/
    public Lista_V3() {
        numLista = new Integer[0];
        contadornumLista = 0;
    }
    
    /******************************* MÉTODOS IMPLEMENTADOS DE LA INTERFAZ COLA ****************************************/
    @Override
    /*Inserta los elementos al final de la cola*/
    public void encolar(Integer o) {
       insertaNumFinal(o);
    }

    @Override
    /*Elimina los elementos del principio (Primero que entra, primero que sale)*/
    public Integer desencolar() {
        
        /*Obtenemos el valor del indice 0 (el primero) para poder devolverlo*/
        Integer nuevoElemento = devolverElemento(0);
        
        eliminaElemento(0);
        
        return nuevoElemento;
    }
    
    /*******************************************************************************************************************/
    
    
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
        Integer otroArray[] = new Integer[numLista.length + 1];

        /*Copiamos la tabla original en una nueva desde el indice 1 todos 
       los elementos que tengamos en la tabla (contadornumLista) en la tabla de repuesto
       comenzando desde el indice 1, dejando el hueco del principio vacio.*/
        System.arraycopy(numLista, 0, otroArray, 1, numLista.length);
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

            /*Si no esta, hacemos un array de repuesto*/
            Integer listaCopia[] = new Integer[numLista.length + 1];

            /*Copiamos los elementos desde el indice 0, a la copiaArray en el indice 0,
                    se copian solo los elementos justo antes del indice dado por el Usuario.*/
            System.arraycopy(numLista, 0, listaCopia, 0, indiceUsuario);

            /*Ahora, hacemos la copia desde ese indice a la otra tabla, desde ese indice + 1, asi dejamos el hueco
                    disponible para poder introducir el elemento nuevo.*/
            System.arraycopy(numLista, indiceUsuario, listaCopia, indiceUsuario + 1, numLista.length - indiceUsuario);

            listaCopia[indiceUsuario] = num;
            contadornumLista++;
            numLista = Arrays.copyOf(listaCopia, listaCopia.length);

        }
    }

    /*Añadir al final de la lista, los elementos de otra lista que se pasa como parámetro*/
    public void insertarElementosLista(Lista_V3 otraLista) {

        //Obtenemos el número de elementos de la otra lista
        int numElementosOtraLista = otraLista.getnumElementos();

        //Aumentamos el tamaño de numLista para poder introducir los elementos de la otra lista
        numLista = Arrays.copyOf(numLista, numLista.length + numElementosOtraLista);

        //Copiamos los elementos de la otraLista desde el indice de destino -> contadornumLista
        //Accedemos a el array de la lista pasada como parámero.
        System.arraycopy(otraLista.numLista, 0, numLista, contadornumLista, numElementosOtraLista);

        contadornumLista = numLista.length;
    }

    //Eliminar un elemento con el índice que se pasa como parámetro
    public void eliminaElemento(int IndiceEliminacion) {

        if (IndiceEliminacion < 0 && IndiceEliminacion > numLista.length) {
            System.out.println("El Indice especificado no es válido");
        } else {
            for (int i = IndiceEliminacion + 1; i < numLista.length; i++) {
                //Movemos los elementos en cada iteracion
                numLista[i - 1] = numLista[i];
            }

            numLista = Arrays.copyOf(numLista, numLista.length - 1);
            contadornumLista--;
        }
    }

    //Obtener el elemento cuyo indice se pasa como parámetro.
    Integer devolverElemento(int indiceElemento) {
        Integer devolver = null;

        if (indiceElemento >= 0 && indiceElemento < contadornumLista) {
            devolver = numLista[indiceElemento];
        }

        return devolver;
    }

    //Devolver el indice del elemento que se desea encontrar.
    public int devolverIndice(Integer elementoBuscar) {
        int indiceBusqueda = -1;

        for (int i = 0; i < contadornumLista; i++) {
            if (numLista[i].equals(elementoBuscar)) {
                indiceBusqueda = i;
            }
        }

        return indiceBusqueda;
    }

    //Mostrar los elementos de la lista por consola
    @Override
    public String toString() {
        return "Lista: " + Arrays.toString(numLista);
    }


}


