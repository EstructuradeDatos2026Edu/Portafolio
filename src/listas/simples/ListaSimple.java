package listas.simple;

/*Autor Juan Eduardo González Hernández
15/10
*/
public class ListaSimple {
    private Nodo cabeza;
    
    public ListaSimple() {
        this.cabeza = null;
    }

    // se implementa la funcion de insertar
    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        
        // Se verifica si la lista está vacía
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            // Si ya hay elementos, recorremos hasta el final
            Nodo actual = cabeza;
            while (actual.getSig() != null) {
                actual = actual.getSig(); // Avanzamos al siguiente nodo
            }
            // Al llegar al último, enlazamos el nuevo nodo
            actual.setSig(nuevo);
        }
    }
//se aplica el metodo de recorrer para imprimir todos los elementos
public void recorrer(){
	Nodo actual = cabeza;
}
}