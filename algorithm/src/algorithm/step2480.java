package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step2480 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");

		int first = Integer.parseInt(st.nextToken());
		int secon = Integer.parseInt(st.nextToken());
		int three = Integer.parseInt(st.nextToken());
		 
		
		if(first==secon && first==three && secon==three) {// 주사위 눈의 수가 모두 같을 때
			System.out.print(10000+first*1000);
		}else if(first!=secon && first!=three && secon!=three) {// 주사위 눈의 수가 모두 다를 때
			if(first>secon && first>three) {// 1번이 제일 클때
				System.out.print(first*100);
			}else if(secon>first && secon>three) {
				System.out.print(secon*100);
			}else{
				System.out.print(three*100);
			}
		}else { // 주사위 눈의 수가 2개만 같을 때
			if(first>secon && secon==three) {// 2,3번이 같고 1번이 더 큰값일 때
				System.out.print(1000+secon*100);
			}else if(first<secon && secon==three) {// 2,3번이 같고 1번이 더 작은 값일 때
				System.out.print(1000+secon*100);
			}else if(first>three && first==secon) {// 1,2번이 같고 3번이 더 작은 값일 때
				System.out.print(1000+first*100);
			}else if(first<three && first==secon) {// 1,2번이 같고 3번이 더 큰 값일 때
				System.out.print(1000+first*100);
			}else if(secon>three && first==three) {// 1,3번이 같고 2번이 더 큰 값일 때
				System.out.print(1000+first*100);
			}else {// 1,3번이 같고 2번이 더 작은 값일 때
				System.out.print(1000+first*100);
			}
		}
		
	}

}
