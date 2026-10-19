package estructuras;

/**
 * Cola dinámica (FIFO: el primero en entrar es el primero en salir).
 * Implementada con nodos enlazados; se guardan referencias al frente y al final.
 *
 * @param <T> tipo de dato almacenado
 */
public class Cola<T> {

    private Nodo<T> frente; // Primer elemento (el próximo en salir)
    private Nodo<T> fin;    // Último elemento (el más reciente)

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    /** ENQUEUE: añade un elemento al final de la cola. */
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            frente = nuevo;           // Cola vacía: frente y fin son el mismo nodo
        } else {
            fin.setSiguiente(nuevo);  // El último actual apunta al nuevo
        }
        fin = nuevo;
    }

    /**
     * DEQUEUE: extrae y devuelve el elemento del frente.
     * @throws IllegalStateException si la cola está vacía
     */
    public T desencolar() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T dato = frente.getDato();
        frente = frente.getSiguiente(); // El frente avanza al siguiente nodo
        if (frente == null) {
            fin = null; // Si queda vacía, también se limpia el final
        }
        return dato;
    }

    /** ISEMPTY: indica si la cola no tiene elementos. */
    public boolean isEmpty() {
        return frente == null;
    }

    /** Muestra el contenido de la cola de frente a final sin modificarla. */
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.println("Clientes en cola (de primero a último):");
        Nodo<T> actual = frente;
        int posicion = 1;
        while (actual != null) {
            System.out.println("  " + posicion + ". " + actual.getDato());
            actual = actual.getSiguiente();
            posicion++;
        }
    }
}