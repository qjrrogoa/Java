package abstraction06;

public class GradeApp {

	public static void main(String[] args) {
		//1]GradeLogic 객체화
		//GradeLogic 인스턴스화
		//HEAP영역에 GradeLogic타입의 메모리 생성]
		GradeLogic logic =new GradeLogic();
		//2] 학생 수를 설정하는 메소드 호출 
		logic.setNumberOfStudents();
		//3] 이름 및 점수를 입력받고 총점 및 평균을 구하는 메소드 호출
		logic.setNameNJumsu();
		//4] 등수 정용 메소드 호출 
		logic.setRank();
		//5] 결과 출력용 메소드 호출 
		logic.print();
	}///////main
}////////class
