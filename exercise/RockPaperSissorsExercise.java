package console;

import java.util.Scanner;

public class RockPaperSissorsExercise {
	public static final int SCISSORS=1;
	public static final int ROCK=2;
	public static final int PAPER=3;
	
	//메뉴 출력용 메소드
	//숫자를 랜덤하게 발생시키는 메소드
	//사용자 입력받아서 반환하는 메소드
	//상수값에 따라 문자열을 반환하는 메소드
	//게임 승리 여부 판단 후 결과 출력하는 메소드 
	//메뉴 번호 체크용 메소드
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========메뉴 번호========");
		System.out.println("1.가위 2.바위 3.보 9.종료");
		System.out.println("======================");
		while(true) {
			int computer = (int)(Math.random()*3)+1;
			System.out.println("메뉴를 입력하세요.");
			int user =sc.nextInt();
			if(user==9)
				break;
			int menu[]= {1,2,3,9};
			boolean bFlag=false;
			for(int i=0;i<menu.length;i++) {
				if(user==menu[i]) {
					bFlag=true;
					break;
				}
			}
			if(!bFlag) {
				System.out.println("없는 메뉴 번호입니다.");
				continue;
			}
			String userString = user==SCISSORS ? "가위" : user==ROCK ?"바위" :"보";
			String computerString = computer==SCISSORS ? "가위" : computer==ROCK ?"바위" :"보";
			System.out.printf("당신은 : %s 컴퓨터는 : %s\n",userString,computerString);
			if(user==SCISSORS && computer==PAPER ||
				user==PAPER && computer==ROCK ||
				user==ROCK && computer==SCISSORS)
				System.out.println("당신이 이겼습니다.");
			else if(user==computer)
				System.out.println("비겼습니다.");
			else
				System.out.println("당신이 졌습니다.");
		}//while
		System.out.println("게임 종료");
	}//main
}//class
