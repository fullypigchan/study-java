package bank;

public class Kakao extends Bank{
	@Override
	public int showBalance() {
//		잔액 조회 시, 재산 반토막  get이 내꺼 set이 반영된거
		this.setMoney(this.getMoney() / 2);
		return super.showBalance();
	}
}
