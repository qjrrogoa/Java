package constructor15;

class Saram{ ///초기화용 메소드로 멤버변수 초기화
	String name;
	String lastJumin;
	
	//멤버변수 초기화용 메소드]
	void initialize(String name,String lastJumin) {
		this.name=name;
		this.lastJumin=lastJumin;
	}//////initialize
	
	//프린트
	void print() {
		System.out.println(String.format("%s는 %s입니다.",
				name,
				lastJumin.charAt(0)=='1'?"남자":lastJumin.charAt(0)=='2'?"여자":"미정"
				));
	}//////print
	
}//////Saram

class Saram2{//생성자로 멤버변수 초기화
	String name;
	String lastJumin;
	//[기본 생성자]
	public Saram2() {
		name = "미상";
		lastJumin="3456789";
		System.out.println("기본(디폴트 생성자)생성자");
	}/////////Saram2
	
	//[인자 생성자]
	public Saram2(String name) {
		this.name=name;
		lastJumin="1234567";
		System.out.println("인자 생성자(String)");
	}
	
	public Saram2(String name,String lastJumin) {
		this.name=name;
		this.lastJumin=lastJumin;
		System.out.println("인자 생성자(String.String)");

	}
	
	void print() {
		System.out.println(String.format("%s는 %s입니다.",
				name,
				lastJumin.charAt(0)=='1'?"남자":lastJumin.charAt(0)=='2'?"여자":"미정"
				));
	}//////print
	
}/////////

public class Constructor01 {

	public static void main(String[] args) {
		//Saram 인스턴스화/객체화/메모리생성]
		Saram saram = new Saram();
		//초기화용 메소드 미 호출시] -NullPointExecption발생
		//saram.print();
		
		//초기화용 메소드 호출시]
		saram.initialize("가길동","1234567");
		saram.print();
		
		//기본 생성자로 객체 생성]
		Saram2 saram2_1 = new Saram2();
		saram2_1.print();
		
		//인자 생성자로 객체 생성]
		Saram2 saram2_2 = new Saram2("나길동");
		saram2_2.print();
		
		Saram2 saram2_3 = new Saram2("다길동","1234");
		saram2_3.print();
	}/////main
}/////class
