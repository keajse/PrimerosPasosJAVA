import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese su edad por favor: ");
		int edad = entrada.nextInt();
		
		if (edad < 18) {
			System.out.println("Usted es menor de edad");
		}
		else
		{
			System.out.println("Usted es mayor de edad");
		}		
		System.out.println();
		
		System.out.println("Ingrese un número de 1 a 3: ");
		int num = entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Usted ha ingreso el número 1");
			break;
		case 2:
			System.out.println("Usted ha ingreso el número 2");
			break;
		case 3:
			System.out.println("Usted ha ingreso el número 3");
			break;
		default:
			System.out.println("Opción no válida");
			break;
		
		}
	}

}
