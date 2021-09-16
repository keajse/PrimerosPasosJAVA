import javax.swing.JOptionPane;

public class Arrays_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[8];
		
		for (int i=0; i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("País N° "+ (i+1)+" : ");
		}
		
		/*paises[0]="Colombia";
		paises[1]="Japón";
		paises[2]="Australia";
		paises[3]="Estados Unidos";
		paises[4]="Italia";
		paises[5]="Suiza";
		paises[6]="Canada";
		paises[7]="Inglaterra";*/
		
		/*for (int i=0; i<paises.length; i++) {
			System.out.println("País "+ (i+1)+ " "+ paises[i]);
		}*/
		
		for(String elemento:paises) {
			System.out.println(elemento);
		}

	}

}
