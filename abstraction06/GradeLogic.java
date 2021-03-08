package abstraction06;

import java.util.Scanner;

/*
 * 저장된 성적을 처리하는 로직을 추상화 하자.
 * 멤버변수]:학생수,
 * 		GradeRecord 타입
 * 		
 * 멤버메소드] : 
 * 			1] 학생수를 설정하는 메소드
 *  		2] 점수를 입력받고 총점 및 평균을 구하는 메소드 
 *   		3] 등수를 구하는 메소드 
 *    		4] 결과를 출력하는 메소드 
 */

// 1] 학생수를 설정하는 메소드
public class GradeLogic {
	//[멤버 변수]
	int numberOfstudents; // 학생수 저장용]
	GradeRecord records[];
	String titles[]= {"국어","영어","수학"};
	Scanner sc = new Scanner(System.in);
	//[멤버 메소드]
	void setNumberOfStudents() {
		System.out.println("학생수를 입력하세요 : ");
		numberOfstudents = sc.nextInt();
		records = new GradeRecord [numberOfstudents];
		for(int i=0;i<records.length;i++) {
			records[i]=new GradeRecord();
		}
		//스트림에 있는 엔터값 읽어서 버리기
		sc.nextLine();
	}////setNumberOfStudents
	
	/*
	 * 2] 이름 및 점수를 입력받고 총점 및 평균을 구하는 메소드 
	 */
	void setNameNJumsu() {
		//학생수 만큼 이름 및 국영수 점수 입력 받기]
		for(int i=0;i<records.length;i++) {
			System.out.printf("[%d번째 학생]%n",i+1);
			//i번째 학생의 이름 입력 받기
			System.out.println("이름 입력 : ");
			records[i].name = sc.nextLine();
			//i번째 학생의 점수를 입력 받기.
			for(int j=0;j<GradeRecord.SUBJECTS;j++){
				System.out.println(titles[j]+"점수 입력 : ");
				records[i].jumsu[j]=sc.nextInt();
				//i번째 학생의 점수 누적
				records[i].total+=records[i].jumsu[j];
			}
			records[i].avg=(double)records[i].total/GradeRecord.SUBJECTS;
			//스트림에 있는 엔터값 읽어서 버리기
			sc.nextLine();
		}
	}//setNameNJumsu

	/*
	 * 3] 등수를 구하는 메소드 
	 */
	
	void setRank() {
		for(int i=0;i<records.length-1;i++) {
			for(int j=i+1;j<records.length;j++) {
				if(records[i].avg<records[j].avg)
					records[i].rank++;
				else if(records[i].avg>records[j].avg)
					records[j].rank++;
			}
		}
	}///setRank
	//문] 점수 순서로 출력
	void sort() {
		GradeRecord temp;
		for(int i=0;i<records.length-1;i++) {
			for(int j=i+1;j<records.length;j++) {
				if(records[i].rank>records[j].rank) {
					temp=records[j];
					records[j]=records[i];
					records[i]=temp;
				}
			}
		}
	}////////sort
	
	
	/*
	 * 4] 결과를 출력하는 메소드 
	 */
	void print() {
		//출력 전 정렬하자]
		sort();
		//학생수만큼 반복해서 출력]
		System.out.println("===========================================");
		System.out.printf("%-10s%-5s%-5s%-5s%-5s%-8s%s%n","NAME","KOR","ENG","MATH","SUM","AVG","RANK");
		System.out.println("===========================================");
		
		for(int i=0;i<records.length;i++) {
			//이름 출력]
			System.out.printf("%-10s",records[i].name);
			//국영수 출력
			for(int j=0;j<records.length;j++) {
				System.out.printf("%-5s",records[i].jumsu[j]);
			}
			//총점.평균.등수 출력]
			System.out.printf("%-5s%-8.2f%s%n",records[i].total,
					records[i].avg,
					records[i].rank);
		}
		System.out.println("===========================================");
	}
}///GradeLogic
