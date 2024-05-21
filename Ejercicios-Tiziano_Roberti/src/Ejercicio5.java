
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float numero1,numero2,resultado;
		int salida=0,opcion;
		
		do 
		{
			do
			{
				System.out.println("Elija una opcion:");
				System.out.println("1.Suma");
				System.out.println("2.Resta");
				System.out.println("3.Multiplicacion");
				System.out.println("4.Division");
				System.out.println("5.Salir");
				opcion = scanner.nextInt();
			}while(opcion > 5 || opcion < 1);
			
			switch(opcion)
			{
				case 1:
					System.out.println("Ingrese el primer numero: ");
					numero1 = scanner.nextFloat();
					System.out.println("Ingrese el segundo numero: ");
					numero2 = scanner.nextFloat();
					
					resultado = numero1 + numero2;
					
					System.out.println("El resultado de la suma es: " + resultado);
					System.out.print("\n");
					break;
					
				case 2:
					System.out.println("Ingrese el primer numero: ");
					numero1 = scanner.nextFloat();
					System.out.println("Ingrese el segundo numero: ");
					numero2 = scanner.nextFloat();

					resultado = numero1-numero2;
					
					System.out.println("El resultado de la resta es: " + resultado);
					System.out.print("\n");
					break;
					
				case 3:
					System.out.println("Ingrese el primer numero: ");
					numero1 = scanner.nextFloat();
					System.out.println("Ingrese el segundo numero: ");
					numero2 = scanner.nextFloat();

					resultado = numero1*numero2;
					
					System.out.println("El resultado de la multiplicacion es: " + resultado);
					System.out.print("\n");
					break;
					
				case 4:	
					System.out.println("Ingrese el primer numero: ");
					numero1 = scanner.nextFloat();
					System.out.println("Ingrese el segundo numero: ");
					numero2 = scanner.nextFloat();

					resultado = numero1/numero2;
					
					System.out.println("El resultado de la division es: " + resultado);
					System.out.print("\n");
					break;
			
				case 5:
					salida = 1;
					break;
			}		
		}while(salida == 0);
		
		scanner.close();
	}

}
