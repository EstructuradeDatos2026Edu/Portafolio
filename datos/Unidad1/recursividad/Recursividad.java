package datos.Unidad1.recursividad;

public class Recursividad {

    public static void saludo(int total, String nombre) {
        if (total <= 0) { // condición base
            return;
        } else {
            System.out.println("Hola " + nombre);
            saludo(total - 1, nombre); 
        }
    }

    // Función que realiza una cuenta regresiva de acuerdo a un valor entero asignado Fecha:25/09/26 Autor:Juan González 
    public static void cuentaRegresiva(int n) {
        if (n < 0) {
            return;
        } else {
            System.out.println(n);
            cuentaRegresiva(n - 1);
        }
    }
//suma todos los valores dentro del arreglo
    public static int sumaRecursiva(int[] datos, int tam) {
        if (tam <= 0) {
            return 0;
        } 
        // Paso Recursivo: Acumula el elemento actual y llama con la longitud restante
        else {
            return datos[tam - 1] + sumaRecursiva(datos, tam - 1);
        }
    }

    public static void main(String[] args) {
        //saludo(100, "Juan");
        //cuentaRegresiva(100);
        int[] datos = {5, 10, 15, 20}; 

        // Pasamos el arreglo y su tamaño total
        int resultado = sumaRecursiva(datos, datos.length);

        System.out.println("La suma de los valores del arreglo es: " + resultado);
    }
}