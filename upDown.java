package game;
// 소스 코드 수정
import java.util.Scanner;

public class upDown {
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100 + 1);
		int guess;
		int count = 0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("�젙�떟�쓣 異붿륫�븯�뿬 蹂댁꽭�슂 : ");
			guess = scan.nextInt();
			count++;
			
			if(guess > answer)
				System.out.println("�떎�슫!");
			if(guess < answer)
				System.out.println("�뾽!");
		} while(guess != answer);
		
		System.out.println("異뺥븯�빀�땲�떎. �떆�룄 �슏�닔�뒗 " + count + " 踰� �엯�땲�떎.");
	}

}
