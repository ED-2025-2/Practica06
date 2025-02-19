import java.util.Iterator;

/**
 * @autor Kevin Jair Torres Valencia.
 */

/**
 * Implementación de una lista ligada simple genérica.
 *
 * @param <T> El tipo de elementos almacenados en la lista.
 */
public class ListaLigada<T> implements Coleccion<T> {

    private class Nodo {
        /**
         * Elemento almacenado en el nodo.
         */
        public T elemento;

        /**
         * Apuntador al siguiente nodo en la lista.
         */
        public Nodo siguiente;

        /**
         * Crea un nuevo nodo con el elemento proporcionado.
         *
         * @param elemento El elemento a almacenar en el nodo.
         */
        public Nodo(T elemento) {
            this.elemento = elemento;
            this.siguiente = null;
        }

        /**
         * Devuelve el elemento del nodo.
         *
         */
        public T darElemento(){
          return this.elemento;
        }

        /**
         * Devuelve el siguiente del nodo.
         *
         */
        public Nodo darSiguiente(){
          return this.siguiente;
        }

        /**
         * Modifica el elemento del nodo.
         *
         * @param sig nodo a cambiar.
         */
        public void modificaSiguiente(Nodo sig){
          this.siguiente = sig;
        }
    }

    /**
    * Un iterador para recorrer la lista simple.
    */
    private class IteradorListaSimple implements Iterator<T> {

        /**
         * El nodo siguiente al que se moverá el iterador.
         */
        private Nodo iteradorLista;

        /**
         * Crea un nuevo iterador y lo inicializa en el primer nodo de la lista.
         */
        public IteradorListaSimple() {
            iteradorLista = new Nodo(null);
            iteradorLista.siguiente = cabeza;
        }

        /**
         * Verifica si hay un siguiente elemento en la lista.
         *
         * @return true si hay un siguiente elemento, false de lo contrario.
         */
        public boolean hasNext() {
          // Aqui va su codigo
        }

        /**
         * Obtiene el siguiente elemento en la lista y mueve el iterador al siguiente nodo.
         *
         * @return El siguiente elemento en la lista.
         */
        public T next() {
          // Aqui va su codigo
        }
    }


    private Nodo cabeza;

    private Nodo rabo;

    private int longitud;


    /*------------------  AQUI VA LO QUE SE VA A IMPLEMENTAR EN LA SIGUIENTE CLASE ------------------------------- */


    /**
      * Crea una nueva instancia de la clase ListaLigadaSimple.
      * Esta clase representa una lista simple genérica. 
      * @param <T> El tipo de elementos almacenados en la lista.
    */
    public ListaLigada(){
      //Aquí va tu código
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterator<T> iterator() {
        return new IteradorListaSimple();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void insertar(T elemento) throws IllegalArgumentException {
      //Aquí va tu código
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T acceder(int i) throws IllegalArgumentException {
      //Aquí va tu código
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean buscar(T elemento) {
      //Aquí va tu código
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminar(int i) {
      //Aquí va tu código
    }

    /**
    * Devuelve la longitud actual de la lista.
    * @return La longitud actual de la lista.
    */
    public int darLongitud() {
      // Aqui va su codigo
    }

    /**
     * Obtiene el primer nodo de la lista.
     *
     * @return El primer nodo de la lista.
     */
    public Nodo darCabeza() {
      // Aqui va su codigo
    }

    /**
     * Obtiene el elemento almacenado en el primer nodo de la lista.
     *
     * @return El elemento almacenado en el primer nodo de la lista.
     */
    public T darCabezaElemento() {
      // Aqui va su codigo
    }

    /**
     * Obtiene el último nodo de la lista.
     *
     * @return El último nodo de la lista.
     */
    public Nodo getRabo() {
      // Aqui va su codigo
    }

    /**
     * Obtiene el elemento almacenado en el último nodo de la lista.
     *
     * @return El elemento almacenado en el último nodo de la lista.
     */
    public T getRaboElemento() {
      // Aqui va su codigo
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void vaciar() {
      // Aqui va su codigo
    }

}