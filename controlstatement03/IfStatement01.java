package controlstatement03;

import java.io.IOException;

public class IfStatement01 {

	public static void main(String[] args) throws IOException {
	/*
	int num1=10;
	//if(num1 % 2) {} //[x] 산술식 안된다.
	//if(num1) {} // [x] 안된다.
	
	if(num1 % 2 == 0) {
		System.out.printf("%d는 짝수%n",num1);	
	}
	
	if(num1 % 2 != 0) {
		System.out.printf("%d는 홀%n",num1);	
	}[출력은 안됨]
	
	if(num1 % 2 == 0 && num1 >=10) {
		System.out.printf("%d는 짝수이고, 10보다 크거나 같은 수 이다.",num1);
	}
	
	if(true) {
		System.out.println("항상 실행되는 명령문");
	}
	
	if(false) {
		System.out.println("절대 실행 안되는 명령문");
	}
	
	if(num1 % 2 !=0) {
		System.out.printf("num1는 %d다%n",num1);
		System.out.printf("%d는 홀수다%n",num1);
	}
	*/
	
	System.out.println("한 문자를 입력하세요");
	int asciiCode=System.in.read();
	System.out.println("사용자가 입력한 아스키 코드값:"+asciiCode);
	System.out.println("사용자가 입력한 아스키 코드값:"+(char)asciiCode);
	
//	사용자가 입력한 문자가 숫자인지 아닌지를 판단하자.
//	1] 아스키 코드값을 알 때
	boolean isNumber=asciiCode>=48 && asciiCode<=57;// 0이 48이다.
	if(isNumber) System.out.println("입력한 문자는 숫자다.");
	if(!isNumber) System.out.println("입력한 문자는 숫자가 아니다.");
	
//	2] 아스키 코드값을 모를 때
	isNumber=asciiCode>='0' && asciiCode<='9';
	if(isNumber) System.out.println("입력한 문자는 숫자다.");
	if(!isNumber) System.out.println("입력한 문자는 숫자가 아니다.");
	
//	//3] quiz
	
	System.out.println("1. 한 문자를 입력하세요");
	asciiCode=System.in.read();
	isNumber = (asciiCode>=48 && asciiCode<=57) || 
						(asciiCode>=65 && asciiCode<=90) || 
						(asciiCode>=97 && asciiCode<=122);
	if(isNumber) System.out.println("알파벳 혹은 숫자.");
	if(!isNumber) System.out.println("기타");
	System.out.println("2. 한 문자를 입력하세요.");
	System.in.skip(2);
	char word = (char)System.in.read();
	System.out.println("입력한 문자:"+word);
		
	//4]quiz
	//방법1]if문 안의 if문으로 처리
	boolean isMultiple = word>='0' && word<='9';
	if(isMultiple && (word-'0') % 2==0)
		System.out.println("2의 배수입니다.");
	else
		System.out.println("2의 배수가 아닙니다.");
	//방법2] if문 안의 if문으로 처리
	if(isMultiple) {
		isMultiple = (word-'0')%2==0;
		if(isMultiple) System.out.println("2의 배수입니다.");
		if(!isMultiple) System.out.println("2의 배수가 아닙니다.");
	}
	}

}
