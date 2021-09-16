
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] miArray = new int[5];
		
		miArray[0]=1;
		miArray[1]=8;
		miArray[2]=5;
		miArray[3]=7;
		miArray[4]=2;
		
		
		for (int i=0; i<5; i++) {
			System.out.println(miArray[i]);
		}*/
		
		//Declaración implicita
		
		int [] miArray = {1,8,5,7,2,15,25,65,100};
		
		for (int i=0; i<miArray.length; i++) {
			System.out.println("Indice "+ i +" = " + miArray[i]);
		}
		

	}

}
