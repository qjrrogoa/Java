package constructor15;

public class Constructor02 {

	public static void main(String[] args) {
		//기본 생성자로 객체 생성]
		Person person1 = new Person();
		System.out.println("[초기화용 메소드 initialize() 호출 전]");
		person1.print();
		System.out.println("[초기화용 메소드 initialize() 호출 후]");
		person1.initialaize("가길동",20,"가산동");
		person1.print();
		
		System.out.println("[이름만 전달]");
		Person person2 = new Person("나길동");
		person2.print();
		
		System.out.println("[이름, 나이 전달]");
		Person person3 = new Person("다길동",30);
		person3.print();
		
		System.out.println("[이름, 나이, 주소]");
		Person person4 = new Person("라길동",40,"청담동");
		person4.print();
		
		
	}/////main
}////class

//Math ma = new Math();   메소드가 private
//Calendar cal = new Calendar(); 클래스가 private