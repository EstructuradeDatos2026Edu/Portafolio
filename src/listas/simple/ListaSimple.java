package listas.simple;

/*Autor Juan Eduardo González Hernández
15/10/26
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
    
    // se aplica el metodo de recorrer para imprimir todos los elementos
    public void recorrer(){
        Nodo itera = cabeza;
        if (cabeza == null){
            System.out.println("lista Vacia");
            return;
        }
        
        System.out.print("Su lista es: ");
        while (itera != null){
            System.out.print(itera.getValor() + " "); // Imprime el valor del nodo actual
            itera = itera.getSig(); // Avanza al siguiente nodo correctamente
        }
        System.out.println();
    }
}