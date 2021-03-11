package constructor15;

public class Person {
	//[멤버변수]
	String name;
	int age;
	String addr;
	
	//[생성자]
	//private Person() {} //다른 클래스에서 인스턴스화 불가하도록 막는다.
	//기본 생성자] 
	public Person() {
		/*
		name="미상";
		age=1;
		addr = "부모님 주소";
		*/
		this("미상",1,"부모님 주소");
		System.out.println("기본 생성자");
	}///////
	
	public Person(String name) {
		/*this.name=name;
		age=1;
		addr = "부모님 주소";*/
		this(name,1,"부모님 주소");
		System.out.println("인자 생성자 : name");
	}///////
	
	public Person(String name,int age) {
		/*this.name=name;
		this.age=age;
		addr = "부모님 주소";*/
		this(name,age,"부모님 주소");
		System.out.println("인자 생성자 : name, age");
	}///////
	
	public Person(String name,int age, String addr) {
		this.name=name;
		this.age=age;
		this.addr = addr;
		System.out.println("인자 생성자 : name, age, addr");
	}///////
	
	
	//[멤버 메소드]
	//멤버 변수 초기화용 메소드]
	void initialaize(String name,int age,String addr) {
		this.name=name;
		this.age=age;
		this.addr=addr;
	}/////////initialaize
	
	//정보출력용 메소드]
	void print() {
		System.out.println(String.format("[%s님의 정보]%n나이:%d%n사는 곳:%s%n",
				name,age,addr));
		
	}
	
}/////////Person
