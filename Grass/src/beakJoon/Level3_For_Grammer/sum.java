package beakJoon.Level3_For_Grammer;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int n;
		int i;
		int j=0;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			j = j+i;
		}
		
		System.out.println(j);
	}

}
