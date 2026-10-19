package estructuras;

/**
 * Pila dinámica (LIFO: el último en entrar es el primero en salir).
 * Implementada con nodos enlazados; solo se guarda la referencia a la cima.
 *
 * @param <T> tipo de dato almacenado
 */
public class Pila<T> {

    private Nodo<T> cima; // Último elemento apilado (null si la pila está vacía)

    public Pila() {
        this.cima = null;
    }

    /** PUSH: apila un elemento. El nuevo nodo pasa a ser la cima. */
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(cima); // El nuevo apunta a la antigua cima
        cima = nuevo;             // La cima ahora es el nuevo nodo
    }

    /**
     * POP: desapila y devuelve el elemento de la cima.
     * @throws IllegalStateException si la pila está vacía
     */
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T dato = cima.getDato();
        cima = cima.getSiguiente(); // La cima baja al siguiente nodo
        return dato;
    }

    /** ISEMPTY: indica si la pila no tiene elementos. */
    public boolean isEmpty() {
        return cima == null;
    }
}