package method05;

import java.io.IOException;
import java.util.Scanner;

public class MethodShape04 {

	/*
	 * 인원수를 매개변수로 전달받아 인원수만큼 나이를 사용자로부터 입력받고 
	 * 그 나이의 평균을 반환하는 메소드 정의 
	 */
	//1] 메서드 정의
	static int getAverageOfAge(int personCount) throws IOException {
		Scanner sc = new Scanner(System.in);
		int total=0;
		for(int i=0;i<personCount;i++) {
			System.out.println(i+1+"번째 나이 입력? ");
			total+=sc.nextInt();
		}
		return total/personCount;
	}
	/*
	 * 매개변수로 두 숫자와 연산자를 전달 받아서 메소드를 정의 
	 */
	static int getCalc(int anum,char bchar,int cnum) {
	int result;
	switch(bchar) {
	case '+':
		return result=anum+cnum;
	case '-':
		return result=anum-cnum;
	case '*':
		return result=anum*cnum;
	case '/':
		return result=anum/cnum;
	default: 
		return result = -21000000;
	}
	}//getCalc
	/*
	 * 여러개의 숫자를 입력받아서 그 중에 최대값을 구하는 메소드를 정의하자.
	 * 숫자의 개수 만큼 사용자로부터 숫자를 입력받아 최대값을 구하자.
	 */
	static int getInput(int input) {
		int max=0;
		Scanner sc = new Scanner(System.in);
		int output[] = new int [input];
		for(int i=0;i<input;i++) {
			System.out.println(i+1+"번쨰 숫자를 입력하세요");
			output[i]=sc.nextInt();
			if(output[i]>max) max=output[i];
		}
		return max; 
	}//getInput
	
	public static void main(String[] args) throws IOException {
	//2]메소드 호출 
	System.out.println("3명의 평균나이 :"+getAverageOfAge(3));
	int a = getCalc(10,'+',10);
	if(a==-21000000) System.out.println("잘못된 연산자 기호입니다.");
	System.out.println(a);

	System.out.printf("최대값은 %d입니다.",getInput(3));
	
	}///main
}////class
