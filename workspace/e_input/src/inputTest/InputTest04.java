package inputTest;

import java.util.Scanner;

public class InputTest04 {
	public static void main(String[] args) {
//		나이와 이름 입력받고 출력하기
//		나이와 이름을 담을 변수를 선언한다
		int age = 0;		
		String name = null;
//		사용자에게 출력할 메시지를 담는다
		String nameMessage = "이름: ";
		String ageMessage = "나이: ";
//		입력할 준비를 한다
		Scanner sc = new Scanner(System.in);
//		입력후의 출력 메시지를 담는다
		String nameResultMessage = "저의 이름은 ";
		String ageResultMessage = "저의 나이는 ";
//		사용자에게 메시지를 출력한다
		System.out.print(nameMessage);
//		이름을 입력받는다
		name = sc.next();
		
		System.out.println(ageMessage);
		//sc.next()는 문자열 값이므로 Integer를 통한 형변환을 진행한다
		age = Integer.parseInt(sc.next());
//		결과를 도출한다
		System.out.println(nameResultMessage + name);
		System.out.println(ageResultMessage + age);
		
		sc.close();
	}
}













