package com.app.domain;

import com.app.enumeration.OrderStatus;
import com.app.enumeration.ProductCategory;

public class OrderDetailVO {
   private Long orderId;
   private String customerName;
   private String customerEmail;
   private int totalAmount;
   private OrderStatus orderStatus;
   private String orderCreated;

   // OrderItem 정보
   private Long orderItemId;
   private int quantity;
   private int itemPrice;

   // Product 정보
   private Long productId;
   private String productName;
   private ProductCategory category;

   public OrderDetailVO() {
   }

   public OrderDetailVO(Long orderId, String customerName, String customerEmail, int totalAmount,
         OrderStatus orderStatus, String orderCreated, Long orderItemId, int quantity, int itemPrice, Long productId,
         String productName, ProductCategory category) {
      super();
      this.orderId = orderId;
      this.customerName = customerName;
      this.customerEmail = customerEmail;
      this.totalAmount = totalAmount;
      this.orderStatus = orderStatus;
      this.orderCreated = orderCreated;
      this.orderItemId = orderItemId;
      this.quantity = quantity;
      this.itemPrice = itemPrice;
      this.productId = productId;
      this.productName = productName;
      this.category = category;
   }

   public final Long getOrderId() {
      return orderId;
   }

   public final void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public final String getCustomerName() {
      return customerName;
   }

   public final void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public final String getCustomerEmail() {
      return customerEmail;
   }

   public final void setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
   }

   public final int getTotalAmount() {
      return totalAmount;
   }

   public final void setTotalAmount(int totalAmount) {
      this.totalAmount = totalAmount;
   }

   public final OrderStatus getOrderStatus() {
      return orderStatus;
   }

   public final void setOrderStatus(OrderStatus orderStatus) {
      this.orderStatus = orderStatus;
   }

   public void setOrderStatus(String orderStatus) {
      this.orderStatus = OrderStatus.getEnum(orderStatus);
   }

   public final String getOrderCreated() {
      return orderCreated;
   }

   public final void setOrderCreated(String orderCreated) {
      this.orderCreated = orderCreated;
   }

   public final Long getOrderItemId() {
      return orderItemId;
   }

   public final void setOrderItemId(Long orderItemId) {
      this.orderItemId = orderItemId;
   }

   public final int getQuantity() {
      return quantity;
   }

   public final void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public final int getItemPrice() {
      return itemPrice;
   }

   public final void setItemPrice(int itemPrice) {
      this.itemPrice = itemPrice;
   }

   public final Long getProductId() {
      return productId;
   }

   public final void setProductId(Long productId) {
      this.productId = productId;
   }

   public final String getProductName() {
      return productName;
   }

   public final void setProductName(String productName) {
      this.productName = productName;
   }

   public final ProductCategory getCategory() {
      return category;
   }

   public final void setCategory(ProductCategory category) {
      this.category = category;
   }

   public void setCategory(String category) {
      this.category = ProductCategory.getEnum(category);
   }

   @Override
   public String toString() {
      return "OrderDetailVO [orderId=" + orderId + ", customerName=" + customerName + ", customerEmail="
            + customerEmail + ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus + ", orderCreated="
            + orderCreated + ", orderItemId=" + orderItemId + ", quantity=" + quantity + ", itemPrice=" + itemPrice
            + ", productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
   }

}
