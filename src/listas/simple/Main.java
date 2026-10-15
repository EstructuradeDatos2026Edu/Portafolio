package listas.simple;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto de nuestra lista simple
        ListaSimple lista = new ListaSimple();

        // Probamos el método para insertar los valores
        System.out.println("Insertando los elementos...");
        /*lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);*/

        // Recorremos e imprimimos la lista
        lista.recorrer();
    }
}