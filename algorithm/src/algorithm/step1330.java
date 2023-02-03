package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step1330 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		StringTokenizer st = new StringTokenizer(in.readLine(), str);
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A<B) {
			System.out.println("<");
		}else if(A>B){
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}
