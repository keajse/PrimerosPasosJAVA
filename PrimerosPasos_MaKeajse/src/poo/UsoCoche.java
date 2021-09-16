package poo;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche = new Coche(); //Instanciar una clase, ejemplar de clase.
		
		System.out.println(miCoche.dimeDatosGenerales());
		
		//System.out.println("Este coche tiene "+ Renault.ruedas + " ruedas");
		
		
		miCoche.estableceColor(JOptionPane.showInputDialog("Introduce Color: "));
		
		System.out.println(miCoche.dimeColor());
		
		miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Lleva asientos de cuero? "));
		
		System.out.println(miCoche.dimeAsientos());
		
		miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Lleva climatizador? "));
		
		System.out.println(miCoche.dimeClimatizador());
		
		System.out.println(miCoche.dimePesoCoche());
		
		System.out.println(miCoche.precioCoche());
		
		

	}

}
