package algorithm;

import java.util.Scanner;

public class step8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=count;i++) {
			sum += i;
		}System.out.print(sum);
	}

}
