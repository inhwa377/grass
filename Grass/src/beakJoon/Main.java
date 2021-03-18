package beakJoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int H;
		int M;
		int MM;
		
		Scanner sc = new Scanner(System.in);
		
		H = sc.nextInt();
		M = sc.nextInt();
		MM = M - 45;
		
		if((0 <= H && H <= 23) || (0 <= M && M <= 59)) {
			if(MM < 0) {
				H = H - 1;
				M = MM + 60;
				
				if(H < 0) {
					H += 24;
				}
				
				System.out.println(H);
				System.out.println(M);
				
			} else if(MM >= 0) {
				System.out.println(H);
				System.out.println(MM);
			}
		}
	}
}
