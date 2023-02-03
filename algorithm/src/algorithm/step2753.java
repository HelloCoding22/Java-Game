package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step2753 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine()," ");
		// 연도
		int year = Integer.parseInt(st.nextToken()); 
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}