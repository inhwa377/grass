package beakJoon.Level3_For_Grammer;

import java.util.Scanner;

public class timesTable {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println( N + " * " + i + " = "  + (N*i) );
		}

	}

}
