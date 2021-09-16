package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmplado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1 = new Empleado("Adriana López", 1200000,2018,02,15);
		
		Empleado empleado2 = new Empleado("Omar Ardila", 1000000,2019,01,30);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		
		System.out.println("Nombre: "+ empleado1.dameNombre()+ " Sueldo: "+ empleado1.dameSueldo()
			+ " Fecha de alta: "+ empleado1.dameFechaContrato()
				);
		
		System.out.println();
		
		System.out.println("Nombre: "+ empleado2.dameNombre()+ " Sueldo: "+ empleado2.dameSueldo()
		+ " Fecha de alta: "+ empleado2.dameFechaContrato()
			);*/
		
		
		//Array combinado con ciclo For each
		
		Empleado[] misEmpleados = new Empleado[3];
		
		String[] miArray = new String[3];
		
		misEmpleados[0]= new Empleado("Adriana López", 1200000,2018,2,15);
		misEmpleados[1]= new Empleado("Omar Ardila", 1000000,2019,1,30);
		misEmpleados[2]= new Empleado("Laura Serrano", 5000000,2021,12,30);
		
		for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
			
			System.out.println("Nombre: "+ misEmpleados[i].dameNombre()+ " Sueldo: "+ misEmpleados[i].dameSueldo()
			+ " Fecha de alta: "+ misEmpleados[i].dameFechaContrato()
				);			
			
		}
		
		//Opción dos
		
		System.out.println();
		
		System.out.println("Opción Dos, ciclo For Each");
		
		System.out.println();
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(10);
			
			System.out.println("Nombre: "+ e.dameNombre()+ " Sueldo: "+ e.dameSueldo()
					+ " Fecha de alta: "+ e.dameFechaContrato()
						);	
			
		}
		

	}

}

class Empleado{
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre = nom;
		sueldo= sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1,dia);
		
		altaContrato= calendario.getTime();
		
	}
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public double dameSueldo() { //getter
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}