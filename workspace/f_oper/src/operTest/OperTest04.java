package operTest;

public class OperTest04 {

	public static void main(String[] args) {
		
		int data=10;
//		data=data+1;
//		data+=1;
//		++data;
//		System.out.println(data++); 좌에서 우로 해석하므로 다음줄부터 ++적용(후위형)
//		System.out.println(++data); 좌에서 우로 해석하므로 ++먼저 하고 데이터 출력(전위형)
//		전위형 후위형 둘 다 상관없으면 후위형을 기본으로 사용한다.
		System.out.println(++data);
		

	}

}
