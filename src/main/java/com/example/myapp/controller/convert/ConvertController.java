package com.example.myapp.controller.convert;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.service.ConvertService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RequestMapping("/convert")
@RestController
@RequiredArgsConstructor
@ComponentScan("com.example.myapp.service")
public class ConvertController {
  private final ConvertService service;

  @Operation(summary = "世代別のステータスファイル名の取得")
  @GetMapping("/")
  @ResponseBody
  public List<String> getTableName() {
    return service.getTableList();
  }
}
