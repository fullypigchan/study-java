package list.task.product;

public class Product {

    private int id;         // 상품 번호
    private String name;    // 상품 이름
    private int price;      // 상품 가격
    private int stock;      // 상품 재고

    public Product() {;}

    public Product(int id, String name, int price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // 복사 생성자 (깊은 복사)
    public Product(Product product) {
this(product.getId(),product.getName(),product.getPrice(), product.getStock()); 
          }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getStock() { return stock; }

    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name +
               ", price=" + price + ", stock=" + stock + "]";
    }
}
