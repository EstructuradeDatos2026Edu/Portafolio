package datos.unidad1.genericos;

public class MainGenericos {
    public static void main(String[] args) {
        // Creamos el arreglo para almacenar objetos de la clase base Producto
        Producto<?>[] inventario = new Producto[4];

        inventario[0] = new Libro("Mickey mouse", 599.99, 350);
        inventario[1] = new Electronico("Laptop HP", 15999.99, "2 años");
        inventario[2] = new Libro("El libro de la selva", 499.50, 420);
        inventario[3] = new Electronico("licuadora", 8900.00, "3 años");

        // Recorremos el arreglo e imprimimos los detalles
        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
            System.out.println("----------------------------------------");
        }
    }
}