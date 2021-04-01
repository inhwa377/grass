package beakJoon.Level5_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class leftover {

	public static void main(String[] args) {
		int[] num = new int[10];
		int cnt = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			for(int i=0; i<10; i++) {
				num[Integer.parseInt(br.readLine()) % 42]++;
			}
			
		
			bw.newLine();
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
