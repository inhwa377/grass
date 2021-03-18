package beakJoon.Level2_If_Grammer;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		int X;
		int Y;
		
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if(X > 0 && Y > 0) {
			System.out.println("1");
		} else if (X < 0 && Y > 0) {
			System.out.println("2");
		} else if (X < 0 && Y < 0) {
			System.out.println("3");
		} else if (X > 0 && Y < 0) {
			System.out.println("4");
		}
	}

}
