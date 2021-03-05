package abstraction06;

// 사람을 추상화 해보자
// 즉 사람의 설계도를 만들어 보자,,
// 상수나 멤버변수
public class Person {
	//[멤버 변수 선언]
	//1] 사람이라는 객체가 갖고 있는 속성 : 멤버 변수
	//has a 관계
	public String name;//이름 속성-public 접근지정자 사용
	int age = 1;//생략형 접근 지정자 사용. 선언과 동시에 초기화
	double weight;// "
	//[멤버 메소드 정의]
	// 사람이라는 객체가 갖고 있는 행동
	void sleep() {
		System.out.println(name+"가(이) 자고 있다.");
	}
	void eat() {
		System.out.printf("나이가 %d살인 %s가 먹다.\n그래서 몸무게가 %.2fKG이다.\n",
				age,name,weight);
	}
	//프로그램 효율성을 위한 메소드들]
	String getPerson() {
		return "["+name+"의 정보]\r\n의 나이 : "+age+"\r\n몸무게 : "+weight;
	}
	void printPerson() {
		System.out.println(getPerson());
	}
}////person
