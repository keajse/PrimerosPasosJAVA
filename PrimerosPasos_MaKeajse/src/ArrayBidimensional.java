
public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [][] matrix = new int[4][5];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		matrix[0][4] = 5;
		
		matrix[1][0] = 6;
		matrix[1][1] = 7;
		matrix[1][2] = 8;
		matrix[1][3] = 9;
		matrix[1][4] = 10;
		
		matrix[2][0] = 11;
		matrix[2][1] = 12;
		matrix[2][2] = 13;
		matrix[2][3] = 14;
		matrix[2][4] = 15;
		
		matrix[3][0] = 16;
		matrix[3][1] = 17;
		matrix[3][2] = 18;
		matrix[3][3] = 19;
		matrix[3][4] = 20;*/
		
		//System.out.println(matrix[0][0]);
		
		
		int [][] matrix = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
		};
		
		/*for (int i=0; i<matrix.length;i++) {
			for (int j=0; j<5;j++) {
				System.out.println("Indice " + i + " posición "+ j+ " = "+matrix[i][j]);
			}
			
		}*/
		
		for(int[]fila:matrix) {
			System.out.println();
			
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}
		
		//System.out.println(matrix.length);
				
			
		

	}

}
