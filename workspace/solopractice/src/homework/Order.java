package homework;

import java.util.ArrayList;
import java.util.Objects;

//주문 번호
//주문한 상품들
//결제 상태(기본 값: true)
public class Order {
	private long productId;
	private ArrayList<Product> products;
	public static final ArrayList<Integer> totalPrices = new ArrayList<Integer>();
	private boolean status;
	{
		status = true;
	}

	public Order() {
		;
	}

	public Order(long productId, ArrayList<Product> products) {
		super();
		this.productId = productId;
		this.products = products;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [productId=" + productId + ", products=" + products + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return productId == other.productId;
	}
}
