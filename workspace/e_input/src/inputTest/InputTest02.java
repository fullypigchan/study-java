package inputTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
//		반려동물 이름을 입력받고 출력하기
//		입력창에 보이는 출력 메시지 값
		String message = "반려동물 이름: ";
		Scanner sc = new Scanner(System.in);
//		입력할 이름 변수에 초기값 넣어줌
		String name = null;
//		출력 메시지 먼저 
		System.out.print(message);
//		이름에 입력할 수 있게 문자열 값 할당
		name = sc.next();
		System.out.println(name);
		sc.close();
		
		
	}
}
