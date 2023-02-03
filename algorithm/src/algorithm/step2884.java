package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step2884 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine()," ");
		
		
		int hou = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken()); // 
		
		if(min-45>=0) {
			min=min-45;
			System.out.print(hou+" ");
			System.out.print(min);
		}else if(min-45<=0 && hou==0) {
			hou=23;
			min=min+15;
			System.out.print(hou+" ");
			System.out.print(min);
		}else if(min-45<=0) {
			hou=hou-1;
			min=min+15;
			System.out.print(hou+" ");
			System.out.print(min);
		}
	}

}
// 35분-45분 -> 10분
// 30분-45분 -> 45분
// 25분-45분 -> 40분
// 20분-45분 -> 35분
// 15분-45분 -> 30분
// 12분-45분 -> 27분