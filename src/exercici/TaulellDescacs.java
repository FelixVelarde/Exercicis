package exercici;

import java.util.Scanner;

public class TaulellDescacs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int g = 0; g < casos; g++) {
			
			int filcol = sc.nextInt();
			
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			
			int[][] m = taulell(num, num2, filcol);
			
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m[0].length; j++) {
					System.out.print(m[i][j] + " ");
				}System.out.println();
			}
			
		}
		
	}

	public static int[][] taulell(int filcol, int num, int num2) {
		
		int[][] matriu = new int[filcol][filcol];
		
		for(int i = 0; i < matriu.length; i++) {
			for(int j = 0; j < matriu[0].length; j++) {
				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)) {
					matriu[i][j] = num;
				}else {
					matriu[i][j] = num2;
				}
			}
		}
		
		return matriu;
	}
	
	

}
