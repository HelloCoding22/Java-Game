package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step2739 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());		
//
		int dan = Integer.parseInt(st.nextToken());
		
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i +" = "+ dan*i);
		}
	}

}
