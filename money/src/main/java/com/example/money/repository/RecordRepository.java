package com.example.money.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.money.model.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
