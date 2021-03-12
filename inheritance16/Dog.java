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
		// this(null,0,null,null); //[x] 동시 호출 불가
	}
	
	//[인자 생성자]
	public Dog(String species, int year, String gender, String dogKind) {
//		this.species = species;
//		this.gender = gender;
//		this.dogKind=dogKind;
//		//this.year=year; //Dog의 year 초기화
//		super.year=year;
		
		super(species,year,gender);
		this.dogKind=dogKind;
	}
	
	//[멤버 메소드]
	void bark() {
		System.out.println(super.year+"살인 "+dogKind+"가 짖다");
	}
	
	void printDog() {
		printAnimal();
		System.out.println(", 개 종류 : "+dogKind);
	}
	
	static void staticMethod() {
		//super [x] 인스턴스 메소드에서만 사용 가능
		//super() [x] 생성자 안에서만 사용 가능
	}
	
	int getSuperYear() {
		return super.year; //Animal의 year반환
	}
}///////class
