package com.order.microservice.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode,
                          BigDecimal price, Integer quantity) {
  //  public record UserDetails(String email, String firstName, String lastName) {}
}
