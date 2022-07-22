package com.example.money.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class RecordController {
  @GetMapping({"", "/index"})
  public String getIndex() {
    return "record/index";
  }

  @GetMapping("/add")
  public String getAdd() {
    return "record/add";
  }

  @PostMapping("/create")
  public String postCreate() {
    return "record/create";
  }

  @GetMapping("/edit")
  public String getEdit() {
    return "record/edit";
  }

  @PostMapping("/update")
  public String postUpdate() {
    return "record/update";
  }

  @GetMapping("/delete")
  public String getDelete() {
    return "record/delete";
  }
}
