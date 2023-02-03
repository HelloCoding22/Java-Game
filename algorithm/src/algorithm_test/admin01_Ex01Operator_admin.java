package algorithm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class admin01_Ex01Operator_admin {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("사과의 개수=");
		int apple = Integer.parseInt(in.readLine());
		int basket = apple / 8;
		
		basket= (apple%8==0)? basket : basket+1;
		
		System.out.println("basket은"+basket+"개가 필요합니다.");
	}

}
