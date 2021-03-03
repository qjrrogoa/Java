package controlstatement03;

import java.io.IOException;
import java.util.Scanner;

public class DoWhileStatement {

	public static void main(String[] args) throws IOException {
	int sum=0, i=1;
	do {
		sum+=i;
		i++;
	}while(i<=10);
	System.out.println(sum);
	/*
	 * 무조건 1명의 점수를 입력받아 성적처리
	 * 그리고 더 입력 받고 싶으면 아무키나 누르고
	 * 종료하고 싶으면 'X', 'x'
	 */
	Scanner sc = new Scanner(System.in);
	int kor,eng,math,exitCode;
//	do {
//		//점수 입력 부분 
//		System.out.println("국어 점수 입력 : ");
//		kor = sc.nextInt();
//		System.out.println("영어 점수 입력 : ");
//		eng = sc.nextInt();
//		System.out.println("수학 점수 입력 : ");
//		math = sc.nextInt();
//		// 학점 즉 결과 출력
//		switch((kor+eng+math)/30) {
//		case 10:
//		case 9:
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7:
//			System.out.println("C학점");
//			break;
//		case 6:	
//			System.out.println("D학점");
//			break;
//		default:
//			System.out.println("F학점");
//		}
//		//추가 입력여부 확인하기
//		System.out.println("계속 입력하시려면 아무키나 \r\n종료 하려면 'X','x를 누르세요");
//		exitCode=System.in.read();
//	} while(!(exitCode=='X' || exitCode=='x'));
	// 위의 do~while문을 while문으로 변경]
	
	while(true) {
		//점수 입력 부분 
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		math = sc.nextInt();
		// 학점 즉 결과 출력
		switch((kor+eng+math)/30) {
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
		//추가 입력여부 확인하기
		System.out.println("계속 입력하시려면 아무키나 \r\n종료 하려면 'X','x를 누르세요");
		exitCode=System.in.read();
		if(exitCode=='X' || exitCode=='x') break;
	}///while
	
	
	System.out.println("프로그램 끝. 수고 하셨습니다.");
	}/////main
}/////class
