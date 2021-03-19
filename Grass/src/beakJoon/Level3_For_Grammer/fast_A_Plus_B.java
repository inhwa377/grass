package beakJoon.Level3_For_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fast_A_Plus_B {

	public static void main(String[] args) {
		int A;
		int B;
		int N;
		String[] A_B;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			N = Integer.parseInt(br.readLine());
			
			for(int i=0; i < N; i++) {
				A_B = br.readLine().split(" ");
				A = Integer.parseInt(A_B[0]);
				B = Integer.parseInt(A_B[1]);
				
				bw.write(String.valueOf(A+B));
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿¡·¯ = " +e.getMessage());
		}
	}

}
