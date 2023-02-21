package game;
// �ҽ� �ڵ� ����
import java.util.Scanner;

public class upDown {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100 + 1);
		int guess;
		int count = 0;
		Scanner scan = new Scanner(System.in);

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
	}

}
