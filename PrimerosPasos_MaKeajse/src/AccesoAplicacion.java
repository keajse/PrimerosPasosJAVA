import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Bucle WHILE
		String clave= "laura";
		
		String password = "";
		
		while (clave.equals(password)==false) {
			password= JOptionPane.showInputDialog("Introduce la contraseņa, por favor");
			
			if (clave.equals(password)==false) {
				System.out.println("Contraseņa incorrecta");
			}
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
