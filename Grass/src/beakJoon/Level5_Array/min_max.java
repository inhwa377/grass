package beakJoon.Level5_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class min_max {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			String S = br.readLine();
			//int max = A[0];
					
			for(int i=1; i<N; i++) {
				/*
				 * if(A[i] > max) {
				 * 
				 * }
				 */
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
