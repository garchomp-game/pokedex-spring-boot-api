package com.example.myapp.controller.type;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.type.TypeList;
import com.example.myapp.service.TypeService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RequestMapping("/type")
@RestController
@RequiredArgsConstructor
@ComponentScan("com.example.myapp.property.type")
@ComponentScan("com.example.myapp.service")
public class TypeController {
  private final TypeService service;

  @Operation(summary = "タイプの更新情報取得")
  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getInfo() {
    return service.getInfo();
  }

  @Operation(summary = "タイプの相性中身")
  @GetMapping("/all")
  @ResponseBody
  public LinkedHashMap<String, TypeList> getTypeList() {
    return service.getTypeList();
  }

  @Operation(summary = "タイプ一覧")
  @GetMapping("/list")
  @ResponseBody
  public List<String> getType() {
    return service.getType();
  }

  @Operation(summary = "タイプリストの更新情報取得")
  @GetMapping("/listInfo")
  @ResponseBody
  public LinkedHashMap<String, String> getListInfo() {
    return service.getListInfo();
  }
}
