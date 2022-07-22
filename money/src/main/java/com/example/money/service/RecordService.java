package com.example.money.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.money.model.Record;
import com.example.money.repository.RecordRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecordService {
  private final RecordRepository recordRepository;

  public void getAllRecord(Model model) {
    model.addAttribute("records", recordRepository.findAll());
  }

  public void insertNewRecord(@ModelAttribute Record record) {
    recordRepository.save(record);
  }

  public void getOneRecord(Long id, Model model) {
    model.addAttribute("record", recordRepository.findById(id));
  }
}
