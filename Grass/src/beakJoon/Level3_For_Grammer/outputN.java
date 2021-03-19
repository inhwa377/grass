package beakJoon.Level3_For_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class outputN {

	public static void main(String[] args) {
		int N;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			N = Integer.parseInt(br.readLine());
			
			for(int i=1; i <= N; i++) {
				bw.write(String.valueOf(i));
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("¿¡·¯ = " + e.getMessage());
		}

	}

}
