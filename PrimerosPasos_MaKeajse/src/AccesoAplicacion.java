import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Bucle WHILE
		String clave= "laura";
		
		String password = "";
		
		while (clave.equals(password)==false) {
			password= JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(password)==false) {
				System.out.println("Contrase�a incorrecta");
			}
		}
		
		System.out.println("Contrase�a correcta. Acceso permitido");

	}

}
