package abstraction06;

/*
 * 1명 학생의
 * 이름/국영수점수/총점/평균/등수를 저장하는 클래스
 * 성적 정보를 저장하는 자룍조를 추상화하자]
 */

public class GradeRecord {
	//[멤버 상수]
	public static final int SUBJECTS=3;
	//[멤버 변수]
	String name; // 이름]
	int jumsu[] = new int[SUBJECTS]; //국영수 점수]
	int total; // 총점]
	double avg; // 평균]
	int rank = 1; // 등수]
	
}//////class
