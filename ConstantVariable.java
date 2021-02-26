package datatype01;

public class ConstantVariable {

	//final double PI; [x]
	static final double PI=3.14;
	static final int SCISSORS=1;
	static final int ROCK=2;
	static final int PAPER=3;
	public static void main(String[] args) {
	final String NICKNAME;
	NICKNAME = "한소인";
	System.out.println(NICKNAME);
	
	int computer =1, user=2;
	System.out.println("컴퓨터 LOSE : 가독성이 낮다");
	
	computer = SCISSORS;
	user=ROCK;
	System.out.println("컴퓨터 LOSE :가독성이 높다");
	
	}

}
