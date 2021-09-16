import java.util.Scanner;

public class EntradaEjemploUno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introducir el nombre: ");
		
		String nombreUsuario= entrada.nextLine();
		
		
		System.out.println("Introducir la edad: ");
		
		int edadUsuario= entrada.nextInt();
		
		System.out.println("Paz y bien "+ nombreUsuario + " El año que viene tendrás "+ (edadUsuario+1)+ " años");
		
	}

}
