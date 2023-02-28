// 소스 코드 수정 중
// v1
package game;

import java.util.Scanner;

public class upDown {
	        public static void main(String[] args) {


	                int answer = (int)(Math.random() * 100 + 1);
	                int guess;
	                int count = 0;
	                Scanner scan = new Scanner(System.in);
	                for(;;) {
	                System.out.println("게임을 시작하려면 1 종료하려면 아무 숫자나입력하세요");
	                int a = scan.nextInt();
	                		if(a==1) {
	                do {
	                        System.out.print("정답을 추측하여 보세요 : ");
	                        guess = scan.nextInt();
	                        count++;

	                        if(guess > answer)
	                                System.out.println("다운!");
	                        if(guess < answer)
	                                System.out.println("업!");
	                } while(guess != answer);

	                System.out.println("축하합니다. 시도 횟수는 " + count + " 번 입니다.");
	        }else {
	        	System.out.println("게임을 종료합니다");
	        	break;
	        }
	        }
	        }
	}



