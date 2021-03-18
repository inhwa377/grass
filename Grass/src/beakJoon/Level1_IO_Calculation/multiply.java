package beakJoon.Level1_IO_Calculation;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		int A;
		int B;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		sum = A*B;
		
		System.out.println(A * (B%10));
		System.out.println(A * ((B/10)%10));
		System.out.println(A * ((B/100)%10));
		System.out.println(sum);
		

	}

}
