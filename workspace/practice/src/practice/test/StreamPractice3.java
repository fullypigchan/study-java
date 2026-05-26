package practice.test;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int stock;       // 현재 재고
    private boolean isSale;  // 판매 중 여부 (true: 판매중, false: 판매중단)
    private int price;

    public Product(String name, int stock, boolean isSale, int price) {
        this.name = name;
        this.stock = stock;
        this.isSale = isSale;
        this.price = price;
    }

    public String getName() { return name; }
    public int getStock() { return stock; }
    public boolean isSale() { return isSale; }
    public int getPrice() { return price; }
}

public class StreamPractice3 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("노트북", 3, true, 1200000)); // 재고 부족 (대상)
        products.add(new Product("마우스", 50, true, 30000));
        products.add(new Product("키보드", 2, false, 80000)); // 재고 부족하나 판매 중단됨 (제외)
        products.add(new Product("모니터", 4, true, 250000));  // 재고 부족 (대상)
        products.add(new Product("USB", 100, true, 10000));

        System.out.println("=== 발주 요청 목록 ===");
        
        // TODO: 문제 3번 코드를 작성하세요.
    }
}