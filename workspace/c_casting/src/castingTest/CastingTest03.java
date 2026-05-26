package castingTest;

public class CastingTest03 {
	public static void main(String[] args) {
//		int number = Integer.parseInt("10") + 8;
//		int result = number + 4;
//		
//		System.out.println(result);
		
//		"11" + "21" = 32
//		"11"과 "21"은 문자열 값이므로 형변환을 위한 정수형 변수 선언
//		parseInt를 통한 변환
		int number1 = Integer.parseInt("11");
		int number2 = Integer.parseInt("21");
		int result = number1 + number2;
//		출력할 메시지를 담는다
		String message = "11 + 21 = ";
//		출력할 메시지와 출력 값을 담는다	
		System.out.println(message + result);
//		실수가 담긴 문자열 값은 Double.parseDouble을 통해 형변환이 가능하다.
//		실수
		System.out.println(Double.parseDouble("2.55") + 3);
	}
}













