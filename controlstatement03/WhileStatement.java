package controlstatement03;

import java.io.IOException;

public class WhileStatement {

	public static void main(String[] args) throws IOException {
	int sum=0;
	int i=1;// [초기식]
	while(i<=10) { //[반복조건]
	sum+=i; //[명령문]
	i++; // [증감식]
	}
	System.out.println("1부터 10까지 누적합:"+sum);
	System.out.println("while문이 끝난 후 i:"+i);
	
	sum=0;
	int j=1;
	while(j<=100) {
		if(j%3 == 0 ^ j%5 == 0) sum+=j;
		j++;
	}
	System.out.println(sum);
	
	
	//사용자가 몇 자를 입력할지 모름으로 while문 사용
	System.out.println("문자열을 입력하세요.");
	char word;
//	while((word=(char)System.in.read()) !=10) {
//		System.out.print(word);
//	}

	//사용자가 몇 자를 입력할지 모름으로 for문 사용
	for(;(word=(char)System.in.read()) !=10;) {
		System.out.print(word);
	}
	
	/*
	0 0 0 1 (1,4)
	0 0 1 0 (2,3)
	0 1 0 0 (3,2)
	1 0 0 0	(4,1)
	 */
	
	int k=1;
	while(k<=4) {
		int h=4;
		while(h>=1) {
			if(k==h) System.out.printf("%-2d",1);
			else System.out.printf("%-2d",0);
			h--;
			}
		System.out.println("");
		k++;
	}
	// h를 초기식 맨 위로 올리면 오류난다,, 그림 그려봐라!
	
	/*
	 *
	 * *
	 * * *
	 * * * *
	 * * * * * 출력하기
	 */
	k=1;
	while(k<=5) {
		j=1;
		while(k >= j) {
			System.out.printf("%2c",'*');
			j++;
		}
		//줄 바꿈
		System.out.println("");
		k++;
	}
	
	// 구구단 짜기
	i=1;
	while(i<=9) {
		j=2;
		while(j<=9) {
			System.out.printf("%d * %d = %-4d",j,i,i*j);
			j++;
		}
		System.out.println("");
		i++;
	}
	
	while(true) {
		System.out.println("무한루프");
		break;
	}
	System.out.println("프로그램 끝");
	}///main
}/// class
