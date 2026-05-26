package soloPractice2;
//우체국 택배(PostOffice)
//kg당 가격
public class PostOffice {
	int total;
	
	final static int KGPRICE=100;
	Box[] arBox;
	public PostOffice() {;}
	public PostOffice(Box[] arBox) {
		this.arBox = arBox;
	}
	
	int getTotalPrice(Box[] arBox) {
		for (int i = 0; i < arBox.length; i++) {
			int total=arBox[i].weight*KGPRICE;
		}
		return total;
		}
	}

