package console;

import java.util.Scanner;

public class BaseBallExercise {

	public static void main(String[] args) {
		//1] 랜덤하게 세자리 숫자를 발생시키자(컴퓨터)
		//2] 사용자로부터 3자리 숫자를 입력받자
		//사용자 입력 숫자를 저장할 1차원 배열 선언
		//3]판단하기 즉 자리(인덱스)가 같고 값이 같으며 스트라이크,
		// 자리는 다르고 값만 같으면 볼
		//0번째 방에는 스트라이크,1번째 방에는 볼 저장
		int computer[]= new int[3];
		for(int i=0;i<computer.length;i++) {
			int randomNumber=(int)(Math.random()*9)+1;
			computer[i]=randomNumber;
			System.out.printf("%d",computer[i]);
		}
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		int user[] = new int [3];
		System.out.println("세 숫자를 입력하세요.");
		int userNumber=sc.nextInt();
		user[0]=userNumber/100;
		user[1]=userNumber%100/10;
		user[2]=userNumber%10;
		
		int strikeNball[] = new int[2];
		for(int i=0;i<computer.length;i++) {
			for(int j=0;j<user.length;j++) {
				if(i==j && computer[i]==user[j]) strikeNball[0]++;
				else if(i!=j && computer[i]==user[j]) strikeNball[1]++;
			}
		}
		System.out.printf("%d Strike, %d Ball%n",strikeNball[0],strikeNball[1]);
		if(strikeNball[0]==3) {
			System.out.println("빙고 짝! 짝! 짝!맞췄어요 축하합니다.");
		}
		
		
	}//////main
}////class
