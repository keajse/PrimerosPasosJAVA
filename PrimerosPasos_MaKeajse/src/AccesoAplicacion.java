import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Bucle WHILE
		String clave= "laura";
		
		String password = "";
		
		while (clave.equals(password)==false) {
			password= JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(password)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
