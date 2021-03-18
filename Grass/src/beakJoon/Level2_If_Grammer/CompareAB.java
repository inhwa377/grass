package beakJoon.Level2_If_Grammer;

import java.util.Scanner;

public class CompareAB {

	public static void main(String[] args) {
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} 
		if(A < B) {
			System.out.println("<");
		} 
		if(A == B) {
			System.out.println("==");
		}

	}

}
