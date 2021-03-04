package method05;

import java.io.IOException;
import java.util.Scanner;

public class MethodExercise {
	//quiz 1
			/*
			 * 메소드 안에서 사용자로부터 숫자 두개(Scanner)와 산술연산자(read())를 입력받은 메소드로
			 * 산술 결과는 메소드 안에서 바로 출력하고 산술 연산자 기호를 반환하는 메소드를 정의 해라.
			 * 그리고 main메소드에서 호출하여 사용자가 입력한 연산자를 출력하여라.
			 * 매개 변수 X, 반환O 
			 */
	static char work1() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오. : ");
		int fnum=sc.nextInt();
		System.out.println("연산자 하나를 입력하시오. ");
		char op = (char)System.in.read();
		System.out.println("숫자를 입력하시오. : ");
		int snum=sc.nextInt();
		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d%n",fnum,op,snum,fnum+snum);
			break;
		case '-':
			System.out.printf("%d %c %d = %d%n",fnum,op,snum,fnum-snum);
			break;
		case '*':
			System.out.printf("%d %c %d = %d%n",fnum,op,snum,fnum*snum);
			break;
		case '/':
			System.out.printf("%d %c %d = %d%n",fnum,op,snum,fnum/snum);
			break;
		}
		return op;
	}
			
			//quiz 2
			/*
			 * 국영수 새 과목의 점수를 매개변수로 전달받아
			 * 평균을 구하고 학점을 출력하는 메소드를 정의해라.
			 * 그리고 main 메소드에서 호출하여 결과를 확인해라.
			 * 매개 변수 O , 반환 X
			 */
	static void work2(int kor, int eng, int math) {
		int total = kor+eng+math;
		switch(total/30) {
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
	}
			//quiz 3
			//quiz 2를 이용,,
//			int score[][] = {
//					{59,70,60},
//					{90,80,70},
//					{100,70,65},
//					{76,54,70},
//					{99,87,90}};
			
	
			//quiz 4
			/*
			이름과 나이를 매개변수에 받아서
			"이름은 ??? 나이는 ???"라고 출력하는 메서드
			*/
		static void work3(String name, int age) {
			System.out.printf("이름은 %s 나이는 %d%n",name,age);
		}
		
			//quiz 5
			/*
			 * 인원수를 매개변수로 전달받아 인원수만큼 나이를 사용자로부터 입력받고 
			 * 그 나이의 평균을 반환하는 메소드 정의 
			 */
		static int work4(int number) {
			int agesum=0;
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<number;i++) {
			System.out.println(i+1+"번째 나이를 입력하시오. ");
			agesum += sc.nextInt(); 
			}
			return agesum/number;
		}
			
			// quiz 6
			/*
			 * 여러개의 숫자를 입력받아서 그 중에 최대값을 구하는 메소드를 정의하자.
			 * 숫자의 개수 만큼 사용자로부터 숫자를 입력받아 최대값을 구하자.
			 */
		static int work5(int input) {
			int max=0;
			Scanner sc = new Scanner(System.in);
			int output[]=new int[input];
			for(int i=0;i<input;i++) {
				System.out.println(i+1+"번째 숫자를 입력하시오~ : ");
				output[i]=sc.nextInt();
				if(output[i]>max) max=output[i];
			}
			return max;
		}
	
	
	public static void main(String[] args) throws IOException {
//		System.out.println("연산자는 : "+work1());
//		work2(100,90,80);
//		
//		int score[][] = {
//				{59,70,60},
//				{90,80,70},
//				{100,70,65},
//				{76,54,70},
//				{99,87,90}};
//		for(int i=0;i<score.length;i++) {
//			System.out.println(i+1+"번째 학생의 성적 : ");
//				work2(score[i][0],score[i][1],score[i][2]);
//		}
//		work3("박대민",28);
//		System.out.println("나이의 평균은 : "+work4(3));
		System.out.println(work5(3));
		
	}// main
}//class
