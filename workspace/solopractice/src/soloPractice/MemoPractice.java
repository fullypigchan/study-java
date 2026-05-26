package soloPractice;


import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;


public class MemoPractice {
// 3개의 정수를 이용하여 세 정수를 합한 값과 뺀 값.
//	void operate(int number1,int number2,int number3,int[]operResult) {
////		3.operResult의 0번지에는 세 정수를 합하고
////		  operResult의 1번째에는 세 정수를 뺀다
////		void의 경우 리턴을 하지 않는다.void 이외의 메소드의 경우 리턴값이 필요하다.
//		operResult[0]=number1+number2+number3;
//		operResult[1]=number1-number2-number3;
//	}
//	// Scanner로 값을 5개 입력받아 2번째 값과 5번째 값을 나눈 몫과 나머지를 출력하라.
//	
//	int[] getOutPrint(int[] arNum, int[] arResult) {
//		if(arNum[4] != 0) {
//			arResult[0]=arNum[1]/arNum[4];
//			arResult[1]=arNum[1]%arNum[4];
//		}
//		
//	return arResult;
//	}
//	0 1 2 3 4 5 6 7 8 9  ...14       ->4 9 14
//	1 2 3 4 5 6 7 8 9 10    15
//	1부터 100까지 5의 배수를 더한 값 출력
//	int getTotal(int[] arNum, int result) {
//		
//		int[] arFiveNum=new int[20];
//		
//	 for (int i = 0; i < arFiveNum.length; i++) {
//		 arFiveNum[i]=arNum[5*i+4];
////		if(arNum[i] % 5==0){
////		 result+=arNum[i];  }
//	}
//	 for (int i = 0; i < arFiveNum.length; i++) {
//		result += arFiveNum[i];
//	}
//	 return result;
//	}
//	
//	상품 가격, 상품 재고를 입력 받아서 각 상픔의 가격 총합과 평균을 구하라.
//	
//	주문한 상품의 개수와 개별 가격, 할인 쿠폰으로 총 주문 가격을 구하는 메소드
//	pay(3,3000,1000)==8000
	
//	int getTotal(int num, int price, int salePrice) {
//		int pay= num*price-salePrice;
//		
//		return pay;
//	}
//	

	
//	주문한 상품의 개수와 개별 가격, 할인 쿠폰으로 총 주문 가격을 구하는 메소드
//	단, 할인 쿠폰은 여러개 받을 수 있으며, 순차 적용하여 총 가격이 0이되지 않도록 적용한다.
//	pay(3,3000,new int[]{3000,4000,5000}) ==2000
	int getTotal(int num, int price, int[] arCoupon) {
		int totalPrice=num*price;
//		쿠폰 갯수만큼 반복한다(쿠폰 하나하나 모두 총 가격에서 빼줘야 하니까)
		for (int i = 0; i < arCoupon.length; i++) {
//			적용시키지 않고 그냥 빼본다.
			int result=totalPrice - arCoupon[i];
//			빼봣더니 총 가격이 0이하다.
			if(totalPrice - arCoupon[i] <=0) {
//			더이상 반복(쿠폰적용)할 필요가 없다.
				break;
			}
//			빼봣더니 총 가격이 0보다 크다
			totalPrice-=arCoupon[i];
		}
		return totalPrice;
		 
	}
	
	
	
	public static void main(String[] args) {
//	heap 메모리에 올려서 static이 찾을 수 있게 한다.

	MemoPractice m=new MemoPractice();
//
//	//	1.operResult라는 집을 만들어줌(주소가 생겼다)
//	
//	int[] operResult = new int[2];
//
//	//	2.사용자가 10, 2, 3이라는 숫자를 이용하여 무엇을 할지 operResult라는 집주소로 이동
//
//	m.operate(10, 2, 3, operResult);
//
//	//	메소드에 있는 operResult를 찾아가 확인한 값을 출력.
//	
//	System.out.println(operResult[0]);
//	System.out.println(operResult[1]);
//
		Scanner sc=new Scanner(System.in);
//		int[] arResult=new int[2];
//		int[] arNum = new int[5];
//		System.out.println("정수 5개를 입력해주세요.");
//		for (int i = 0; i < 5; i++) {
//			arNum[i]=sc.nextInt();
//		}
//		m.getOutPrint(arNum, arResult);
//		
//		System.out.println(arResult[0]);
//		System.out.println(arResult[1]);
		
//	    int[] arNum=new int[100];
//		int result=0;
//		for (int i = 0; i < arNum.length; i++) {
//			arNum[i]=i+1;		
//		}
//		 result=m.getTotal(arNum, result);
//		 System.out.println(result);
//		
//		int num=sc.nextInt();
//		int price=sc.nextInt();
//		int salePrice=sc.nextInt();
//		int pay=0;
//	    pay=m.getTotal(num, price, salePrice);
//		System.out.println("pay("+num+","+price+","+salePrice+")==8000");
//			
	int result=m.getTotal(3, 3000, new int[] {3000,4000,5000});
	System.out.println(result);
	}	
}
