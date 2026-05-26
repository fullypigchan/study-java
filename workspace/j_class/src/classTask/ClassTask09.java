package classTask;
//손님이 상품을 마켓에서 구매하면
//그 손님의 할인율에 맞게 잔액이 반영된다.
public class ClassTask09 {
public static void main(String[] args) {
	
	Market emart=new Market("화장지", 8500, 25);
	Customer customer= new Customer("김윤찬", "01012341234", 10000, 50);
	 if(emart.productStock > 0) {
	emart.sell(customer);
	System.out.println(customer.money);
	System.out.println(emart.productStock);
	 }else
		  System.out.println("재고가 부족합니다.");
}
}
