package errorPractice.task;

//에러 발생
//↓
//throw (직접 발생)
//↓
//메서드 내부에서 처리? → try-catch
//↓
//아니면?
//throws로 호출한 쪽에 위임

public class ErrorPractice {
	public static void main(String[] args) {
//	ArithmeticException : 0으로 나눌 때 발생(RuntimeException 상속)
//		try {
//			int a = 30;
//			int b = 0;
//		int result =	a/b;
//			System.out.println("나누기 결과 값은: "+ result);
//		} catch (ArithmeticException e) {
//			System.out.println("0으론 나눌 수 없습니다.");
//			e.printStackTrace();
//		}
//		
//		try {
//			int[] arNum = { 3, 5, 6 };
//
//			System.out.println(arNum[0]); // ArrayIndexOutOfBoundsException(indexOutOfBound
//											// 상속, RuntimeException 상속) -> 배열 크기보다 큰 인덱스 값 입력시 발생
//
//			int num = Integer.parseInt("abc"); //NumberFormatException(IllegalArgumentException 상속
//			System.out.println(num);		   //IllegalArgumentException는 RuntimeException 상속
//											   //문자열을 숫자로 변환하는데 숫자가 아닌경우 발생.
//// 만약 첫번째 try 실행이 오류가 되면 아래 실행은 진행되지 않고 바로 catch로 이동됨.
//// 하지만 둘다 오류가 없다면 둘 다 실행됨. 또한 위에가 오류 없고 아래가 오류 있으면 위에 결과 값은 출력
//// 아래는 catch로 이동해서 catch의 실행문 실행.
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 인덱스가 잘못되었습니다.");
//
//		}
//
//		catch (NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없습니다.");
//		}

		
		
		
	}
}
