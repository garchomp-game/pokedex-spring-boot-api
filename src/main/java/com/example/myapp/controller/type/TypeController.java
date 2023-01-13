package com.example.myapp.controller.type;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.type.TypeList;
import com.example.myapp.service.TypeService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/type")
@RestController
@RequiredArgsConstructor
public class TypeController {
  private final TypeService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getInfo() {
    return service.getInfo();
  }

  @GetMapping("/all")
  @ResponseBody
  public LinkedHashMap<String, TypeList> getTypeList() {
    return service.getTypeList();
  }

  @GetMapping("/list")
  @ResponseBody
  public List<String> getType() {
    return service.getType();
  }

  @GetMapping("/listInfo")
  @ResponseBody
  public LinkedHashMap<String, String> getListInfo() {
    return service.getListInfo();
  }
}
