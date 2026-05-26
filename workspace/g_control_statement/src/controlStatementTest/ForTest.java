package controlStatementTest;

public class ForTest {

	public static void main(String[] args) {
	
//		고정: 초기값 0, i++
//		이름 10번 출력
//		첫 번째 반복:i=0
//		두 번째 반복:i=1
//		세 번째 반복:i=2
//		...
//		열 번째 반복:i=9
//		for(int i=0; i<10; i=i+1)
		
//		이름 10번 출력, 10~1까지 거꾸로 출력
//		첫 번째 i=0 -> 10이 출력 되려면 10-i=10
//		두 번째 i=1 -> 9가 출력 되려면 10-i=9
//		열 번째 i=9 -> 1이 출력 되려면 10-i=1
		for(int i=0; i<10; i=i+1) {
			System.out.println(10-i+". 김윤찬");
		} 
		
	}

}
