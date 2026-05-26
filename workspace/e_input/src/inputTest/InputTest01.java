package inputTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
//		이름을 입력받고 출력하기
//		출력메시지 및 입력 메시지 변수 초기화
//		String nameMessage = "이름: ";
//		String name = null;
//		스캐너 선언
//		Scanner sc = new Scanner(System.in);
//		출력메시지 출력
//		System.out.print(nameMessage);
//		입력을 위한 문자열 값 할당
//		name = sc.next();
//		입력을 통한 출력 메시지 출력
//		System.out.println("반갑습니다 " + name + "님");
		
//		next()
//		next()의 경우 공백값을 허용하지 않음
//		String nameMessage = "이름: ";
//		공백을 허용하지 않으므로 성과 이름 변수를 따로 선언 및 초기화
//		String lastName = null, firstName = null;
//		String name = null;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(nameMessage);
//		lastName = sc.next();
//		firstName = sc.next();
//		name이라는 변수에 성 이름 값 할당
//		name = lastName + firstName;
//		
//		System.out.println("반갑습니다 " + name + "님");
		
//		nextLine() 공백값도 값으로 인정.
		String nameMessage = "이름: ";
		String name = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(nameMessage);
		name = sc.nextLine();
		System.out.println("반갑습니다 " + name + "님");
		
		sc.close();
	}
	
}


















