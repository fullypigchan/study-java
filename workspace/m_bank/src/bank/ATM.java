package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//	화면
	public static void main(String[] args) {
		//은행 3사와 그 안에 담긴 고객을 배열로 선언.
		Bank[][] arrBank = new Bank[3][100];
		//arrBank가 총 고객수 이므로, 전체 고객수를 담을 배열 선언
		int[] arCount = new int[arrBank.length];
		//은행의 이름을 신한, 국민, 카카오뱅크라는 문자열 배열 선언.
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };
		//어떤 은행을 이용할 것인지 제공할 출력 메시지.
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		//은행 선택 후 어떤 서비스를 이용할건지 알려줄 출력 메시지.
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		//각각의 선택을 입력 받을 스캐너 선언.
		Scanner sc = new Scanner(System.in);
		//은행 번호, 서비스 선택, 내가 선택한 은행 번호 초기화.
		int bankNumber = 0, choice = 0, myBankNumber = 0;
		//고객의 계좌,비밀번호,전화번호,이름 전부 초기화.
		String account = null, password = null, phone = null, name = null;
		//user 초기화.
		Bank user = null;
		//잔액, 입금, 출금 금액 초기화
		int money = 0, withdrawMoney = 0, temp = 0; 
		Random random = new Random(); //계좌번호 랜덤 생성을 위한 랜덤함수 생성
		//비밀번호와 핸드폰 번호의 숫자가 맞는지 확인하기 위한 변수 초기화.
		int passwordCheck = 0, phoneCheck = 0; 
		
		//고객이 서비스 이용한 부분에 대한 출력 메시지
		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";
		//while문을 통해 무한 반복문 돌리기
		while(true) {
			//사용자에게 어떤 은행을 사용할 것인지 입력
			System.out.println(message);
			bankNumber = sc.nextInt();
			//4번은 나가기 이므로 반복문 중단.
			if(bankNumber == 4) {
				break;
			}
			//bank 넘버 감소
			bankNumber--;
			
			while(true) {
				//사용자가 어떤 서비스를 이용할 것인지 choice에 입력.
				System.out.println(menu);
				choice = sc.nextInt();
				//6은 서비스 메뉴로 돌아가기 이므로 중단.
				if(choice == 6) {
					break;
				}
				//값에 따른 선택이 정해져있으므로 switch문 이용
				//사용자가 입력한 번호에 따른 서비스 별 실행문.
				switch(choice) {
				case 1: // 계좌 개설
					//계좌 개설 할 은행을 arBank라는 배열에 담아줌
					Bank[] arBank = {new Shinhan(), new Kookmin(), new Kakao()};
					
					while(true) {
						//1~999999까지의 숫자중 랜덤하게 배열하여 계좌 생성
						//valueOf는 정수형자료를 String형으로 리턴시켜줌.
						account = String.valueOf(random.nextInt(900000) + 100000);
//						계좌번호는 선택한 은행번호와 계좌번호의 연결로 선언.
						account = bankNumber + account;
						//만일 Bank클래스에 있는 중복계좌 검사 결과 리턴값이 없다면 중단
						if(Bank.checkAccount(arrBank, arCount, account) == null) {
							break;
						}
					}
//					예금 메시지 출력후 고객이 직접 이름 입력
					System.out.println(nameMessage);
					name = sc.next();
					
					while(true) {
//					계좌의 비밀번호 메시지를 출력하고 고객에게 입력 받는다.
						System.out.println(passwordMessage);
						password = sc.next();
//						비밀번호 체크를 위한 변수 초기화.
						passwordCheck = 0;
//						만약 비밀번호가 네자리라면
						if(password.length() == 4) {
							for (int i = 0; i < password.length(); i++) {
								//아스키 코드로 인한 변환으로 보완을 높인다.
								//48에 해당하는 문자는 0, 57에 해당하는 문자는 9
								char c = password.charAt(i);
								if(c >= 48 && c <= 57) {
									//비밀번호가 0~9안의 숫자로 이루어져있으면 passwordCheck ++해준다
									passwordCheck++;
									
								}
							}
						}
						//비밀번호는 네자리이므로 passwordCheck가 4이면 중단한다.
						if(passwordCheck == 4) {
							break;
						}
					}
					
					while(true) {
						//폰 번호를 입력받는다.
						System.out.println(phoneMessage);
						phone = sc.next();
						phoneCheck = 0;
						//폰 입력시 -를 모두 제거한다.
						phone = phone.replaceAll("-", "");
						//폰번호가 11자리 for문을 돌려 폰번호가 0~9로 이루어져있는지 확인하고
						if(phone.length() == 11) {
							for (int i = 0; i < phone.length(); i++) {
								char c = phone.charAt(i);
								if(c >= 48 && c <= 57) {
							//폰 번호가 0~9 사이 숫자라면 phoneCheck를 ++해준다.
									phoneCheck++;
								}
							}
							//11자리 폰번호가 모두 0~9 사이 숫자로 이루어져있다면
							if(phoneCheck == 11) {
						//핸드폰 중복검사를 실행하고,없다면 중단한다.
								if(Bank.checkPhone(arrBank, arCount, phone) == null) {
									break;
								}
							}
						}
					}
					//user가 신한, 국민, 카카오 중 하나에 들어간다.
					user = arBank[bankNumber];
					//user는 위에서 입력받은 것들을 set한다.
					user.setAccount(account);
					user.setName(name);
					user.setPassword(password);
					user.setPhone(phone);
					//arrBank배열 안에 은행 정보와 고객번호를 넣고 user가 생성된다.
					arrBank[bankNumber][arCount[bankNumber]++] = user;
					//선택한 은행의 가입 환영 메시지를 출력한다
					System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
					//계좌번호를 출력메시지로 알려준다.
					System.out.println("고객님의 소중한 계좌번호: " + account);
					break;
				
				case 2: // 입금 하기
					//계좌를 입력받는다.
					System.out.println(accountMessage);
					account = sc.next();
					//비밀번호를 입력받는다.
					System.out.println(passwordMessage);
					password = sc.next();
					//user의 로그인을 위해 로그인 메소드를 호출한다.
					user = Bank.login(arrBank, arCount, account, password);
					//유저가 존재한다면
					if(user != null) {
						//내 은행 번호 초기화
						myBankNumber = user.getAccount().charAt(0) - 48;
						//만약 은행번호와 내 은행 번호가 같다면 출금 메시지 출력
						if(myBankNumber == bankNumber) {
							System.out.println(depositMessage);
							//입금 할 액수를 입력받는다.
							money = sc.nextInt();
							//만약 입금할 돈이 0보다 크다면 금액 추가
							if(money > 0) {
								user.deposit(money);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							}else {
								System.out.println(errorMessage);
							}
						}
						//만약 은행번호와 내 은행번호가 달랐을 때의 출력메시지.
						else {
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
					} 
					//만약 유저가 로그인을 실패하면 로그인 실패 메시지 출력
					else {
						System.out.println(loginFailMessage);
					}
					break;
				
				case 3: // 출금 하기
					//계좌 입력받기
					System.out.println(accountMessage);
					account = sc.next();
					//비밀번호 입력받기
					System.out.println(passwordMessage);
					password = sc.next();
					//로그인 메소드 호출하기.
					user = Bank.login(arrBank, arCount, account, password);
					//유저가 존재한다면
					if(user != null) {
						//출금 메시지 출력후 출금할 금액 입력하기
						System.out.println(withdrawMessage);
						withdrawMoney = sc.nextInt();
						//유저가 국민은행에 속해있다면 출금금액의 1.5배를 temp에 넣고 아니면 출금 금액을 temp에 넣는다.
						temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;
						//만약 출금액이 양수라면
						if(withdrawMoney > 0) {
							//출금액이 유저가 갖고있는 돈보다 적거나 같다면
							if(temp <= user.getMoney()) {
								//유저는 출금을 하고 남은 잔액에 관한 출력 메시지룰 확인한다.
								user.withdraw(withdrawMoney);
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							//만약 출금액이 갖고있는 돈보다 크다면 에러메시지.	
							}else {
								System.out.println(errorMessage);
							}
							//출금액이 음수여도 에러메시지
						}else {
							System.out.println(errorMessage);
						}
						//유저가 로그인에 실패하면 로그인 실패 메시지를 출력.
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
					//유저의 계좌와 비밀번호를 잘 입력 받는다면 현재 잔액을 출력한다.
					if(user != null) {
						System.out.println("현재 잔액: " + user.showBalance() + "원");
					}
					break;
				
				case 5: // 계좌번호 찾기
					//폰번호를 입력받는다
					System.out.println(phoneMessage);
					phone = sc.next();
					//비밀번호를 입력받는다.
					System.out.println(passwordMessage);
					password = sc.next();
					//유저의 정보를 bank의 checkPhone메소드에서 불러온다.
					user = Bank.checkPhone(arrBank, arCount, phone);
					//유저 정보가 있다면
					if(user != null) {
						while(true) {
							//랜덤으로 계좌 번호를 생성하고 은행번호와 연결한다.
							account = String.valueOf(random.nextInt(900000) + 100000);
							account = bankNumber + account;
							//만약 checkAccount의 메소드 값이 존재하지 않는다면 중단한다.
							if(Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
						}
						//user의 계좌를 리턴하고 출력한다
						user.setAccount(account);
						System.out.println("고객님의 소중한 계좌번호: " + account);
					}
					//만일 유저 정보가 존재하지 않는다면 에러메시지 출력
					else {
						System.out.println(errorMessage);
						
					}
					break;
					//case값에 벗어나는 값을 입력하면 에러메시지 출력
					default:
						System.out.println(errorMessage);
						break;
				}
				
			}
		}
	}
}















