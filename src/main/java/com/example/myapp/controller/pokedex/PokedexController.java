package com.example.myapp.controller.pokedex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.pokedex.GigantaMax;
import com.example.myapp.property.pokedex.MegaEvolution;
import com.example.myapp.property.pokedex.Pokedex;
import com.example.myapp.property.pokedex.PokedexBase;
import com.example.myapp.property.pokedex.status.Status;
import com.example.myapp.service.PokedexService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex")
@RestController
@RequiredArgsConstructor
@ComponentScan("com.example.myapp.property.pokedex")
@ComponentScan("com.example.myapp.service")
@PropertySource(
value = "classpath:pokedex/pokedex/pokedex.json"
)
public class PokedexController {
  private final PokedexService service;

  @Operation(summary = "pokedexの更新情報")
  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getinformation() {
    return service.getinformation();
  }

  @Operation(summary = "pokedex全件取得（更新情報含む）")
  @GetMapping("/all")
  @ResponseBody
  public PokedexBase all() {
    return service.getAll();
  }

  @Operation(summary = "pokedex全件取得")
  @GetMapping("/")
  @ResponseBody
  public List<Pokedex> getPokedex() {
    return service.getPokedex();
  }

  @Operation(summary = "メガシンカ一覧を取得")
  @GetMapping("/mega_evolution")
  @ResponseBody
  public List<MegaEvolution[]> mega_evolution_list() {
    return service.megaEvolutions();
  }

  @Operation(summary = "キョダイマックスの一覧取得")
  @GetMapping("/gigantamax")
  @ResponseBody
  public HashMap<String, GigantaMax[]> gigantaMaxs() {
    return service.gigantaMaxs();
  }

  @Operation(summary = "全国図鑑番号からポケモンのステータスを取得")
  @GetMapping("/status/{globalNo}")
  @ResponseBody
  public Status[] findStatusByGlobalNumber(@PathVariable int globalNo) {
    return service.findStatusByGlobalNumber(globalNo);
  }
}
