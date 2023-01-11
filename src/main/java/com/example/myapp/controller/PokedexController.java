package com.example.myapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.MegaEvolution;
import com.example.myapp.property.Pokedex;
import com.example.myapp.service.PokedexService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex")
@RestController
@RequiredArgsConstructor
public class PokedexController {
  private final PokedexService service;

  @GetMapping("/")
  @ResponseBody
  public String getVersion() {
    return service.getVersion();
  }

  @GetMapping("/get_pokedex_list")
  @ResponseBody
  public List<Pokedex> getPokedex() {
    return service.getPokedex();
  }

  @GetMapping("/mega_evolution")
  @ResponseBody
  public List<MegaEvolution[]> mega_evolution_list() {
    return service.megaEvolutions();
  }
}
