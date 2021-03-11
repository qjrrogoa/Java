package encapsulation13;

public class EncapsulationApp {
/*
 캡슐화 (은닉화)
 - 관련있는 데이터를 하나로 묶는 것
 - 멤버변수에 외부에서 접근 못하도록 막는것  
 
 단, 메소드를 통해서 멤버변수의 값을 읽거나(get) 설정(set)하도록 한다.
 */
	public static void main(String[] args) {
		EncapsulationDAO cap = new EncapsulationDAO();
		//데이터 초기화
		cap.initialize("가길동","123-567", 1000);
		//통장 정리]
		cap.print();
		//출금]
		cap.withDraw(1500);
		cap.withDraw(500);
		//입금]
		cap.deposit(10000);
		cap.print();

	}////main
}/////class
