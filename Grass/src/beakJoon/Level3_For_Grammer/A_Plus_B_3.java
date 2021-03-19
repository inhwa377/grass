package beakJoon.Level3_For_Grammer;

import java.util.Scanner;

public class A_Plus_B_3 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		
		Scanner sc = new Scanner(System.in);
		
		C = sc.nextInt();
		
		for(int i=0; i < C; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A+B);
		}
	}

}
