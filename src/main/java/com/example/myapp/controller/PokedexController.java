package com.example.myapp.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.GigantaMax;
import com.example.myapp.property.MegaEvolution;
import com.example.myapp.property.Pokedex;
import com.example.myapp.property.PokedexBase;
import com.example.myapp.service.PokedexService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex")
@RestController
@RequiredArgsConstructor
public class PokedexController {
  private final PokedexService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getInfomation() {
    return service.getInfomation();
  }

  @GetMapping("/all")
  @ResponseBody
  public PokedexBase all() {
    return service.getAll();
  }

  @GetMapping("/")
  @ResponseBody
  public List<Pokedex> getPokedex() {
    return service.getPokedex();
  }

  @GetMapping("/mega_evolution")
  @ResponseBody
  public List<MegaEvolution[]> mega_evolution_list() {
    return service.megaEvolutions();
  }

  @GetMapping("/gigantamax")
  @ResponseBody
  public List<GigantaMax[]> gigantaMaxs() {
    return service.gigantaMaxs();
  }
}
