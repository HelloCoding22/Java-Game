// 소스 코드 수정 중
// 주석 한줄 달기
package game;

import java.util.Scanner;
// 변화를 일으켜
public class upDown {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100 + 1);
		int guess;
		int count = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Input the number: ");
			guess = scan.nextInt();
			count++;
			
			if(guess > answer)
				System.out.println("DOWN!");
			if(guess < answer)
				System.out.println("UP!");
		} while(guess != answer);
		
		System.out.println("축하합니다. 시도 횟수는 " + count + " 번 입니다.");
	}

}
