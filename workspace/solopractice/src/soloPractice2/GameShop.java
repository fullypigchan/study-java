package soloPractice2;

//게임샵(gameshop)
//아이템이름
//가격
//재고
public class GameShop {

	String itemName;
	int itemPrice;
	int itemStock;
	
	public GameShop() {;}

	public GameShop(String itemName, int itemPrice, int itemStock) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	//Player를 타입으로 봐야한다. 메소드 입력시 가져와야할 값이 클래스인걸 꼭 인지.
	void sell(Player player) {
		player.gameMoney-=itemPrice*itemStock*(1-player.sale/100.0);
		itemStock--;
	}
}
