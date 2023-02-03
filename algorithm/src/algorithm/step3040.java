package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step3040 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 전체 난쟁이 
		int a[] = new int[9];
		// sum 전체합
		int sum = 0;
		// 난쟁이가 아닌경우
		int fal = 0;
		int fal2 = 0;
		
		//a[]에 10개 변수받기
		for(int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(in.readLine());
			sum += a[i];
		}
		// 더한값이 100이 아닌경우
		for(int i=0; i<a.length-1; i++) {
			for(int j=i; j<a.length; j++) {
				if(sum - a[i] - a[j] == 100 && i != j) {
					fal = i;
					fal2 = j;
					break;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			if(i == fal || i == fal2)
				continue;
			System.out.println(a[i]);
		}
	}
}