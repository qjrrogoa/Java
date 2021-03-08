package globalnlocal08;

public class GlobalNLocalVar {
	//[멤버 변수]
	private int mNoInit; // 자동으로 초기화 되있음. 0으로 
	int mInit=100; // 선언과 동시에 초기화. 100으로
	int mArray[] = new int[3]; // 선언과 동시에 메모리 할당 및 주소로 초기화
	
	//[멤버 메소드]
	int getToTal(int start,int end) {
		int sum=0; // 선언과 동시에 초기화 해야한다.
		System.out.println(sum);
		for(int i=start;i<=end;i++)
			sum+=i;
		System.out.printf("%d부터 %d까지 누적 합 : %d%n",start,end,sum);
		if(sum %2==0) {
			String strResult="총합은 짝수";
			System.out.println(strResult);
			
		}
		else {
			String strResult = "총합은 음수";
			System.out.println(strResult);
		}
		System.out.println("멤버변수 : mNoInit = "+mNoInit);
		return sum;
	}////getToTal,
	
	public static void main(String[] args) {
		GlobalNLocalVar gnv = new GlobalNLocalVar();
		System.out.println("멤버변수 : mNoInit"+gnv.mNoInit);
		System.out.println("멤버변수 : mInit"+gnv.mInit);
		System.out.println("멤버변수 : mArray[]"+gnv.mArray);
		int total = gnv.getToTal(1, 10);
		System.out.println("[클래스의 멤버인 배열 : 초기화 안함]");
		for(int i=0;i<gnv.mArray.length;i++) 
			System.out.printf("%d번방 : %d%n",i,gnv.mArray[i]);
		int lArray[] = new int[3]; //로컬 배
		System.out.println("[지역에서 선언한 배열 : 초기화 안함]");
		for(int i=0;i<lArray.length;i++) 
			System.out.printf("%d번방 : %d%n",i,lArray[i]);

	}/////main
}//////class
