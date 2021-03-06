package beakJoon.Level3_For_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class less_than_X {

	public static void main(String[] args) {
		String[] input = null;
		int N; //수열A의 정수 갯수
		int X;
		String[] A = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			X = Integer.parseInt(input[1]);
			A = br.readLine().split(" "); 
			
			for(int i=0; i<N; i++) {
				if(Integer.parseInt(A[i]) < X) {
					bw.write(A[i]);
					bw.write(" ");
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
