package polymorphism14;

class Super{}
class Normal extends Super{}

public class InstanceOfOP {

	public static void main(String[] args) {
		//1]두 클래스간 상속관계가 존재 하지 않을 때
		String string = new String("JAVA");
		StringBuffer buffer =new StringBuffer("JAVA");
		//string = (String)buffer; [x]
		//buffer = (StringBuffer)string; [x]
		System.out.println(string instanceof String?
				"string은 String 타입이다.":
					"string은 String 타입이 아니다."); //string이 String 타입이냐? true
		System.out.println(string instanceof Object?
				"string은 Object 타입이다.":
					"string은 Object 타입이 아니다."); 
		System.out.println(buffer instanceof StringBuffer);
		System.out.println(buffer instanceof Object);
		//상속관계가 없을 때 instanceOf연산자 사용시 컴파일 에러
		Object object =new Object();
		//String stringObj= (String)object;//[x] 실행시 에러
		System.out.println(object instanceof String); // false
		//instanceof연산자로 선 판단후 형변환]
		if(object instanceof String) {
			String stringObj= (String)object;
			System.out.println("형변환이 일어났어요");
		}
		object = new String();
		String stringObj= (String)object;
		
		
		Super s = new Super();
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Normal);
		
		s = new Normal();
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Normal);
		
		Normal n = (Normal)s;


		
	}//////main
}////class
