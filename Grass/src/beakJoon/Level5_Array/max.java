package beakJoon.Level5_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class max {

	public static void main(String[] args) {
		int[] arr = new int[9];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int max = 0; //최댓값
			int index = 0; //최댓값의 n번째 번호
			int count = 0; //최댓값의 번호를 세기위한 카운트
			
			for(int value:arr) {
				count++;
				if(value > max) {
					max = value;
					index = count;
				}
			}
			
			bw.write(String.valueOf(max));
			bw.newLine();
			bw.write(String.valueOf(index));
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 = " + e.getMessage());
		}
	}

}
