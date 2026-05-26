package bank;

public class Shinhan extends Bank{
	@Override
	//입금
	public void deposit(int money) {
		money /= 2;
		super.deposit(money);
	}
}
