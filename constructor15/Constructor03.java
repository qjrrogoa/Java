package constructor15;

class Point{
	//[멤버 변수]
	private int x,y;
	//[기본 생성자]
	public Point() {
		//this();//[x]Recursive발생;
		/*
		x=1;
		y=1;
		*/
		this(1,1);
		System.out.println("기본 생성자");
		//this(); 첫번째 문장에 나와야한다..
	}
	//[인자 생성자]
	public Point(int x) {
		/*
		this.x=x;
		y=1;
		*/
		this(x,1);
		System.out.println("인자 생성자 : x ");
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("인자 생성자 : x,y");
	}
	
	void print() {
		System.out.println(String.format("X좌표:%d,Y좌표:%d",x,y));
	}
}

	//[멤버 메소드]
	
public class Constructor03 {

	public static void main(String[] args) {
		//[기본 생성자로 객체 생성]
		Point point1 = new Point();
		point1.print();
		
		Point point2 = new Point(10);
		point2.print();
		
		Point point3 = new Point(10,20);
		point3.print();
	}////main
}///class
