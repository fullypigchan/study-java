package soloPractice2;



//온라인 게임 아이템 구매

//게임샵(gameshop)
//아이템이름
//가격
//재고

//플레이어(player)
//닉네임
//게임머니
//할인율
public class ClassTask10 {
public static void main(String[] args) {
	GameShop lol=new GameShop("레오나", 4500, 1);
	Player player=new Player("나", 10000, 6);
	if(lol.itemStock>0) {
		lol.sell(player);
		System.out.println(player.gameMoney);
		System.out.println(lol.itemStock);
	}else
		System.out.println("재고가 부족합니다.");
}
}
