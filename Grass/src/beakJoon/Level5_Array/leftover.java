package beakJoon.Level5_Array;

import java.util.HashSet;
import java.util.Scanner;

public class leftover {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hs.add(sc.nextInt() % 42);
		}
		
		sc.close();
		System.out.print(hs.size());
		
	}

}
