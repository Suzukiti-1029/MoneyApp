package com.example.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.money.model.Record;
import com.example.money.service.RecordService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/record")
public class RecordController {
  private final RecordService recordService;

  @GetMapping({"", "/index"})
  public String getIndex(Model model) {
    recordService.getAllRecord(model);
    return "record/index";
  }

  @GetMapping("/add")
  public String getAdd(@ModelAttribute Record record) {
    return "record/add";
  }

  @PostMapping("/create")
  public String postCreate(@ModelAttribute Record record) {
    recordService.saveRecord(record);
    return "record/create";
  }

  @GetMapping("/edit/{id}")
  public String getEdit(@PathVariable Long id, Model model) {
    recordService.getOneRecord(id, model);
    return "record/edit";
  }

  @PostMapping("/update")
  public String postUpdate(@ModelAttribute Record record) {
    recordService.saveRecord(record);
    return "record/update";
  }

  @GetMapping("/delete/{id}")
  public String getDelete(@PathVariable Long id) {
    recordService.deleteOneRecord(id);
    return "record/delete";
  }
}
