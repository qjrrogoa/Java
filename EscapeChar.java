package datatype01;

public class EscapeChar {

	public static void main(String[] args) {
		System.out.println("Hit HomeRun");
		System.out.println("Hi\t HomeRun");
		//1] \n : 줄 바꿈 
		System.out.print("Welcome To Java\n");
		System.out.print("Hi Java");
		System.out.print("\nLet's Do it.Go Fighting!!");
		//2] \r : 뒤에 있는 애들 맨 앞으
		System.out.print("My Nickname is Superman\rXX");
		//3] \t : 키 만큼 띄어쓰기 기능
		System.out.print("국어\t영어\t수학");
		//4] \' : 자바에선 의미 없다!
		System.out.print("나의 닉네임은 '스마트 보이' 입니다.");
		System.out.print("나의 닉네임은 /'스마트 보이/' 입니다.");
		//5] \" 
		//System.out.print("나의 닉네임은 "스마트 보이" 입니다.");//[x]
		System.out.print("나의 닉네임은 \"스마트 보이\" 입니다.");//[o]
		//6] \\ : \사용하고 싶을 때
		
	}

}
