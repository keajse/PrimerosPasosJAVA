import javax.swing.JOptionPane;

public class EntradaEjemploDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String nombreUsuario= JOptionPane.showInputDialog("Ingresar el nombre: ");
		
		String edadUsuario = JOptionPane.showInputDialog("Ingrese la edad: ");
		
		int edadConvertida = Integer.parseInt(edadUsuario);
		
		edadConvertida++;
		
		System.out.println("Paz y bien "+ nombreUsuario + " su edad es "+ edadUsuario+ " a�os" + " el pr�ximo a�o tendr� "+ edadConvertida);*/
		
		
		
		String raiz = JOptionPane.showInputDialog("Ingrese un n�mero: ");
		
		double raizc = Double.parseDouble(raiz);
		
		System.out.print("La Ra�z cuadrada de "+ raizc + " es ");
		System.out.printf("%1.2f", Math.sqrt(raizc));
	}

}
