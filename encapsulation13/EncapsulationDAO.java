package encapsulation13;
/*
 * EncapsulationDTO에 저장된 데이터를 가공 
 * 처리하는 로직을 갖는 클래스
 * 
 * 초기화 로직
 * 입금하는 로직
 * 인출하는 로직
 * 통장 정보를 출력하는 로직 
 * 
 */
public class EncapsulationDAO {
	//[멤버 변수]
	private EncapsulationDTO capsule = new EncapsulationDTO();
	//[멤버 메소드]
	// 초기화
	public void initialize(String name,String accountNo, int balance) {
		capsule.setName(name);
		capsule.setAccountNo(accountNo);
		capsule.setBalance(balance);
	}////////initialize
	
	// 입금하는 로직
	public void deposit(int money) {
		capsule.setBalance(capsule.getBalance()+money);
		System.out.println(money+"원이 입금 되었습니다.");
	}//////deposit
	
	// 인출하는 로직
	public void withDraw(int money) {
		if(money>capsule.getBalance()) {
			System.out.println("잔액이 부족해요");
			return;
		}
		capsule.setBalance(capsule.getBalance()-money);
		System.out.println(money+"원이 출금 되었습니다.");
	}////withDraw
	
	//통장 정보를 출력하는 로직
	
	public void print() {
		System.out.println(
				String.format("[%s님의 계좌정보]%n계좌번호:%s%n잔액:%d",
						capsule.getName(),
						capsule.getAccountNo(),
						capsule.getBalance()
						));
	}/////print
	
	
}
