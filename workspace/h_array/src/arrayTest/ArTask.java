package arrayTest;

public class ArTask {

	public static void main(String[] args) {
//		1~10까지 배열에 담고 출력
//		10~1까지 중 짝수만 배열에 담고 출력
//		1~100까지 배열에 담은 후 홀수만 출력
//		1~100까지 배열에 담은 후 짝수의 합 출력
//		
//		001.png ~ 010.png를 배열에 담고 출력
//		숙제: 5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		단 같은 수는 없다고 가정한다.
		
//		사용자에게 칸 수를 입력받고, 그 칸 수 만큼 정수를 다시 입력 받는다.
//		입력한 정수들의 평균값을 구한다.
		
//		당신은 3칸 방이 있는 건물의 주인이다.
//		각 방에는 세입자가 살고 있다.
//		방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
		
//	1.
		//1부터 10까지 담아줘야함 ->10번 반복
//		int[] arData1= {1,2,3,4,5,6,7,8,9,10};
		int[] arData1=new int[10]; //크기가 10인 배열 선언
		for(int i=0; i<arData1.length; i++) { 
			arData1[i]=i+1; //1~10을 담아야함
							//i는 0부터 9까지이므로 +1을 해줘서 배열에 담는다
		}
		for (int i = 0; i < arData1.length; i++) {
			System.out.print(arData1[i]); //담은 배열을 처음부터 끝까지 출력
			//arData[0], arData[1], ,,, arData[9]
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//	2.
		int[] arData2 = new int[5]; //크기 5인 배열 선언
		for (int i = 0; i < arData2.length; i++) {
			arData2[i]=10-2*i; 
			//인덱스는 0 1 2 3 4 
			// 숫자는 10 8 6 4 2 ->5 4 3 2 1 => (5-i)*2
			System.out.println(arData2[i]); //짝수만 출력
		}
//	3.
		int[] arData3 = new int[100]; //크기 100짜리 배열 선언
		for (int i = 0; i < arData3.length; i++) {
			arData3[i]=i+1;	//1부터 100이 담긴다
		}
		for (int i = 0; i < arData3.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arData3[i]); //index가 짝수인 자리에 홀수가 담김.
			}
		
}
//	4.
		//합 할때 사용할 변수 선언
		int sum=0;
		//크기 100짜리 배열 선언
		int[] arData4 = new int[100];
		//배열에 1~100까지의 값 담기
		for (int i = 0; i < arData3.length; i++) {
			//i가 0부터 시작하므로 i+1값 담기
			arData4[i]=i+1;			
			}
		//1부터 100까지 담긴 배열 중 짝수가 담긴 배열만 합해야함
		//index가 0,1,2,3,4,5,
		//담긴 숫자는1,2,3,4,5,6..
		//따라서 index가 홀수 자리에서 짝수가 담겨있음 --> %를 이용한 if문으로 짝수만 선별
		for (int i = 0; i < arData4.length; i++) {
			//i가 홀수일때 담긴 값이 짝수이다.
			if(i % 2 ==1) {
				sum+=arData4[i];
				//sum=sum+[0] sum=sum+[1]+[0]
		}								
		}	
		System.out.println(sum);
	}
		
}
