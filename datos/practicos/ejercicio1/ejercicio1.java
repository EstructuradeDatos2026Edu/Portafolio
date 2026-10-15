package datos.practicos.ejercicio1;

public class ejercicio1 {

    public static void main(String[] args) {
        // CÓDIGO A CORREGIR - FASE 1
        int K = 4; // <-- INSERTA AQUÍ (Último dígito de tu matrícula + 1)
        int[] lecturas = {10, -5, 20, K * 2, -1, 30, 0, 15};

        // El bucle procesa el arreglo de atrás hacia adelante de forma segura
        for (int i = lecturas.length - 1; i >= 0; i--) {
            if (lecturas[i] > 0) {
                System.out.println("Lectura positiva: " + lecturas[i]);
            }
        }
/*El error era simple, sencillamente a la hora de darle el valor a i diciendo que es el valor de la 
longitud de la tabla (que es igual a 8) por todos los elementos que tiene pero a la hora de correr el if no lo
logra traer ya que no hay ningun datos en la posicion 8 ya que esa no existe*/
        int[][] ventas = new int[3][];
        ventas[0] = new int[K]; // Vendedor 1
        ventas[1] = new int[K + 1]; // Vendedor 2
        ventas[2] = new int[2]; // Vendedor 3
        // Error: Intentan llenar la matriz como si fuera rectangular (4x4)
	//realiza la suma de los valores recorriendo cada uno de los espacion dentro del arreglo
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) { 
                ventas[i][j] = (i + 1) * (j + 1);
            }
        }//realiza la suma de cada uno de los valores
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
        }
        System.out.println("La suma total de las ventas son: " + total);
/*¿Cuál es la ventaja de memoria de un Jagged
Array sobre una matriz tradicional de N x M cuando los datos de cada fila no son
homogéneos? Se trata de un ahorro de memoria ya que cada fila construlle los espacios que ella misma necesita y no los
restringe a un espacio limitado o en algunas ocasiones de sobre, es decir si tengo un espacio de 10 y solo ocupo 2 estoy desperdiciando
8 lugares y viceversa si tengo necesito 12 y solo tengo 10 me limitaria demasiado*/

        // CÓDIGO A CORREGIR - FASE 3
        int[][][] cubo = new int[2][K][K];
        // Inicialización rápida
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < K; k++) {
                    cubo[i][j][k] = i + j + k + 1;
                }
            }
        }
        
		// Error de lógica e ineficiencia:
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < K; k++) {
                    if (cubo[i][j][k] % 3 == 0) {
                        System.out.println("Múltiplo encontrado en: " + i + "," + j + "," + k);
                    }
                }
            }
        }
/*El error en la Fase 3 consistía en que el ciclo while no contaba con un incremento ya que siempre se igualaria a 0 lo que nunca encenderia la 
condicion de paro, entonces lo cambie por otro ciclo for para recorrel los valores i esta comparandola con la longitud del arreglo en general*/
    }
}