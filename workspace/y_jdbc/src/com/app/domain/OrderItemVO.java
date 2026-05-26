package com.app.domain;

import java.util.Objects;

//id BIGINT PRIMARY KEY AUTO_INCREMENT,
//order_id BIGINT NOT NULL,
//product_id BIGINT NOT NULL,
//quantity INT NOT NULL,
//price INT NOT NULL COMMENT '주문 당시 가격',
//created DATETIME DEFAULT CURRENT_TIMESTAMP,
//FOREIGN KEY (order_id) REFERENCES tbl_order(id) ON DELETE CASCADE,
//FOREIGN KEY (product_id) REFERENCES tbl_product(id)
public class OrderItemVO {

   private Long id;
   private Long orderId;
   private Long productId;
   private int quantity;
   private int price;
   private String created;

   public OrderItemVO() {
   }

   public OrderItemVO(Long id, Long orderId, Long productId, int quantity, int price, String created) {
      super();
      this.id = id;
      this.orderId = orderId;
      this.productId = productId;
      this.quantity = quantity;
      this.price = price;
      this.created = created;
   }

   @Override
   public String toString() {
      return "OrderItemVO [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity
            + ", price=" + price + ", created=" + created + "]";
   }

   public final Long getId() {
      return id;
   }

   public final void setId(Long id) {
      this.id = id;
   }

   public final Long getOrderId() {
      return orderId;
   }

   public final void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public final Long getProductId() {
      return productId;
   }

   public final void setProductId(Long productId) {
      this.productId = productId;
   }

   public final int getQuantity() {
      return quantity;
   }

   public final void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public final int getPrice() {
      return price;
   }

   public final void setPrice(int price) {
      this.price = price;
   }

   public final String getCreated() {
      return created;
   }

   public final void setCreated(String created) {
      this.created = created;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      OrderItemVO other = (OrderItemVO) obj;
      return Objects.equals(id, other.id);
   }

}
