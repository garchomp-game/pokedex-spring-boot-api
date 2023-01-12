package com.example.myapp.controller.pokedex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.pokedex.GigantaMax;
import com.example.myapp.property.pokedex.MegaEvolution;
import com.example.myapp.property.pokedex.Pokedex;
import com.example.myapp.property.pokedex.PokedexBase;
import com.example.myapp.service.pokedex.PokedexService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex")
@RestController
@RequiredArgsConstructor
@PropertySource(
value = "classpath:pokedex/pokedex/pokedex.json"
)
public class PokedexController {
  private final PokedexService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getinformation() {
    return service.getinformation();
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
  public HashMap<String, GigantaMax[]> gigantaMaxs() {
    return service.gigantaMaxs();
  }
}
