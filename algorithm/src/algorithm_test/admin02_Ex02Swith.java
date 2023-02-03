package algorithm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class admin02_Ex02Swith {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수설정 및	변수받기
		int kor, eng, mat;
		System.out.print("국어점수=");
		kor = Integer.parseInt(in.readLine());
		System.out.print("영어점수=");
		eng = Integer.parseInt(in.readLine());
		System.out.print("수학점수=");
		mat = Integer.parseInt(in.readLine());
		
		//총점
		int all = kor+eng+mat;
		
		//평균
		double avg = (double)all/10 ; 
		
		String grade = "F";
		switch((int)avg/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: break;
		}
		System.out.println("총점="+all);
		System.out.println("총점="+avg);
		System.out.println("총점="+grade);
	}

}
