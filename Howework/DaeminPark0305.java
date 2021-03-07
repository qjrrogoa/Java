package console;

import java.util.Scanner;

public class DaeminPark0305 {

	//2]랜덤 하게 숫자를 발생시켜 배열에 저장하는 메소드 호출
	private static void setLottoNumber(int[] lotto, int start, int end) {
		for(int i=0;i<lotto.length;i++) {
			while(true) {
				int lottoNumber=(int)(Math.random()*(end-start+1))+start;
				boolean dFlag=false;
				for(int j=0;j<=i-1;j++) {
					if(lotto[j]==lottoNumber) {
						dFlag=true;
						break;
					}
				}
				if(!dFlag) {
					lotto[i]=lottoNumber;
					break;
				}
			}////while
		}////for
	}////setRandomNumber
	
	//3]로또 번호를 출력하는 메소드 호출
	private static void printLotto(int[] lotto) {
		System.out.println("로또 번호 출력");
		for(int i=0;i<lotto.length;i++) {
			System.out.printf("%d  ",lotto[i]);
		}
	}///printLotto
	
	//4] 로또 발생 계속 여부를 판단하는 메소드 호출
	private static void isContinue(){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n종료하려면 'x' 나 'X'를 입력하세요.\n계속하려면 아무키나 입력세요.");
		String exitcode = sc.nextLine();
		if(exitcode.equalsIgnoreCase("X")) {
			System.out.println("로또 끝 ");
			System.exit(0);
		}
	}////isContinue()
	
	public static void main(String[] args) {
		//1] 6개의 숫자를 저장할 배열 선언 및 메모리 할당
		int lotto[]=new int [6];
		while(true) {
			setLottoNumber(lotto,1,45);
			printLotto(lotto);
			isContinue();
		}
	}////main
}////class
