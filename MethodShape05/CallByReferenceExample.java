package method05;

public class CallByReferenceExample {

	static void setTotalNAerage(double scores[][]) {
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<3;j++) {
				scores[i][3]+=scores[i][j];
			}
			scores[i][4]=scores[i][3]/3.0;
		}
	}/////method
	
	static void print(double[][] scores) {
		String title[] = {"국어","영어","수학","총점","평균"};
		for(int i=0;i<scores.length;i++) {
			System.out.printf("[%d번째 학생 성적]",i+1);
			for(int j=0;j<scores[i].length;j++) {
				System.out.printf("%s:%.0f ",title[j],scores[i][j]);
			}
			System.out.println("");
		}
		
	}///print
	public static void main(String[] args) {
	double scores[][] = 
			{{100,100,100,0,0},
			{90,90,90,0,0},
			{95,95,95,0,0}};
	// 총점 및 평균을 설정하는 메소드 호출
	setTotalNAerage(scores);
	// 출력]
	print(scores);
	
	}///main
}//class
