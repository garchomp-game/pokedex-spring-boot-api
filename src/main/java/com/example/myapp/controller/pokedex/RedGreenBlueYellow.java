package com.example.myapp.controller.pokedex;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.service.pokedex.*;

import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex/red_green_blue_yellow")
@RestController
@RequiredArgsConstructor
public class RedGreenBlueYellow {
  private final PokedexService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getInfomation() {
    return service.getInfomation();
  }
}
