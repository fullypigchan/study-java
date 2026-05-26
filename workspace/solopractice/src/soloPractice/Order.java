package soloPractice;

public class Order {

static int seq;
long id;

int total;
Product[] arProduct;

//static 블록
//   최초 1번만 실행
  static {
     seq = 0;
  }
  
//   초기화 블록
  {
     id = ++seq;
  }
  
public Order() {;}

public Order(Product[] arProduct) {
	this.arProduct = arProduct;
	
	for (int i = 0; i < arProduct.length; i++) {
		total += arProduct[i].price*arProduct[i].count;
				
	}



}


}
