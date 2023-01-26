package com.example.myapp.controller.pokedex;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.pokedex.status.PokemonStatus;
import com.example.myapp.property.pokedex.status.StatusBase;
import com.example.myapp.service.*;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RequestMapping("/status")
@RestController
@RequiredArgsConstructor
public class StatusController {
  private final StatusService service;

  @Operation(summary = "世代別のファイルの更新情報")
  @GetMapping("/info/{generation}")
  @ResponseBody
  public LinkedHashMap<String, String> getinformation(@PathVariable String generation) {
    return service.getinformation(generation);
  }

  @Operation(summary = "世代別のファイル内の情報全取得")
  @GetMapping("/all/{generation}")
  @ResponseBody
  public StatusBase getStatus(@PathVariable String generation) {
    return service.getStatus(generation);
  }

  @Operation(summary = "世代別のファイル内の情報全取得（更新情報は除く)")
  @GetMapping("/allContent/{generation}")
  @ResponseBody
  public LinkedHashMap<String, PokemonStatus[]> all(@PathVariable String generation) {
    return service.findAll(generation);
  }
}
