
public class Calculos_conMath {

	public static void main(String[] args) {
		
		//Ra�z Cuadrada
		double raiz = Math.sqrt(144);		
		System.out.println(raiz);
		
		//Potencia
		double potencia = Math.pow(2, 5);
		System.out.println(potencia);
		
		//Redondear
		
		float num1= 5.85F;
		int redondear = Math.round(num1);
		System.out.println(redondear);
		
		double num2= 6.85;
		int redondear1 = (int)Math.round(num2); //Refundici�n.
		System.out.println(redondear1);

	}

}
