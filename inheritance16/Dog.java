package inheritance16;
//[Dog is a Animal 성립]
public class Dog extends Animal {
	//[멤버 변수]
	//[확장한 멤버]
	String dogKind;
	int year; //Dog에서 새롭게 추가한 멤버 변수
	
	//[기본 생성자]
	public Dog() {
		super(null,0,null);
	}
	
	//[인자 생성자]
	public Dog(String species, int year, String gender, String dogKind) {
		this.species = species;
		this.gender = gender;
		this.dogKind=dogKind;
		this.year=year; //Dog의 year 초기화
	}
	
	//[멤버 메소드]
	void bark() {
		System.out.println(year+"살인 "+dogKind+"가 짖다");
	}
	
	void printDog() {
		printAnimal();
		System.out.println(", 개 종류 : "+dogKind);
	}
	
	static void staticMethod() {
		
	}
}///////class
