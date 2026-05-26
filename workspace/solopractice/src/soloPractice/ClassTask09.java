package soloPractice;
//손님이 상품을 마켓에서 구매하면
//그 손님의 할인율에 맞게 잔액이 반영된다.

//손님 클래스(Customer)
//손님의 할인율=특정정보를 담아야함
//이름,나이,성별,상품배열,총가격,할인율.

//상품 클래스(MarketProduct)
//상품 갯수, 상품 가격
public class ClassTask09 {
public static void main(String[] args) {
	

	MarketProduct[] arrMarketProducts= {
			new MarketProduct("사과", 2,1500 ),
			new MarketProduct("배", 5,2000 ),
			new MarketProduct("딸기", 1,9000 )
	};
	Customer me=new Customer("김윤찬", 27, "남성", 9, arrMarketProducts);
	System.out.println("회원 이름은 "+me.name);
	System.out.println("회원 나이는 "+me.age);
	System.out.println("회원 성별은 "+me.gender);
	System.out.println("회원 할인율은 "+me.sale+ "% 입니다.");
	double result=me.total;
	System.out.println("총 가격은: "+result+ "원 입니다");
}
}