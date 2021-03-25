package beakJoon.Level5_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class min_max {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int index = 0;
			int[] arr = new int[N];
			
			while(st.hasMoreTokens()) {
				arr[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			Arrays.sort(arr);
			bw.write(arr[0] + " " + arr[N - 1]);
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
