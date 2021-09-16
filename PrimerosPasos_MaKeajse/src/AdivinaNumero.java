import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//N�mero aleatorio
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		while (numero != aleatorio) {
			System.out.println("Introduce un n�mero, por favor");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("M�s bajo");
			}
			else if (aleatorio > numero) {
				System.out.println("M�s alto");
			}
			intentos++;
		}
		
		System.out.println("Correcto lo ha logrado en " + intentos + " intentos");
		

	}

}
