package beakJoon.Level3_For_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class star1 {

	public static void main(String[] args) {
		String star = "*";
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			n = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=n; i++) {
				for(int j=0; j<i; j++) {
					bw.write(star);
				}
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� = " + e.getMessage());
		}
	}

}
