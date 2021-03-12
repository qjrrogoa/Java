package inheritance16;

//[Student is a Person 성립]
public class Student extends Person{
	
	//[멤버 변수]
	//이름과 나이와 주소는 상속받아서 재사용]
	//Student클래스에서 새롭게(확장)한 멤버변수
	String stNumber; // 학번

	//[기본생성자]
	public Student() {
		super();//Person의 기본 생성자
		System.out.println("Student의 기본 생성자");
	}
	//[인자생성자]
	public Student(String name, int age, String addr,String stNumber) {
		//super();  //  생략 가능
		this.stNumber = stNumber;
		this.addr = addr;
		this.age = age;
		this.name = name;
		System.out.println("Student의 인자 생성자");
	} ////////////Student
	
	//[멤버 메소드]
	//Person에서 정의한 메소드는 재사용
	//Student클래스에서 새롭게 추가한 메소드
	void study() {
		System.out.println(String.format("나이가 %d인 %s가 공부한다",age,name));
	}
	
	String getStudent() {
		return String.format("%s, 학번 : %s",getPerson(),stNumber);
	}
	
	void printStudent() {
		System.out.println(getStudent());
	}
	
}
