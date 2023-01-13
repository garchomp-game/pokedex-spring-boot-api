package com.example.myapp.controller.translate;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.translate.Translate;
import com.example.myapp.service.TranslateService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/translate")
@RestController
@RequiredArgsConstructor
public class TranslateController {
  private final TranslateService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getInfo() {
    return service.getInfo();
  }
  
  @GetMapping("/translate_list")
  @ResponseBody
  public List<Translate> getTranslate() {
    return service.getTranslate();
  }
}
