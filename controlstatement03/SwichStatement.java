package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class SwichStatement {

	public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
//	System.out.println("숫자를 입력하세요.");
//	int inputNumber=sc.nextInt();
//	System.out.println("입력한 숫자:"+inputNumber);
//	
//	System.out.println("[if문으로 나머지값 판단]");
//	int remain = inputNumber % 3;
//	if(remain==0) System.out.println("나머지가 0");
//	else if(remain==1) System.out.println("나머지가 1");
//	else System.out.println("나머지가 1");
//	
//	System.out.println("[swich문으로 나머지값 판단]");
//	switch(remain){
//		case 0:
//			System.out.println("나머지가 0");
//			break;
//			
//		case 1:
//			System.out.println("나머지가 1");
//			break;
//		
//		default:
//			System.out.println("나머지가 2");
//	}
//	//변수 넣기 
//	byte b=5;
//	switch(b) {//변수가 와도 됨
//	case 1:
//		System.out.println("b에 저장된 값 1");
//	case 2:
//		System.out.println("b에 저장된 값 2");
//	case 3:
//		System.out.println("b에 저장된 값 3");
//	case 5:
//		System.out.println("b에 저장된 값 5");
//	}
//	//char 넣기 
//	System.out.println("첫번째 숫자 입력");
//	int fnum=sc.nextInt();
//	System.out.println("연산자 기호 입력(+,-,*,/)");
//	char op = (char)System.in.read();
//	System.out.println("두번째 숫자 입력");
//	int snum=sc.nextInt();
//	System.out.printf("fnum:%d,snum:%s,op:%c%n",fnum,snum,op);
//	switch(op) {
//	case '+':
//		System.out.printf("%d + %d = %d%n",fnum,snum,fnum+snum);
//		break;
//		
//	case '-':
//		System.out.printf("%d - %d = %d%n",fnum,snum,fnum-snum);
//		break;
//	
//	case '*':
//		System.out.printf("%d * %d = %d%n",fnum,snum,fnum*snum);
//		break;
//		
//	case '/':
//		System.out.printf("%d / %d = %d%n",fnum,snum,fnum/snum);
//		break;
//
//	default:
//		System.out.printf("잘못된 연산기호 입니다. :%c%n",op);
//	}
//	//String 넣기
//	String subject="수학";
//	switch(subject) {
//	case "국어":
//		System.out.println("과목은 국어");
//		break;
//	case "수학":
//		System.out.println("과목은 수학");
//		break;
//	default:
//		System.out.println("개설되지 않은 과목");
//	}
//	switch(inputNumber) {
//	case 1:
//	case 2:
//	case 100:
//	case 200:
//		System.out.println("1이거나 2이거나 100이거나200중 하나");
//		break;
//	case 300:
//		System.out.println("inputNumber");
//	}
	
	System.out.println("국어 점수 입력");
	int kor=sc.nextInt();
	System.out.println("영어 점수 입력");
	int eng=sc.nextInt();
	System.out.println("수학 점수 입력");
	int math=sc.nextInt();
	int avg=(kor+eng+math)/3;
	switch(avg/10) {
	case 10:
	case 9:
		System.out.println("A학점");
		break;
	case 8:
		System.out.println("B학점");
		break;
	case 7:
		System.out.println("C학점");
		break;
	case 6:
		System.out.println("D학점");
		break;
	default:
		System.out.println("F학점");
		
	}
	
	}////main
}////class
