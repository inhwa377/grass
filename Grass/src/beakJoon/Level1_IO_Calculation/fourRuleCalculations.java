package beakJoon.Level1_IO_Calculation;

import java.util.Scanner;

public class fourRuleCalculations {

	public static void main(String[] args) {
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}

}
