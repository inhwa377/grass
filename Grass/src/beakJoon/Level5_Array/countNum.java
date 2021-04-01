package beakJoon.Level5_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class countNum {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {

			int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
			
			String str = String.valueOf(mul);
			
			for(int i=0; i<str.length(); i++) {
				arr[(str.charAt(i) - 48)]++;
			}
			
			for(int j : arr) {
				bw.write(String.valueOf(j));
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
