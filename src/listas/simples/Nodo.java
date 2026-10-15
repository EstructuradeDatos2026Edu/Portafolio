package listas.simple;

/* Autor: Juan Eduardo Gonzalez Hernández
 * Elemento nodo de la lista
 * 15/10/26
 */
public class Nodo {
    private int valor;
    private Nodo sig;

    // Método constructor
    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    // Métodos Set
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    // Métodos Get
    public int getValor() {
        return valor;
    }

    public Nodo getSig() {
        return sig;
    }
}