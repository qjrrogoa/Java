package method05;

public class MethodShape03 {
	//1] 메소드 정의 : start부터 end까지 누적합 구하는 메소드
	static void printSum(int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.printf("%d~%d까지의 누적합은 %d%n",1,10,sum);
	}//////
	/*
	 * 국영수 새 과목의 점수를 매개변수로 전달받아
	 * 평균을 구하고 학점을 출력하는 메소드를 정의해라.
	 * 그리고 main 메소드에서 호출하여 결과를 확인해라.
	 */
	static void printGrade(int kor,int eng,int math) {

		
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
	}
	/*
	이름과 나이를 매개변수에 받아서
	"이름은 ??? 나이는 ???"라고 출력하는 메서드
	*/
	static void name(String name,int age) {
	System.out.printf("이름은 %s 나이는 %d%n",name,age);
	}
	
	/* 
	 * 숫자 2개를 매개변수로 입력받아서 시작단과 끝단을 매개변수에 입력받아
	 * 구구단을 작성해라.
	 */
	static void multi(int start, int end) {
		for(int i=1;i<=end;i++) {
			for(int j=start;j<=end;j++) {
				System.out.printf("%d * %d = %-4d",j,i,i*j);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		//메소드 호출
		//매개변수에 값 전달 : 변수에 저장해서 전
		//방법1]
		int start=1, end=10;
		printSum(start,end);
		//방법2]
		printSum(1,10);
		printGrade(90,80,70);
		name("박대민",28);
		multi(2,2);
		
		int score[][] = {
				{59,70,60},
				{90,80,70},
				{100,70,65},
				{76,54,70},
				{99,87,90}};
		for(int i=0;i<score.length;i++) {
			System.out.println(i+1+"번째 학생의 성적 ");
			printGrade(score[i][0],score[i][1],score[i][2]);
		}
	}/////main
}////class
