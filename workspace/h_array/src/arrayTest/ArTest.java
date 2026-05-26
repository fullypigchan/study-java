package arrayTest;

public class ArTest {

	public static void main(String[] args) {
//		int[] arData= {2,3,5,6,8}; //앞에 new int[] 생략
//		
////		System.out.println(arData); [I@58ceff1 배열,인티저이다,골뱅이 뒤가 주소
//		
//		for(int i=0; i<arData.length; i++) {
//			System.out.print(arData[i]);
//		}
//	5칸 배열 선언 후 5,4,3,2,1 넣고 출력
//		int[] arData = new int[5]; int 자료형을 5칸 Heap 메모리(동적 메모리)에 할당한다.
//		각 방은 모두 초기값(0)으로 되어 있다.
		int[] arData= {5,4,3,2,1};
//		arData 길이만큼 반복한다(5번 반복)
		for (int i = 0; i < arData.length; i++) {
//			각 방에 순서대로 5,4,3,2,1 넣어준다.
			arData[i]=5-i;
		}
//		arData[0]=5;
//		arData[1]=4;
//		arData[2]=3;
//		arData[3]=2;
//		arData[4]=1;
//		arData 길이만큼 반복한다(5번 반복)
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]);
		}
	
	}

}
