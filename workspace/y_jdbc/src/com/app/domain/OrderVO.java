package com.app.domain;

import java.util.Objects;

import com.app.enumeration.OrderStatus;

//id BIGINT PRIMARY KEY AUTO_INCREMENT,
//customer_name VARCHAR(100) NOT NULL,
//customer_email VARCHAR(100) NOT NULL,
//total_amount INT DEFAULT 0,
//order_status VARCHAR(20) NOT NULL,
//created DATETIME DEFAULT CURRENT_TIMESTAMP,
//updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
public class OrderVO {
   private Long id;
   private String customerName;
   private String customerEmail;
   private int totalAmount;
   private OrderStatus orderStatus;
   private String created;
   private String updated;

   public OrderVO() {
   }

   public OrderVO(Long id, String customerName, String customerEmail, int totalAmount, OrderStatus orderStatus,
         String created, String updated) {
      super();
      this.id = id;
      this.customerName = customerName;
      this.customerEmail = customerEmail;
      this.totalAmount = totalAmount;
      this.orderStatus = orderStatus;
      this.created = created;
      this.updated = updated;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getCustomerName() {
      return customerName;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerEmail() {
      return customerEmail;
   }

   public void setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
   }

   public int getTotalAmount() {
      return totalAmount;
   }

   public void setTotalAmount(int totalAmount) {
      this.totalAmount = totalAmount;
   }

   public OrderStatus getOrderStatus() {
      return orderStatus;
   }

   public void setOrderStatus(OrderStatus orderStatus) {
      this.orderStatus = orderStatus;
   }
   
   public void setOrderStatus(String orderStatus) {
      this.orderStatus = OrderStatus.getEnum(orderStatus);
   }

   public String getCreated() {
      return created;
   }

   public void setCreated(String created) {
      this.created = created;
   }

   public String getUpdated() {
      return updated;
   }

   public void setUpdated(String updated) {
      this.updated = updated;
   }

   @Override
   public String toString() {
      return "OrderVO [id=" + id + ", customerName=" + customerName + ", customerEmail=" + customerEmail
            + ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus + ", created=" + created
            + ", updated=" + updated + "]";
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
      OrderVO other = (OrderVO) obj;
      return Objects.equals(id, other.id);
   }

}
