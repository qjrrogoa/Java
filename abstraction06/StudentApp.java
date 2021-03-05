package abstraction06;

/*
 * .java파일에 여러개의 class를 정의할때는
 * main 메소드가 있는 클래스에 public을 붙여라
 * 그 외 클래스는 public생략
 * 원칙은 .java 파일당 내가 정의한 클래스 하나 선언
 *
 */
class Student{
	//[멤버 변수]
	Person person;
	Person another = new Person(); //선언과 동시에 메모리 할당
	String stNumber;//학번 속성
	//[멤버 메소드]
	void study() {
		System.out.println(person.name+"가(이) 공부하다.");
	}
	void printStudent() {
		person.printPerson();
		System.out.println("학번:"+stNumber);
	}
}////class 
public class StudentApp {
	public static void main(String[] args) {
		//Student타입의 메모리 생성
		//Student타입의 객체화
		//Student타입 인스턴스화
		Student student1 = new Student();
		System.out.println("student1 : "+student1);
		//student1.printStudent();
		System.out.println("student1.person : "+student1.person);
		/*
		//해결방법1]Person타입의 메모리 생성해서 주소 대입
		student1.person = new Person();
		System.out.println("student1.person(주소 저장 후)"+student1.person);
		student1.printStudent();
		//초기화
		student1.person.name="가길동";
		student1.person.age=20;
		student1.person.weight=99;
		System.out.println("[Person초기화 후]");
		student1.printStudent();
		*/
		//해결방법2] another의 주소값을 person에 대입
		student1.person=student1.another;
		System.out.println("student1.person : "+student1.person);
		System.out.println("student1.another : "+student1.another);
		//초기화	
		student1.person.name="다길동";
		student1.another.age=100;
		student1.person.weight=50;
		student1.stNumber="2021학번";
		student1.printStudent();
	}///main
}////class
