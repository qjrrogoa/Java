package encapsulation13;

public class EncapsulationDTO {
	//[멤버변수]
	private String name; //예금주
	private String accountNo; // 계좌번호
	private int balance; // 잔액
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String n) {
		name = n;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
