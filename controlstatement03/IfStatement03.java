package controlstatement03;

import java.io.IOException;

public class IfStatement03 {

	public static void main(String[] args) throws IOException {
	
	int kor=99, eng=80, math=89;
	double avg = (kor+eng+math)/3.0;
	
	if(avg>=90)System.out.println("A학점");
	else if(avg>=80)System.out.println("B학점");
	else if(avg>=70)System.out.println("C학점");
	else if(avg>=60)System.out.println("D학점");
	else System.out.println("F학점");
	 //1번 퀴즈 
	System.out.println("한 문자를 입력하세요.");
	char word = (char)System.in.read();
	boolean isNumber = word >= '0' && word <='9';
	if(isNumber) {
		if((word-'0')%2==0) System.out.println("2의 배수");
		else if ((word-'0')%2 !=0) System.out.println("2의 배수가 아니다.");
	}
		else if(word>='A'&&word<='Z') System.out.println("대문자");
		else if(word>='a'&&word<='z') System.out.println("소문자");
	// 2번 퀴즈
	if(word>='0' && word<='9') System.out.println("숫자");
	else if(word>='a' && word<='z' || word>='A' && word<='Z') System.out.println("알파벳");
	else System.out.println("기타");

	// 3번 퀴즈
	int num1 =10, num2=287, num3=100, max;
	max=num1;
	if(max<num2) max=num2;
	if(max<num3) max=num3;
	System.out.println(max);
	
	}/////main
}////class
