package com.example.money.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.money.repository.RecordRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecordService {
  private final RecordRepository recordRepository;

  public void getAllRecord(Model model) {
    model.addAttribute("records", recordRepository.findAll());
  }
  
}
