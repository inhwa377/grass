package beakJoon.Level3_For_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class less_than_X {

	public static void main(String[] args) {
		int N; //수열A의 정수 갯수
		int X;
		String[] A = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			N = Integer.parseInt(br.readLine());
			X = Integer.parseInt(br.readLine());
					
			for(int i=0; i<N; i++) {
				A[i] = Arrays.toString(br.readLine().split(" ")); 
				
				if(Integer.parseInt(A[i]) < N) {
					bw.write(A[i]);
				}
			}
			
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 = " + e.getMessage());
		}
	}

}
