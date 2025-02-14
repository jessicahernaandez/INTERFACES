/**/
package Pilas_y_Colas;


public class Principal {

    
    public static void main(String[] args) {
        
        //Primer Objeto
        Lista lista = new Lista();
        lista.insertaNumFinal(25);
        lista.insertaNumFinal(45);
        System.out.println("Dos elementos insertados al final: ");
        lista.mostrarElementos();
        lista.insertaNumInicio(78);
        System.out.println("Número insertado al Inicio: ");
        lista.mostrarElementos();
        lista.insertaNumInicio(12);
        System.out.println("Otro número al inicio: ");
        lista.mostrarElementos();
        
        //Insertar en el indice 3
        lista.insertanumIndice(3, 44);
        lista.mostrarElementos();
        
        //Otra Lista
        Lista otraLista = new Lista();
        otraLista.insertaNumFinal(40);
        otraLista.insertaNumFinal(50);
        otraLista.insertaNumFinal(60);
        otraLista.insertaNumInicio(12);
        System.out.println("Contenido de otraLista:");
        otraLista.mostrarElementos();
        
        //Insertar elementos de otra lista al final de la lista
        lista.insertarElementosLista(otraLista);
        System.out.println("Despues de Insertar los otros elementos: ");
        lista.mostrarElementos();
        
        
        //Eliminar un elemento con un índice específico
        lista.eliminaElemento(3);
        System.out.println("Después de eliminar el elemento en el índice 3:");
        lista.mostrarElementos();
        
        //Obtener el elemento en un índice específico
        Integer elemento = lista.devolverElemento(2);
        System.out.println("Elemento en el índice 2: " + elemento);
        
        int indice = lista.devolverIndice(50);
        System.out.println("Índice del elemento 50: " + indice);
    }
    
}
