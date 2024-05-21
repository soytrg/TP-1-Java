
public class Ejercicio4 {

	public static void main(String[] args) 
	{	
		 String[] nombres = {"tizi","carlos","manuel"}; 
		 //Supongamos que tenemos un array con los nombres ingresados por el usuario
		 //Si solo queremos saber cuales son los nombres adentro del array sin que nos importe
		 //la posicion, podriamos utilizar un for-each 
		 
		 
		// Guardamos el primer valor String del array "nombres" en la variable "nombre"
		 for(String nombre  : nombres)
		 {
			 // Luego mostramos la variable por consola
			 System.out.println(nombre); 
		 }
		 
		 // Una ventaja de hacer esto, es por si queremos verificar si el array esta vacio o no 
		 // de manera rapida.
	}

}
