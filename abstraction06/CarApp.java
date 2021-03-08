package abstraction06;
///자동차를 추상화하자
///자동차 설계도를 만들자 
///자동차 클래스를 만들자
class Car{
	//[멤버 상수]
	public static final String AUTO ="자동";
	public static final String MANUAL ="수동";
	//[멤버 변수]
	String carModel; /// 차량 모델
	int carYear; /// 차 연식
	String carGear = AUTO; /// 차량 기어
	Person owner; ///차량 소유주
	//[멤버 메소드]
	void drive() {
		System.out.println(owner.name+"가(이) "+carModel+"을(를) 운전한다.");
	}
	//프로그램 효율을 위한 멤버 메소드들]
	void initialize() {
		carModel="제네시스";
		carYear = 2021;
		owner = new Person();
		owner.name="가길동";
		owner.age=20;
		owner.weight=70;
	}
	//정보 출력용 메소드]
	void printCar() {
		System.out.println("[차량 정보]");
		System.out.println("모델명 : "+carModel);
		System.out.println("연식 : "+carYear);
		System.out.println("기어 : "+carGear);
		System.out.println("소유주 : ");
		owner.printPerson();
	}
}/////Car class
public class CarApp {

	public static void main(String[] args) {
		/*
		 * Car클래스(설계도)로
		 * Car타입의 메모리 생성(객체화/인스턴스화)
		 */
		Car car1 = new Car();
		System.out.println("[멤버 변수 초기화용 메소드(initialize) 호출 전");
		//car1.printCar(); [X] owner 초기화 안되서 오류난다.
		car1.initialize();
		System.out.println("[멤버 변수 초기화용 메소드(initialize) 호출 후");
		
		Car car2 = new Car();
		car2.carModel = "포르쉐";
		/*
		클래스의 멤버(변수,메소드,상수....)에
		static이 붙으면 
		클래스명.멤버로 접근 
		*/
		car2.carGear=Car.MANUAL;
		car2.carYear=2021;
		car2.owner= new Person();
		car2.owner.age=30;
		car2.owner.weight=60;
		car2.owner.name="박길동";
		car2.printCar();
		car2.drive();
		
		
	}/////main
}////class
