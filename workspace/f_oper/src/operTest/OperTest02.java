package operTest;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) {
//		두 정수 입력받기
		//정수 두 개 값을 위한 변수 선언 및 초기화
		int number1 = 0, number2 = 0;
		//어떤 값을 입력해야하는지에 관한 출력값 선언
		String message = "두 정수를 입력해주세요.";
		String example = "예) 2 3";
//		int result = 0;
		//삼항연산의 조건문 결과 변수값으로 선언
		String result = null;
		//입력을 위한 스캐너 선언
		Scanner scanner = new Scanner(System.in);
		//콘솔창에 뜰 문구 출력
		System.out.println(message);
		System.out.println(example);
		//콘솔창에서 입력할 변수에 스캐너 입력
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		
//		더 큰 값을 출력
//		두 수가 같으면 "두 수가 같습니다" 출력
		result = number1 < number2 ? "더 큰 값: " + number2 
				: number1 == number2 ? "두 수가 같습니다." : "더 큰 값: " + number1;
		System.out.println(result);
		
	}
}















