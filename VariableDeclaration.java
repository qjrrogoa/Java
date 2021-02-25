package datatype01;

public class VariableDeclaration {

	public static void main(String[] args) {
		System.out.println("[변수 선언 방법 첫번째]");
		int num;
		// 지역변수는 초기화하지 않으면 컴파일 오류
		num=100;
		System.out.println(num);
		System.out.println("[변수 선언 방법 두번째]");
		int initNum=200;
		System.out.println(initNum);
		System.out.println("[변수 선언 방법 세번째 - 동시에 같은 타입의 변수 여러개 선언하기]");
		int fnum, snum=1000, tnum;
		fnum=snum;
		System.out.println("fnum="+fnum);
		tnum=500;
		fnum=snum+tnum;
		System.out.println("fnum="+fnum);

	}

}
