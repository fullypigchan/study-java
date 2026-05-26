package soloPractice;
//손님 클래스(Customer)
//손님의 할인율=특정정보를 담아야함
//회원 번호,이름,나이,성별,상품배열,총가격,할인율.

public class Customer {

String name;
int age;
String gender;
int sale;
MarketProduct[] arrMarketProducts;
double total;
public Customer(){}

public Customer(String name, int age, String gender, int sale, 
		MarketProduct[] arrMarketProducts) {
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.sale = sale;
	this.arrMarketProducts = arrMarketProducts;
	for (int i = 0; i < arrMarketProducts.length; i++) {
		total+=arrMarketProducts[i].productCount * arrMarketProducts[i].productPrice*
				(1-(double)sale/100);
	
	}
}

}
