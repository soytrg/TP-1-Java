
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int numero,contador;
		
		do
		{
			System.out.println("Ingrese un numero: ");
			numero = scanner.nextInt();
			
			contador=0;
			for(int i=1; i<=numero; i++)
			{
				if(numero%i==0)
				{
					contador++;
				}
			}
			
		}while(numero <= 100 || contador != 2);
		
			scanner.close();
	}

}
