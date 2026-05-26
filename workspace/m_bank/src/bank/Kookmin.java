package bank;

public class Kookmin extends Bank {
	@Override
	//출금하다
	public void withdraw(int money) {
		money *= 1.5;
		super.withdraw(money);
	}
}
