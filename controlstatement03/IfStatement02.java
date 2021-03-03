package controlstatement03;

import java.io.IOException;

public class IfStatement02 {

	public static void main(String[] args) throws IOException {

	int num1=100;
	//조건식 2번 실행
	System.out.println("[if문 형식 첫번째로 짝/홀수 판단]");
	if(num1 % 2 ==0) System.out.println("짝수");
	if(num1 % 2 !=0) System.out.println("홀수");
	
	//조건식 1번 실행
	System.out.println("[if문 형식 번째로 짝/홀수 판단]");
	if(num1 % 2 ==0) {
		System.out.println("짝수");
	}
	else {
		System.out.println("홀수");
	}
	
	System.out.println("[삼항 연산자로 짝/홀수 판단]");
	String strResult = (num1 % 2 == 0) ? "짝수" : "홀수" ;
	System.out.println(strResult);
	
	System.out.println(num1 % 2 == 0 ? "짝수" : "홀수");
	
	System.out.println("[짝/홀수 판단 후 짝수인 경우 100 이상인지 판단-if~else]");
	if(num1 % 2 ==0) {
		if(num1 >= 100) System.out.println("짝수이면서 100이상");
		else System.out.println("짝수이면서 100미만");
	}
	System.out.println("[짝/홀수 판단 후 짝수인 경우 100 이상인지 판단-삼항 연산자]");
	System.out.println(num1 % 2 == 0 ? num1>=100 ? "짝수이면서 100이상" : "짝수이면서 100미만" :"");

//	if(num1 % 2 !=0) //{
//		System.out.println("num1은 "+num1);
//		System.out.println(num1+"은 홀수");//if문과 무관
//	//}
//		//아래 else는 짝을 이루는 if문이 없다.
//	else {
//		System.out.println(num1+"은 짝수");
//	}
		System.out.println("한 문자를 입력하세요.");
		int ascii = System.in.read();
		System.out.println("[if~else문 사용]");
		boolean isNumber = ascii >= 48 && ascii <= 57;
		if(isNumber) {
			System.out.println("숫자다.");
		}
		else System.out.println("숫자가 아니다.");
		
		System.out.println("[삼항 연산자 사용]");
		System.out.println(ascii >= 48 && ascii <= 57?"숫자다." :"숫자가 아니다.");
		
		System.in.skip(2);
		System.out.println("다시 한 문자를 입력하세요.");
		char word = (char)System.in.read();
		System.out.println("[if~else문 사용]");
      // 내가 푼거 
		if(word>='0'&&word<='9') {
			if((word-'0') % 2 == 0 ) System.out.println("2의 배수");
			else System.out.println("2의 배수가 아니다.");
		}
		if(word>='a'&&word<='z' || word>='A'&&word<='Z') {
			if(word>='A'&&word<='Z') System.out.println("대문자");
			else System.out.println("소문자");
		}
		//선생님 풀이 
		isNumber= word>='0' && word<='9';
		if(isNumber) {
			if((word-'0')%2==0) System.out.println("2의 배수");
			else System.out.println("2의 배수가 아님");
		}
		else {
			if(word>='A'&&word<='Z') System.out.println("대문자");
			else System.out.println("소문자");
		}
		System.out.println("[삼항 연산자 사용]");
		System.out.println(isNumber ? (word-'0')%2==0 ? "2의 배수" : "2의 배수가 아님" : word>='A'&&word<='Z' ? "대문자" :"소문자");

	}
}
