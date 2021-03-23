package beakJoon.Level4_While_Grammer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PlusCycle {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N; //시작하는 숫자
		int count = 0; //횟수 
		int copy; //더한 새로운 숫자

		try {
			N = Integer.parseInt(br.readLine());
			copy = N;
			
			do {
				N = ((N%10)*10) + ((N/10 + N%10)%10);
				count++;

			} while (N != copy);
			
				bw.write(String.valueOf(count));
				bw.flush();
				bw.close();
				
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 = " + e.getMessage());
		}

	}

}
