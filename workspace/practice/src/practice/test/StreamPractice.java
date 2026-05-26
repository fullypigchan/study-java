package practice.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 주문 상태 Enum
enum OrderStatus {
    PAID,       // 결제 완료
    PENDING,    // 입금 대기
    CANCELLED,  // 주문 취소
    RETURNED    // 반품
}

// 주문 클래스
class Order {
    private Long id;
    private String customerName;
    private OrderStatus status;
    private int totalPrice;

    public Order(Long id, String customerName, OrderStatus status, int totalPrice) {
        this.id = id;
        this.customerName = customerName;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() { return customerName; }
    public OrderStatus getStatus() { return status; }
    public int getTotalPrice() { return totalPrice; }
}

public class StreamPractice {
    public static void main(String[] args) {
        // 1. 데이터 세팅 (DB에서 조회했다고 가정)
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1001L, "김철수", OrderStatus.PAID, 15000));
        orders.add(new Order(1002L, "이영희", OrderStatus.PENDING, 250000)); // 결제 대기
        orders.add(new Order(1003L, "박민수", OrderStatus.PAID, 300000));  // 대상
        orders.add(new Order(1004L, "최자바", OrderStatus.CANCELLED, 500000)); // 취소됨
        orders.add(new Order(1005L, "정스프", OrderStatus.PAID, 120000));  // 대상
        orders.add(new Order(1006L, "한실무", OrderStatus.PAID, 45000));   // 금액 미달

        // 2. TODO: 아래 요구사항을 Stream API로 구현하세요.
        System.out.println("=== VIP 알림 발송 목록 ===");
        
     // 2. Stream API 구현
        orders.stream()
            // [1단계: 필터링] 결제 완료(PAID) 이면서(&&) 10만원 이상인 것만 통과
            .filter(order -> order.getStatus() == OrderStatus.PAID 
                          && order.getTotalPrice() >= 100000)
            
            // [2단계: 변환] Order 객체를 -> 알림 메시지(String)로 변환
            .map(order -> {
                int points = (int) (order.getTotalPrice() * 0.05); // 5% 적립금 계산
                return "VIP 알림: " + order.getCustomerName() + "님, 이번 주문으로 " 
                       + points + "포인트가 적립되었습니다.";
            })
            
            // [3단계: 후처리] 만들어진 메시지를 하나씩 출력
            .forEach(message -> System.out.println(message));
            // .forEach(System.out::println); // 이렇게 줄여 쓸 수도 있습니다 (메소드 참조)
    }
}
