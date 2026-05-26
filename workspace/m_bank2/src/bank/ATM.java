package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//	화면
	public static void main(String[] args) {
		//신한,국민,카카오, 3개의 은행 고객들을 담아놓을 저장소
		//첫번째 행:신한은행 고객
		//두번째 행:국민은행 고객
		//세번째 행:카카오은행 고객
//		//은행별 최대 수용 고객수 100명
//		up casting
		Bank[][] arrBank = new Bank[3][100]; //행의 길이
		//은행수만큼 칸을 만들어서 배열을 선언한다.
		//가입한 고객 수를 담아놓을 배열이다.
		int[] arCount = new int[arrBank.length]; //arBank[i].length는 100
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		Scanner sc = new Scanner(System.in);

		int bankNumber = 0, choice = 0, myBankNumber = 0;
		String account = null, password = null, phone = null, name = null;
		Bank user = null;
		int money = 0, withdrawMoney = 0, temp = 0;
		Random random = new Random();
		int passwordCheck = 0, phoneCheck = 0;

		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
//		고객이 몇 번이나 서비스를 이용할지 알 수 없기 때문에 while문.
		while(true) {
			System.out.println(message);
			bankNumber = sc.nextInt();
			
			if(bankNumber == 4) {
				break;
			}
//			사용자가 입력한 은행 번호를 index로 활용하기 위해 1을 빼준다.
			bankNumber--;
			
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				
				if(choice == 6) {
					break;
				}
				
				switch(choice) {
				case 1: // 계좌 개설
					
//					규칙성이 없는 객체들을 배열에 담아서 다음과 같은 규칙성을 부여한다
//					0:신한은행 객체
//					1:국민은행 객체
//					2:카카오은행 객체
					Bank[] arBank = {new Shinhan(), new Kookmin(), new Kakao()};
					
					while(true) {
//						6자리 랜덤한 계좌번호 생성
						account = String.valueOf(random.nextInt(900000) + 100000);
//						맨 앞에 은행 고유 번호를 붙여준다.
						account = bankNumber + account;
						if(Bank.checkAccount(arrBank, arCount, account) == null) {
//					생성된 계좌번호가 중복이 없다면 while문 탈출
							break;
						}
					}
//					계좌번호가 정상적으로 생성되었다면,
//					이름(예금주)를 입력받는다.
					System.out.println(nameMessage);
					name = sc.next();
					
					while(true) {
						System.out.println(passwordMessage);
						password = sc.next();
//						flag
						passwordCheck = 0;
						
//						입력한 비밀번호가 네자리인지 먼저 검사
						if(password.length() == 4) {
							for (int i = 0; i < password.length(); i++) {
//								각각의 문자가 정수인지 검사한다.
								char c = password.charAt(i);
								if(c >= 48 && c <= 57) {
//								각 문자가 아스키코드의 정수 범위에 들어간다면,
//								flag변수를 1만큼 증가해준다.
									passwordCheck++;
								}
							}
						}
//						모든 문자가 검사에 통과 되었다면 flag 변수에 4가 담겨있다.
						if(passwordCheck == 4) {
//						더이상 입력받지 않고 while문을 탈출한다.
							break;
						}
					}
//					비밀번호를 정상적으로 입력했다면,
					while(true) {
						System.out.println(phoneMessage);
						phone = sc.next();
						phoneCheck = 0;
						
//						입력 받은 핸드폰 번호에서 -(하이푼)은 제거한다.
						phone = phone.replaceAll("-", "");
						
//						핸드폰 11자리 검사
						if(phone.length() == 11) {
//						11번 반복
							for (int i = 0; i < phone.length(); i++) {
								char c = phone.charAt(i);
								if(c >= 48 && c <= 57) {
									phoneCheck++;
								}
							}
							
//							정상적인 핸드폰 번호라면 
							if(phoneCheck == 11) {
//								중복 검사를 진행하고,
								if(Bank.checkPhone(arrBank, arCount, phone) == null) {
//								중복이 없다면 핸드폰 정보 입력을 마친다.
									break;
								}
							}
						}
					}
				
//					핸드폰까지 모두 정상적으로 입력했다면
//					처음에 선택한 은행 고유번호를 사용하여 새로운 고객 객체를 user에 담아준다.
					user = arBank[bankNumber];
//					
//					사용자가 작성한 정보를 새로운 회원 객체에 담아준다.
					user.setAccount(account);
					user.setName(name);
					user.setPassword(password);
					user.setPhone(phone);
					
//					사용자가 선택한 은행(arrBank[bankNumber])
//					새롭게 생성될 고객의 위치(arCount[bankNumber]++)
//					고객 유치 후 해당 은행 고객 수 1증가(++)
					arrBank[bankNumber][arCount[bankNumber]++] = user;
					
					System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
					System.out.println("고객님의 소중한 계좌번호: " + account);
					break;
				
				case 2: // 입금 하기
					System.out.println(accountMessage);
					account = sc.next();
					
					System.out.println(passwordMessage);
					password = sc.next();
					
					user = Bank.login(arrBank, arCount, account, password);
//					로그인 성공했다면
					if(user != null) {
//						계좌번호에서 가장 첫 번째 문자는 은행 번호이다.
//						하지만 가져온 은행 번호는 자료형이 문자이다.
//						문자를 정수로 변경하고자 할 때('0', '1', '2')
//						48을 빼주면 된다('0' = 48)
						myBankNumber = user.getAccount().charAt(0) - 48;
						if(myBankNumber == bankNumber) {
//							계좌를 개설한 은향과 현재 입장한 은행이 같다며면
//							압금 시작
					
							System.out.println(depositMessage);
							money = sc.nextInt();
							
							if(money > 0) {
//								user는 up casting 된 객체이기 때문에
//								자식 클래스에서 재정의 된 메소드로 실행된다.
								user.deposit(money);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							}else {
								System.out.println(errorMessage);
							}
						}else {
							System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
						}
						
//						현 로직에서 instanceof를 통해 고객의 은행사를 구분하는 것은 무리가 있다.
//						그래서 계좌번호 맨 앞 숫자로 검사하는 것이 낫다.
//						if(bankNumber == 0) {
//							if(user instanceof Shinhan) {
//								System.out.println(depositMessage);
//								money = sc.nextInt();
//								
//								user.deposit(money);
//							}
//						}else if(bankNumber == 1) {
//							if(user instanceof Kookmin) {
//								System.out.println(depositMessage);
//								money = sc.nextInt();
//								
//								user.deposit(money);
//							}
//						}else if(bankNumber == 2) {
//							if(user instanceof Kakao) {
//								System.out.println(depositMessage);
//								money = sc.nextInt();
//								
//								user.deposit(money);
//							}
//						}
					} else {
						System.out.println(loginFailMessage);
					}
					break;
				
				case 3: // 출금 하기
					System.out.println(accountMessage);
					account = sc.next();
					
					System.out.println(passwordMessage);
					password = sc.next();
					
					user = Bank.login(arrBank, arCount, account, password);
					
					if(user != null) {
						System.out.println(withdrawMessage);
						withdrawMoney = sc.nextInt();
						
//						국민은행 고객이면 수수료 포함한 금액으로 계산한다.
						temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;
						
						if(withdrawMoney > 0) {
//							출금할 금액과 고객이 보유한 돈을 비교한다.
							if(temp <= user.getMoney()) {
//								출금 서비스 이용 가능
//								temp가 뺄 돈
//								user.getMoney 내가 가진 돈
								user.withdraw(withdrawMoney);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
								
							}else {
								System.out.println(errorMessage);
							}
							
						}else {
							System.out.println(errorMessage);
						}
					} else {
						System.out.println(loginFailMessage);
					}
					break;
				
				case 4: // 잔액 조회
					System.out.println(accountMessage);
					account = sc.next();
					
					System.out.println(passwordMessage);
					password = sc.next();
					
					user = Bank.login(arrBank, arCount, account, password);
					if(user != null) {
						System.out.println("현재 잔액: " + user.showBalance() + "원");
					}
					break;
			
				case 5: // 계좌번호 찾기
					System.out.println(phoneMessage);
					phone = sc.next();
					
					System.out.println(passwordMessage);
					password = sc.next();
					
					user = Bank.checkPhone(arrBank, arCount, phone);
					if(user != null) {
//						핸드폰 번호가 유효하면
//						비밀번호를 검사한다!
						while(true) {
							account = String.valueOf(random.nextInt(900000) + 100000);
							account = bankNumber + account;
							if(Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
						}
						
						user.setAccount(account);
						System.out.println("고객님의 소중한 계좌번호: " + account);
					}else {
						System.out.println(errorMessage);
						
					}
					break;
					
					default:
						System.out.println(errorMessage);
						break;
				}
				
			}
		}
	}
}















