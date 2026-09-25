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
	//Funcion que realiza una cuenta regresiva de acuerdo a un valor entero asignado Fecha:25/09/26 Autor:Juan González 
    public static void cuentaRegresiva(int n){
	if(n < 0) {
		return;
	}else{
		System.out.println(n);
		cuentaRegresiva(n-1);
	}
}

    public static void main(String[] args) {
        //saludo(100, "Juan");
	cuentaRegresiva(100); 
    }
}