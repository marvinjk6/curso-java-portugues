package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int [n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Main diagonal");
		for(int i=0; i< mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		
		for (int i = 0; i< mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.print("Negative numbers: " + 2);
		
		sc.close();
	}

}
