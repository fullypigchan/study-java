package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OrderStatus {
   PENDING("대기중"), CONFIRMED("확인됨"), SHIPPED("배송중"), DELIVERED("배송완료"), CANCELLED("취소됨");

   private static final Map<String, OrderStatus> ORDERSTATUS_MAP = Stream.of(OrderStatus.values())
         .collect(Collectors.toMap(OrderStatus::getValue, Function.identity()));
   private String value;

   private OrderStatus() {
   }

   private OrderStatus(String value) {
      this.value = value;
   }

   public final String getValue() {
      return value;
   }

   public static OrderStatus getEnum(String value) {
      return ORDERSTATUS_MAP.get(value);
   }
}
