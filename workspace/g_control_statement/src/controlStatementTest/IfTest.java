package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 입력받기
		//입력할 두 정수에 관한 변수 초기화
		int number1 = 0, number2 = 0;
		//출력 메세지 설정
		String message = "두 정수를 입력해주세요.";
		String example = "예) 2 3";
		//사용하지 않음..?
		String result = null;
		//스캐너 선언
		Scanner scanner = new Scanner(System.in);
		//출력 메시지 출력
		System.out.println(message);
		System.out.println(example);
		//정수 입력 메소드
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		//조건문을 통한 출력(else if를 사용할 경우 조건문 충족시 나머지 조건은 실행하지않음)
		//but if문만 사용할경우 조건을 충족하더라도 쭉 진행함(불필요한 탐색)
//		// -->중괄호 안을 분기라고함.
//		if(number1 > number2) {
//			System.out.println("더 큰 값: " + number1);
//			
//		}else if(number2 > number1) {
//			System.out.println("더 큰 값: " + number2);
//			
//		}else {
//			System.out.println("두 수가 같습니다.");
//
//		}
		if(number1 > number2) {
		result=	"더 큰 값: " + number1;
			
		}else if(number2 > number1) {
		result=	"더 큰 값: " + number2;
			
		}else {
			result="두 수가 같습니다.";

		}System.out.println(result);
		scanner.close();
	}
}












