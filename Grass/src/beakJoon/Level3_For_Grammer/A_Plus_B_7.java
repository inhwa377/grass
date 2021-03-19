package beakJoon.Level3_For_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_Plus_B_7 {

	public static void main(String[] args) {
		int A;
		int B;
		String[] AB;
		int N;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		try {
			
			N = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=N; i++) {
				AB = br.readLine().split(" ");
				
				A = Integer.parseInt(AB[0]);
				B = Integer.parseInt(AB[1]);
				
				bw.write("Case #" + i + ": " + String.valueOf(A+B));
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
