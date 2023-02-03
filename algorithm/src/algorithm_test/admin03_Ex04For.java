package algorithm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class admin03_Ex04For {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do {//단입력
			System.out.print("단입력=");
			int dan = Integer.parseInt(in.readLine()); 
			
			if(dan >=2 && dan<10) { //2~9단까지
			for(int i=2; i<=9; i++) {// 2,3,4,5,6,7,8,9
				int result = dan*i;
				System.out.println(dan+"*"+i+"="+result);
			}
			
			}else {// 잘못입력된 경우
				System.out.println("단을 잘못입력하였습니다.");
			}
		}while(true);
	}

}
