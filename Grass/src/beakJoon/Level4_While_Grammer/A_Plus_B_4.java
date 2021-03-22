package beakJoon.Level4_While_Grammer;

import java.util.Scanner;

public class A_Plus_B_4 {

	public static void main(String[] args) {
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A+B);
		}
		
	}

}
