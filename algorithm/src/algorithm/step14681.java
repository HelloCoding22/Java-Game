package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step14681 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(in.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st2.nextToken());
		
		if(a>0 && b>0) {
			System.out.println("1");
		}else if(a<0 && b>0) {
			System.out.println("2");
		}else if(a<0 && b<0) {
			System.out.println("3");
		}else if(a>0 && b<0) {
			System.out.println("4");
		}
	}

}
