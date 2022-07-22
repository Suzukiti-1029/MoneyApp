package com.example.money.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Record {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date eventDate;
  private String purpose;
  private int amount;
  private String note;
  private int balance;
  private Date createdTimestamp;
  private Date updatedTimestamp;

  @PrePersist
  public void doPrePersist() {
    setCreatedTimestamp(new Date());
    setUpdatedTimestamp(new Date());
  }

  @PreUpdate
  public void doPreUpdate() {
    setUpdatedTimestamp(new Date());
  }
}
