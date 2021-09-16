
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre= "Laura Juliana Serrano García";
		
		System.out.println("Mi nombre es "+ nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombres es " + nombre.charAt(0));
		
		System.out.println(nombre.substring(0,5));
		
		int ultima_letra;
		
		ultima_letra = nombre.length();
		
		System.out.println("La última letra de mi nombres es " + nombre.charAt(ultima_letra-1));
		
		
		String alumno1, alumno2;
		
		alumno1= "David";
		alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2)); //Diferencia entre mayúsculas y minúsculas.
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); //No le interesa si es mayúscula o minúscula.
				

	}

}
