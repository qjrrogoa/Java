package array04;

import java.util.Scanner;

public class ArrayType01 {

	public static void main(String[] args) {
	
	//1차원 배열 
	//1] 배열 선언 
	int [] arrNum;
	//2] 메모리 할당 
	arrNum = new int[5];

	System.out.println("[배열 초기화 전]");
	for(int i=0;i<5;i++) {
		System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
	}
	//3] 배열 초기화
	arrNum[0]=10;
	arrNum[1]=20;
	arrNum[2]=30;
	arrNum[4]=50;
	
	System.out.println("[배열 초기화 후]");
	for(int i=0;i<5;i++) {
		System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
	}
	//arrNum[5]=60; [x] 에러 남
	//4] 출력
	System.out.println("배열의 크기"+arrNum.length);
	for(int i = 0; i < arrNum.length;i++) {
		if(arrNum.length-1 == i)
			System.out.printf("arrNum[%d]:%d%n",i,arrNum[i]);
		else System.out.printf("arrNum[%d]:%d,",i,arrNum[i]);
	}
	//5] 배열선언과 동시에 메모리 할당
	String strArray[] = new String[3];
	System.out.println(strArray);
	System.out.println("[배열 초기화 전]");
	for(int i = 0 ; i < strArray.length;i++) {
		System.out.printf("%d인덱스 방 : %s%n",i,strArray[i]);
	}
	//String형 배열 초기화]
	strArray[1]= "소프트웨어";
	strArray[0]= "한국 ";
	strArray[2]= "인재개발원";
	
	System.out.println("[배열 초기화 후]");
	for(int i = 0 ; i < strArray.length;i++) {
		System.out.printf("%d인덱스 방 : %s%n",i,strArray[i]);
	}
	//6] 배열선언과 동시에 초기화
	double dbArr[] = {100,3.14,99.9}; // {}를 "배열 초기화자"라고 한다.
	// double dbArr[] = new double[]{100,3.14,99.9};
	for(int i=0;i<dbArr.length;i++) {
		System.out.printf("%d인덱스 방 : %.2f%n",i,dbArr[i]);
	}
	boolean blArr[] = {true,3>2,3>2&&5<3,false};
	for(int i=0;i<blArr.length;i++) {
		System.out.printf("%d인덱스 방 : %b%n",i,blArr[i]);
	}
//	Scanner sc = new Scanner(System.in);
//	System.out.println("학생수를 입력하세요.");
//	int numberOfstudents=sc.nextInt();
//	System.out.println("입력 받은 학생수 : "+numberOfstudents);
//	sc.nextLine();//엔터값 읽어서 사용 안함,	
//	String names[] = new String[numberOfstudents];
//	for(int i=0;i<names.length;i++) {
//		System.out.printf("%d번째 학생의 이름을 입력하세요: %n",i+1);
//		names[i] = sc.nextLine();
//	}
//	for(int i=9;i<names.length;i++) {
//		System.out.printf("%d번째 학생의 이름은 %s입니다.%n",i+1,names[i]);
//	}
	//quiz 1
	int jumsu[]= {86,80,95,67,90};
	int sum=0;// 누적합 저장
	for(int i=0;i<jumsu.length;i++) {
		sum+=jumsu[i];
	}
	System.out.printf("점수의 총합은 %d, 평균은 %.2f이다.%n",sum,(double)sum/jumsu.length);
	// quiz 2
	// 최대값을 구하여라.
	int max=jumsu[0];
	for(int i=0;i<jumsu.length;i++) {
		if(max<=jumsu[i]) max=jumsu[i];
	}
	System.out.println(max);
	// quiz 3	// 일차원 배열을 크기 순서대로 재 배치 후 출력하자.

	for(int i=0;i<jumsu.length-1;i++) {
		for(int j=i+1;j<jumsu.length;j++) {
			if(jumsu[i]<jumsu[j]) {
			int a=0;
			a=jumsu[j];
			jumsu[j]=jumsu[i];
			jumsu[i]=a;
			}
		}
	}
	for(int i=0;i<jumsu.length;i++)
		System.out.println(jumsu[i]);

	//int jumsu[]= {86,80,95,67,90};
	// 80
	}/////main
}////class
