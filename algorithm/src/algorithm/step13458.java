package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step13458 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int classNum = Integer.parseInt(in.readLine());// 시험장의 개수
		int classStu[] = new int[classNum]; //응시자의 수 배열에 넣기
		StringTokenizer st; 
		st = new StringTokenizer(in.readLine()," ");
		for(int i=0;i<classNum;i++) {
			classStu[i] = Integer.parseInt(st.nextToken());// 응시자의 수
		}
		//=========최솟값=========
		st = new StringTokenizer(in.readLine()," ");
		int classMain = Integer.parseInt(st.nextToken());// 총감독관의 수
		int classSub = Integer.parseInt(st.nextToken());// 부감독관의 수
		
		long sum = 0; //-->minNum의 누적값 
		for(int i=0;i<classNum;i++) { // 3번반복
			int minNum = 0;//최소감독관 지정
			// 응시자 수      총감독관의 수 => 나머지 부감독관의 수  
			classStu[i] -= classMain; 
			
			if(classStu[i]>0) { // => 나머지 부감독관의 수 
				minNum = classStu[i]/classSub;
				if(classStu[i]%classSub !=0) {
					minNum++;
				}
				sum += minNum+1;
			}else if(classStu[i]<=0){
				sum += 1;
			}
		}
		System.out.println(sum);
		
		 
		
	}

}
