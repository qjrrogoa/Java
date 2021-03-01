package operator02;

public class ParkDaeMin0301 {

	public static void main(String[] args) {
		String NAME1="HONG", NAME2="KIM", NAME3="PARK";
		int KOR1=98, ENG1=99, MATH1=67;
		int KOR2=99, ENG2=99, MATH2=99;
		int KOR3=56, ENG3=78, MATH3=45;
		int TOTAL1=KOR1+ENG1+MATH1;
		int TOTAL2=KOR2+ENG2+MATH2;
		int TOTAL3=KOR3+ENG3+MATH3;
		double AVG1=(KOR1+ENG1+MATH1)/3.0;
		double AVG2=(KOR2+ENG2+MATH2)/3.0;
		double AVG3=(KOR3+ENG3+MATH3)/3.0; 
		System.out.println("===================================");
		System.out.printf("%-5s %-4s %-4s %-5s %-6s %s%n","NAME","KOR","ENG","MATH","TOTAL","AVG");
		System.out.println("===================================");
		System.out.printf("%-5s %-4s %-4s %-5s %-6s %.2f%n",NAME1,KOR1,ENG1,MATH1,TOTAL1,AVG1);
		System.out.printf("%-5s %-4s %-4s %-5s %-6s %.2f%n",NAME2,KOR2,ENG2,MATH2,TOTAL2,AVG2);
		System.out.printf("%-5s %-4s %-4s %-5s %-6s %.2f%n",NAME3,KOR3,ENG3,MATH3,TOTAL3,AVG3);
		System.out.println("===================================");
	}

}
