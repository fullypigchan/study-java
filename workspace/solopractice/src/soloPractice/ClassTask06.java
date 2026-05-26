package soloPractice;



//상품 클래스
//상품명
//상품 가격
//상품 재고

//주문 클래스
//주문 번호
//상품들

//주문에서 결제할 총 금액을 계산할 수 있다.
public class ClassTask06 {
public static void main(String[] args) {
	Product[] arProducts= {
			new Product(),
			new Product("핸드폰",10000000,1),
			new Product("키보드",50000,1),
			new Product("노트북",1000000,1)
	};
	Order order = new Order(arProducts);
	 
	 System.out.println(order.id);
	 System.out.println(order.total);
	 
	 
	 
	 
	 
}
}
