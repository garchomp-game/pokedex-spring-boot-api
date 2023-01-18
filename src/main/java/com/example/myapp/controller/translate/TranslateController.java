package com.example.myapp.controller.translate;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.translate.Translate;
import com.example.myapp.service.TranslateService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RequestMapping("/translate")
@RestController
@RequiredArgsConstructor
@ComponentScan("com.example.myapp.property.translate")
@ComponentScan("com.example.myapp.service")
public class TranslateController {
  private final TranslateService service;

  @Operation(summary = "日本語/英語変換ファイルの更新情報")
  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getInfo() {
    return service.getInfo();
  }
  
  @Operation(summary = "日本語/英語変換ファイルの中身")
  @GetMapping("/translate_list")
  @ResponseBody
  public List<Translate> getTranslate() {
    return service.getTranslate();
  }
}
