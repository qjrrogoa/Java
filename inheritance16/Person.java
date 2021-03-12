package inheritance16;

public class Person /* extents Object */ {
	//[멤버 변수]
	String name;
	int age;
	String addr;
	
	// [기본 생성자]
	public Person(){
		//super(); // 부모 클래스(Object)의 기본 생성자 public Object(){}
		System.out.println("Person의 기본 생성자");
	}
	
	//[멤버 메소드]
	String getPerson() {
		return String.format("이름 : %s, 나이 : %s, 주소 : %s",name,age,addr);
	}
	void printPerson() {
		System.out.println(getPerson());
	}
}
