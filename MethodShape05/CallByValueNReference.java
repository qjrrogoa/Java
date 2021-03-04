package method05;

public class CallByValueNReference {

	//CallByValue 테스트용
	static void callByValue(int first,int second) {
		int temp = first;
		first = second;
		second = temp;
		System.out.printf("callByValue메소드 안]first:%d, second:%d%n",first,second);
		
	}//callbyvalue
	static void callByReference(int arr[]) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.printf("callByReference메소드 안]arr[0]:%d, arr[1]:%d%n",arr[0],arr[1]);
	}
	
	public static void main(String[] args) {
	//Call By Value 테스트
	int first = 1;
	int second = 10;
	System.out.printf("main메소드 안-callByValue호출 전]first:%d, second:%d%n",first,second);
	callByValue(first, second);
	System.out.printf("main메소드 안-callByValue호출 후]first:%d, second:%d%n",first,second);

	//Call By Reference 테스트
	int ref[] = new int[2];
	ref[0]=1;
	ref[1]=10;
	System.out.printf("main메소드 안-callByReference호출 전]ref[0]:%d, ref[1]:%d%n",ref[0],ref[1]);
	callByReference(ref);
	System.out.printf("main메소드 안-callByReference호출 후]ref[0]:%d, ref[1]:%d%n",ref[0],ref[1]);
	}///main
}//class
