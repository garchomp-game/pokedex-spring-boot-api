package com.example.myapp.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.pokedex.GigantaMax;
import com.example.myapp.property.pokedex.MegaEvolution;
import com.example.myapp.property.pokedex.Pokedex;
import com.example.myapp.property.pokedex.PokedexBase;
import com.example.myapp.property.pokedex.status.PokemonStatus;
import com.example.myapp.property.pokedex.status.Status;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;



/**
 * PokedexService
 */
@Component
@Getter
public class PokedexService {

  private StatusService statusService;
  private final ConvertService convertService;
  /**
   * jsonをモデルとして使えるようにするため
   * コンストラクタで準備をする。
   */
  private PokedexBase pokedexBase;
  public PokedexService(
    StatusService statusService,
    ConvertService convertService
  ) throws IOException {
      ObjectMapper mapper = new ObjectMapper();
      String path = "static/pokedex/pokedex/pokedex.json";
        InputStream pokedexJsonBase;
        pokedexJsonBase = new ClassPathResource(path)
        .getInputStream();
        this.pokedexBase = mapper.readValue(pokedexJsonBase, PokedexBase.class);
      this.statusService = statusService;
      this.convertService = convertService;
    }

  /**
   * pokedexのインフォメーションを表示。
   */
  public LinkedHashMap<String, String> getinformation() {
    LinkedHashMap<String, String> information = new LinkedHashMap<>();
    information.put("version", this.pokedexBase.getVersion());
    information.put("update", String.valueOf(this.pokedexBase.getUpdate()));
    return information;
  }

  /**
   * 全件取得
   */
  public PokedexBase getAll() {
    return this.pokedexBase;
  }


  /**
   * pokedexの部分のみ取得
   */
  public List<Pokedex> getPokedex() {
    return this.pokedexBase.getPokedex();
  }

  /**
   * メガシンカの部分のみ取得
   */
  public List<MegaEvolution[]> megaEvolutions() {
    List<Pokedex> pokedexList = pokedexBase.getPokedex();
    List<MegaEvolution[]> megaEvolutionList = new ArrayList<>();

    for(Pokedex pokedex : pokedexList) {
      Optional<MegaEvolution[]> megaEvolutions = Optional
      .ofNullable(pokedex.getMegaEvolution());

      megaEvolutions.ifPresent(val -> {
        megaEvolutionList.add(val);
      });
    }
    return megaEvolutionList;
  }

  /**
   * キョダイマックスのみ取得
   */
  public LinkedHashMap<String, GigantaMax[]> gigantaMaxs() {
    List<Pokedex> pokedexs = pokedexBase.getPokedex();
    LinkedHashMap<String, GigantaMax[]> gigantaMaxList = new LinkedHashMap<>();

    for(Pokedex pokedex : pokedexs) {
      if (pokedex.getGigantamax() != null) {
        gigantaMaxList.put(String.valueOf(pokedex.getId()), pokedex.getGigantamax());
      }
    }
    return gigantaMaxList;
  }

  public Status[] findStatusByGlobalNumber(int globalNo) {
    String table = this.convertService.getTable(globalNo);
    Collection<PokemonStatus[]> statusList = this
    .statusService.getPokemonStatusList(table, globalNo);
    Status[] pokemonStatusList = null;
    for(PokemonStatus[] pokemonStatus : statusList) {
      for(PokemonStatus status : pokemonStatus) {
        if (status.getGlobalNo() == globalNo) {
          pokemonStatusList = status.getStatus();
          return pokemonStatusList;
        }
      }
    }
    return pokemonStatusList;
  }
}
