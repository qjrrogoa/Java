package method05;

import java.io.IOException;
import java.util.Scanner;

public class MethodShape02 {

	//[1] 메소드 정의 
	static int noParamYesReturn() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		// return;//[x]
		return sum;
		//System.out.println("return문 이후");
	}
	/*
	 * 사용자로부터 국영수 점수를 입력받아 평균을 구해학점을 반환하는 메소드 정의
	 * 예] "A학점"
	 */
	static String getGrade() {
		//점수 입력받기 위한 클래스
		Scanner sc = new Scanner(System.in);
		//과목 타이틀 출력용 
		String subjects[]= {"국어","영어","수학"};
		//점수 저장용
		int jumsu[]=new int[3];
		//총합 저장용]
		int total=0;
		//사용자 입력받기
		for(int i=0;i<jumsu.length;i++) {
			System.out.println(subjects[i]+" 점수 입력 : ");
			jumsu[i]=sc.nextInt();
			total+=jumsu[i];
		}
		//방법1] 직접 return, breakans qnfvlfdy
		/*
		switch(total/30) {
		case 10:
		case 9:
			return "A학점";
		case 8:
			return "B학점";
		case 7:
			return "C학점";
		case 6:
			return "D학점";
		default :
			return "F학점";
		}
		*/
		//방법2]
		String rt_value;
		switch(total/30) {
		case 10:
		case 9:
			rt_value= "A학점"; 
			break;
		case 8:
			rt_value= "B학점"; 
			break;
		case 7:
			rt_value= "C학점"; 
			break;
		case 6:
			rt_value= "D학점"; 
			break;
		default :
			rt_value= "F학점"; 
			break;
		}
		return rt_value;
	}
	/*
	 * 메소드 안에서 사용자로부터 숫자 두개(Scanner)와 산술연산자(read())를 입력받은 메소드로
	 * 산술 결과는 메소드 안에서 바로 출력하고 산술 연산자 기호를 반환하는 메소드를 정의 해라.
	 * 그리고 main메소드에서 호출하여 사용자가 입력한 연산자를 출력하여라.
	 */
	static char getOperator() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하시오 : ");
		int anum=sc.nextInt();
		System.out.println("기호를 입력하시오 : ");
		char bchar=(char)System.in.read();
		System.out.println("숫자 하나를 입력하시오 : ");
		int cnum=sc.nextInt();
		String Value;
		switch(bchar) {
		case '+':
		System.out.printf("%d %s %d = %d%n",anum,bchar,cnum,anum+cnum);
		break;
		case '-':
			System.out.printf("%d %s %d = %d%n",anum,bchar,cnum,anum-cnum);
			break;
		case '*':
			System.out.printf("%d %s %d = %d%n",anum,bchar,cnum,anum*cnum);
			break;
		case '/':
			System.out.printf("%d %s %d = %.2f%n",anum,bchar,cnum,anum/cnum);
			break;
		}
		return bchar;
	}
	public static void main(String[] args) throws IOException {
	//[2] 메소드 호출	
	//방법1] 반환값 변수에 저장
	int value=noParamYesReturn();
	System.out.println("1부터 10까지 누적 합 : "+value);
	System.out.println("1부터 10까지 누적 합 : "+noParamYesReturn());
	// System.out.println("당신의 학점은 : "+getGrade());
	System.out.println("입력한 연산자는 "+getOperator());
	}///main
}////class
