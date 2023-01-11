package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.*;
import com.example.myapp.service.PokedexService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PokedexController {
  private final PokedexService service;

  @GetMapping("/")
  @ResponseBody
  public String getVersion() {
    return service.getVersion();
  }

  @GetMapping("/mega_evolution")
  @ResponseBody
  public MegaEvolution[] mega_evolution_list() {
    return service.megaEvolutions();
  }
}
