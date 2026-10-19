package estructuras;

/**
 * Nodo genérico reutilizado tanto por la Pila como por la Cola.
 * Guarda un dato y una referencia al siguiente nodo de la estructura.
 *
 * @param <T> tipo de dato almacenado
 */
public class Nodo<T> {

    private T dato;           // Información que guarda el nodo
    private Nodo<T> siguiente; // Referencia al nodo siguiente (null si es el último)

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}