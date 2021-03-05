package console;

import java.io.IOException;
import java.util.Scanner;

public class BaseBall {
	
	//1. 랜덤하게 숫자 발생 후 중복되지 않게 배열에 저장하는 메소드 
	private static void setRandomNumber(int[] random, int start, int end) {
		for(int i=0;i<random.length;i++) {
			while(true) {
				//랜덤하게 숫자 발생 시키자.
				int randomNumber=(int)(Math.random()*(end-start+1))+1;
				//랜덤하게 발생시킨 숫자의 중복 여부 체크를 위한 변수 선언
				boolean isDuplicated=false;
				//랜덤하게 발생시킨 숫자(randomNumber)와 배열에 저장된 값의
				//중복 여부 체크 
				for(int k=0;k<=i-1;k++) {
					if(randomNumber==random[k]) {//중복된 경우
						isDuplicated = true;
						break;
					}
				}
				if(!isDuplicated) {// 중복이 안 된 경우
					random[i]=randomNumber;
					break;
				}
			}///while
		}/////안 for
	}/////////////setRandomNumber
	
	//2. 사용자 입력용 메소드]
	private static void setUserNumber(int[] user) {
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("세자리 숫자를 입력하세요.");
			int userNumber = sc.nextInt();
			user[0] = userNumber/100;
			user[1] = userNumber%100/10;
			user[2] = userNumber%10;
			//중복 여부 판단
			//문] 중복된 숫자가 포함된 경우 "중복된 숫자가 있어요" 라는 메시지를 출력하고
			// 사용자로부터 중복된 숫자가 없을때까지 입력받도록 하여라.
			//방법2]
			boolean isDuplicated=false;
			for(int i=0;i<user.length-1;i++) {
				for(int j=i+1;j<user.length;j++) {
					if(user[i]==user[j]) {//중복된 경우
						isDuplicated=true;
						break;/// 안쪽 for 빠져나감 
					}/////if
				}////안 for
				if(isDuplicated) break; // 바깥 for 빠져나감
			}////밖 for
			if(isDuplicated) {
				System.out.println("중복된 숫자가 있어요");
				continue;
			}///if
			break;////while break
		}////while
	}////////////setUserNumber
	
	//3.판단 후 스트라이크 볼 저장용 메소드]
	private static void setStrikeNBall(int[] computer, int[] user, int[] strikeOrBall) {
		for(int i=0;i<computer.length;i++) {
			for(int k=0;k<user.length;k++) {
				//자리수(인덱스)도 같고 값도 같은 경우 스트라이크
				if(i==k && computer[i]==user[k]) strikeOrBall[0]++;
				else if(i!=k && computer[i]==user[k]) strikeOrBall[1]++;
			}
		}/////for
	}/////setStrikeNBall
	
	//4. 게임 계속 여부 판단용 메소드]
	private static void isContinue(){	
		Scanner sc = new Scanner(System.in);
		System.out.println("\n종료하려면 : 'X',나'x'\r\n계속하려면 아무키나....");
		String exitCode = sc.nextLine();
		if(exitCode.equalsIgnoreCase("X")) {
			System.out.println("즐거우셧죠.. 다음에...");
			System.exit(0);//프로그램 종료
		}
	}///////isContinue
	
	public static void main(String[] args) {
		while(true) {
		//1] 랜덤하게 세자리 숫자를 발생시키자(컴퓨터)
		//랜덤하게 발생시킨 숫자를 저장할 1차원 배열 선언 
		int computer[] = new int[3];
		setRandomNumber(computer,1,9);
		//컴퓨터 숫자 확인하기위한 출력]
		for(int i=0;i<computer.length;i++) {
			System.out.printf("%-3d",computer[i]);
		}
		System.out.println("");
		int Count=1;
		while(true) {
				//2] 사용자로부터 3자리 숫자를 입력받자
				//사용자 입력 숫자를 저장할 1차원 배열 선언
				int user[]=new int[3];
				setUserNumber(user);
				//3]판단하기 즉 자리(인덱스)가 같고 값이 같으며 스트라이크,
				// 자리는 다르고 값만 같으면 볼
				//0번째 방에는 스트라이크,1번째 방에는 볼 저장
				int strikeOrBall[] = new int[2];
				setStrikeNBall(computer,user,strikeOrBall);
				// 스트라이크 / 볼 출력
				System.out.printf("%d Strike, %d Ball%n",strikeOrBall[0],strikeOrBall[1]);
				if(strikeOrBall[0]==3) {
					System.out.printf("빙고 짝! 짝! 짝! %d번째에 맞췄어요 축하합니다.",Count);
					break;
				}
				Count++;
			}////안 while
			//4] 게임 계속여부 판단용 메소드 호출
			isContinue();
		}////밖 while
	}////////////////////main
}////////////////////class
