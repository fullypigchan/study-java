package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ProductCategory {
   ELECTRONICS("전자제품"), FASHION("패션"), FOOD("식품"), BOOK("도서"), SPORTS("스포츠");

   private static final Map<String, ProductCategory> CATEGORY_MAP = Stream.of(ProductCategory.values())
         .collect(Collectors.toMap(ProductCategory::getValue, Function.identity()));

   private String value;

   ProductCategory(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }

   public static ProductCategory getEnum(String value) {
      return CATEGORY_MAP.get(value);
   }
}