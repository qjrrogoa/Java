package polymorphism14;

import java.util.Date;

public class Overloading {
	// 메소드명, 매개변수 타입 갯수 순서 다 동일해서 안된다.
	//int noOverloading(String str,Date date) {return 0;}//[x]
	//float noOverloading(String str,Date date) {return 0;}//[x]
	
	//1]매개변수 타입이 다른 경우 - 양념의 종류가 다른 경우
	void paramTypeDiff(int param) {}
	void paramTypeDiff(float param) {}
	void paramTypeDiff(double param) {}
	
	//2]매개변수 갯수가 다른 경우 - 양념을 넣는 횟수가 다른 경우
	void paramCountDiff() {}
	void paramCountDiff(int param) {}
	void paramCountDiff(int param, int param2) {}
	void paramCountDiff(int param, int param2,int param3) {}
	
	//3]매개변수 타입이 같고 개수도 같지만 순서가 다른 경우
	//- 양념은 같은데 넣는 순서 다름.
	void paramOrderDiff(int arg1,float arg2, double arg3) {}
	void paramOrderDiff(float arg2,int arg1, double arg3) {}
	void paramOrderDiff(float arg2, double arg3,int arg1) {}
	
	/*
	 * 매개변수 갯수에 따라 따로 만들지 않고 하나로 만듬
	 * [매개변수 형식]
	 * 메서드명(자료형 ... 매개변수)
	/*
	 VarArgs기능 미 사용시 여러개 메소드 Overloading해야함
	 */
	
	/*
	static int getTotal(int param) {
		int sum=0;
		sum+=param;
		return sum;
	}
	static int getTotal(int param,int param2) {
		int sum=0;
		sum+=param+param2;
		return sum;
	}
	static int getTotal(int param,int param2,int param3) {
		int sum=0;
		sum+=param+param2+param3;
		return sum;
	}
	*/
	//VarArgs기능 사용
	static int getTotal(int ...param) {
		int sum=0;
		for(int i=0;i<param.length;i++) {
		sum+=param[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(getTotal(10));
		System.out.println(getTotal(10,20));
		System.out.println(getTotal(10,20,30));
	}////main
}/////class
