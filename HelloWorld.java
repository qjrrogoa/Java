import java.lang.System;
import java.util.Date;

public class HelloWorld{

	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("한국");
		System.out.println("소프트웨어");
		System.out.println("인재개발원");
		//오늘 날짜 출력하기
		Date today = new Date();
		System.out.print("오늘은");
		System.out.print(today);
	}

}