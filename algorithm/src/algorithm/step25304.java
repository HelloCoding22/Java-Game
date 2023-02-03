package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step25304 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringTokenizer st2 = new StringTokenizer(in.readLine());

		int allMoney = Integer.parseInt(st.nextToken()); // 모든 금액 변수받기
		int count = Integer.parseInt(st2.nextToken()); // 제품의 개수 변수받기
		
		for(int i=0;i<count;i++) {// 제품의 개수만큼 변수받기
			StringTokenizer st3 = new StringTokenizer(in.readLine()); 
			int money = Integer.parseInt(st3.nextToken()); //제품당 금액받기 
			int num = Integer.parseInt(st3.nextToken()); // 제품당 구매한 개수
			
			allMoney = allMoney - (money*num); // 전체금액 = 전체금액-(제품*제품금액) -> 모든 제품의 금액을 뺏을 때 0이라면 ture
		}
		if(allMoney==0) System.out.println("Yes");
		else System.out.println("No");
	}

}
