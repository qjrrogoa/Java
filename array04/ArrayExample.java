package array04;

import java.util.Scanner;

public class ArrayExample {

	public static final int SUBJECTS = 3;
	
	public static void main(String[] args) {
	/*
	 * [1] 학생수를 사용자로부터 입력받자
	 *  - Scanner 클래스 사용
	 * [2] 입력받은 학생 수 만큼 국영수 점수 및 총점을 저장할 수 있는 int형 배열을 선언
	 * [3] 학생 수 만큼 각 국영수 점수를 입력 받아 [2]에 저장
	 * [4] 총점 및 평균을 출력
	 */
		String subjects[]= {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		// 학생수를 사용자로부터 입력받자.
		System.out.println("학생 수를 입력하세요.");
		int numberOfstudents = sc.nextInt();
		// int형 배열 선언과 메모리 할당
		int students[][] = new int[numberOfstudents][SUBJECTS+1];
		// 국영수 점수를 입력받아 배열에 저장
		for(int i=0;i<students.length;i++) {
			//i번째 학생의 국영수 점수 입력받기.
			System.out.println(i+1+"번째 학생의 점수를 입력하세요");
			for(int j=0;j<SUBJECTS;j++) {
				System.out.println(subjects[j]+"점수를 입력하세요");
				//각 과목 점수 입력받기
				students[i][j]=sc.nextInt();
				//각 과목에 점수를 누적 
				students[i][SUBJECTS]+=students[i][j];
			}//안 for
		}//바깥 for
		//[4] 총점 및 평균을 출력
		for(int i=0;i<numberOfstudents;i++) {
			System.out.println("======================");
			System.out.println(i+1+"번째 학생 성적");
			//국영수 점수 총점 평균 출력 
			System.out.printf("국어:%d,영어:%d,수학:%d,총점:%d,평균%.2f%n",
			students[i][0],
			students[i][1],
			students[i][2],
			students[i][3],
			(double)students[i][3]/SUBJECTS);
		}
		
		
		
		

	}/////main
}/////class
