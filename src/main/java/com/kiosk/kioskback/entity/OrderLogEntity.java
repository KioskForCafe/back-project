package com.kiosk.kioskback.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "OrderLog")
@Table(name = "OrderLog")
public class OrderLogEntity {
  @Id
  private int orderLogId;
  private int orderId;
  private String userId;
  private int totalPrice;
  private String createdAt;

}
