package controlStatementTest;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
//		심리 테스트
//		
//		Q. 당신이 좋아하는 색을 선택하세요.
//		1. 빨간색
//		2. 노란색
//		3. 검은색
//		4. 흰색
//		
//		빨간색 : 불같고 열정적이고 적극적이다.
//		노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//		검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//		흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		
		//입력창에 뜰 출력문 선언 
		String title = "Q. 당신이 좋아하는 색을 선택하세요.";
		String menu = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색";
		//입력을 위한 스캐너 선언
		Scanner sc = new Scanner(System.in);
		//사용자가 선택할 정수값 선언 및 초기화
		int choice = 0;
		//사용자가 입력한 숫자에 대응하는 변수 설명문 선언 및 초기화
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 시도해주세요.";
		String resultMessage = null;
		//삼항 연산자 사용을 위해 만들어 놓은 조건값의 초기값
		boolean redCondition = false; //조건문의 초기값은 false!
		boolean yellowCondition = false;
		boolean blackCondition = false;
		boolean whiteCondition = false;
		//입력창에 뜰 문구 먼저 출력
		System.out.println(title);
		System.out.println(menu);
		//사용자가 입력할 입력 메소드
		choice = sc.nextInt();
		//입력값에 따른 조건의 조건값 할당
		redCondition = choice == 1;
		yellowCondition = choice == 2;
		blackCondition = choice == 3;
		whiteCondition = choice == 4;
	
		if(redCondition) {
			resultMessage=redMessage;
		}else if(yellowCondition) {
			resultMessage=yellowMessage;
		}else if(blackCondition) {
			resultMessage=blackMessage;
		}else if(whiteCondition) {
			resultMessage=whiteMessage;
		}else {
			resultMessage=errorMessage;
		}
		System.out.println(resultMessage);

		sc.close();
	}

}
