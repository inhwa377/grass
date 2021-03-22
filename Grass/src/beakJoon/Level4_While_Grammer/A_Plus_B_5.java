package beakJoon.Level4_While_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_Plus_B_5 {

	public static void main(String[] args) {
		String[] input;
		String end1 = "0";
		String end2 = "0";
		int A;
		int B;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			while(true) {
				input = br.readLine().split(" ");
				A = Integer.parseInt(input[0]);
				B = Integer.parseInt(input[1]);

				if(input[0].equals(end1) && input[1].equals(end2)) {
					break;
				}
				
				bw.write(String.valueOf(A+B));
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿¡·¯ = " + e.getMessage());
		}
	}

}
