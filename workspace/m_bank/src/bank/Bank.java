package bank;

public class Bank {
	//은행이 3개이므로 부모 클래스 Bank 생성 및 부모 필드 선언
	private String name; //고객명
	private String account; //계좌 번호
	private String phone; //폰 번호 
	private String password; //비밀 번호
	private int money; //잔액 
	//기본 생성자 선언
	public Bank() {;}

	//매개변수 생성자 선언
	public Bank(String name, String account, String phone, String password, int money) {
		super();
		this.name = name;
		this.account = account;
		this.phone = phone;
		this.password = password;
		this.money = money;
	}
	//접근 제한자가 private이므로 메소드로만 접근하기 위해 setter와 getter todtjd
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	계좌번호 중복검사
	//자식에서 재정의할 수 없게 final static 붙이기.(재정의 되어서는 안될 중요한 메소드)
	//각 은행과 고객에 대한 배열, 총 고객에 대한 배열, 계좌 번호 매개변수로 checkAccount라는 메소드 생성.
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null; 
//이중 for문 사용. arrBank가 은행3사와 고객수를 담은 배열인데 계좌 중복은 공통적이므로 static을 붙였다.
//바깥 for문은 은행3사를 돌리는 for문이고,
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
//안쪽 for문은 은행사의 각 고객별 계좌가 equals라는 메소드를 통해 같은지 확인.
			for (j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].getAccount().equals(account)) {
					bank = arrBank[i][j];
					break;
//			만약 고객계좌가 랜덤함수에서 돌린 계좌와 일치하면 bank에 값 넣고 중단.
				}
			}
//			중복으로 인해 고객이 추가되지않으면 break.
			if (j != arCount[i]) {
				break;
			}
		}
        //bank값을 리턴
		return bank;
	}

//	핸드폰 번호 중복검사
//	또한 final static이 붙었다. 자식에서 재정의되면 안되는 메소드.
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
		Bank bank = null;

		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
			
			for (j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].getPhone().equals(phone)) {
					bank = arrBank[i][j];
					break;
//					
				}
			}

			if (j != arCount[i]) {
				break;
			}
		}

		return bank;
	}

//	로그인
	public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {
			if(user.password.equals(password)) {
				return user;
			}
		}
		
		return null;
	}

//	입금
	public void deposit(int money) {
		this.money += money;
	}

//	출금
	public void withdraw(int money) {
		this.money -= money;
	}

//	잔액 조회
	public int showBalance() {
		return money;
	}

}
