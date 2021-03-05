package console;

import java.util.Scanner;

public class RockPaperScissors2MethodVersion {
	// 상수 정의]
	public static final int SCISSORS=1;
	public static final int ROCK=2;
	public static final int PAPER=3;
	public static final int REMENU=4;
	public static final int QUIT=9;

	// 메뉴번호 처리용 상수
	public static final char EXIT = 'E';
	public static final char CONTINUE = 'C';
	public static final char NORMAL = 'N';

	
	//메뉴 출력용 메소드
	static void printMenu() {
		System.out.println("========메뉴 번호=========");
		System.out.println("1.가위 2.바위 3.보 4.메뉴 다시보기 9.종료");
		System.out.println("========================");
	}//////////printMenu()
	
	//숫자를 랜덤하게 발생시키는 메소드
	static int getComputerNumber(int start,int end) {
		return (int)(Math.random()+(end-start+1))+start;
	}/////////getComputerNumber
	
	//사용자 입력받아서 반환하는 메소드
	static int getUserNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		return sc.nextInt();
	}//////getUserNumber
	
	//게임 승리 여부 판단 후 결과 출력하는 메소드 
	static void printGame(int user, int computer) {
		
		System.out.printf("[컴퓨터:%s,사용자:%s] ",getStringValue(computer),getStringValue(user));

		if(user==SCISSORS && computer==ROCK || 
			user==ROCK && computer==PAPER ||
			user==PAPER && computer==SCISSORS) 
			System.out.println("당신이 졌어요.");
		else if (user==computer)
			System.out.println("비겼어요.");
		else System.out.println("당신이 이겼어요.");
	}////printGame
	
	
	//상수값에 따라 문자열을 반환하는 메소드
	static String getStringValue(int number) {
		switch(number) {
		case SCISSORS: return "가위";
		case ROCK: return "바위";
		default: return "보";
		}
	}///////getStringValue
	
	//메뉴 번호 체크용 메소드]
	static char checkMenu(int user) {
		//메뉴 번호 배열 저장용 배열
		int menus[] = {1,2,3,4,9};
		if(user==QUIT) return EXIT;
		else if(user==REMENU) {
			printMenu();
			return CONTINUE;
		} 
		//없는 메뉴번호 입력시 
		boolean bFlag=false;
		for(int i=0;i<menus.length;i++) {
		if(user == menus[i]) {// 사용자가 입력한 번호가 메뉴 번호인 경우
			bFlag=true;
			break;
			}
		}////////for
		if(!bFlag) {// 없는 메뉴번호 입력 시 
			System.out.println("없는 메뉴번호 입니다.");
			return CONTINUE;
			}//for
		return NORMAL;
		}////////checkMenu

	public static void main(String[] args) {
		//메뉴 번호 배열 저장용 배열
		//int menus[] = {1,2,3,4,9};
		/*
		 * (int)(Math.random()*(차이값+1))+시작값
		 * 5부터 15사이의 숫자를 덤하게 발생시키려면
		 * (int)(Math.random()*11)+5
		 */
		//1] 메뉴 출력
		printMenu();
		while(true) {
			//[2] 컴퓨터 숫자 랜덤하게 발생
			int computer=getComputerNumber(1,3);
			//[3] 사용자 숫자 입력 받기
			int user=getUserNumber();
			
			/* 메뉴번호 체크를 메소드로 처리하지 않는 경우
			if(user==9) break;
			else if(user==4) {
				printMenu();
				continue;
			
			}
			//없는 메뉴번호 입력시 
			boolean bFlag=false;
			for(int i=0;i<menus.length;i++) {
				if(user == menus[i]) {// 사용자가 입력한 번호가 메뉴 번호인 경우
					bFlag=true;
					break;
				}
			}////////for
			if(!bFlag) {// 없는 메뉴번호 입력 시 
				System.out.println("없는 메뉴번호 입니다.");
				continue;
			}
			*/
			
			//메뉴번호 체크를 메소드로 처리한 경우
			char checks=checkMenu(user);
			if(checks==EXIT) {
				System.out.println("정말 즐거웠어요");
				break;
			}
			else if(checks==CONTINUE) {
				continue;
			}
			
			//[4] 게임 승리여부 판단
			printGame(user,computer);
		}//while
		//System.out.println("즐거웠죠?!");
		
	}//main
}//class
