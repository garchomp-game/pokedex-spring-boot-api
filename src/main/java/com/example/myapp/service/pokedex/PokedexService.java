package com.example.myapp.service.pokedex;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.pokedex.GigantaMax;
import com.example.myapp.property.pokedex.MegaEvolution;
import com.example.myapp.property.pokedex.Pokedex;
import com.example.myapp.property.pokedex.PokedexBase;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * PokedexService
 */
@Component
public class PokedexService {

  /**
   * jsonをモデルとして使えるようにするため
   * コンストラクタで準備をする。
   */
  private PokedexBase pokedexBase;
  public PokedexService() throws IOException {

    File pokedexJsonBase = new ClassPathResource("pokedex/pokedex/pokedex.json")
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    this.pokedexBase = mapper.readValue(pokedexJsonBase, PokedexBase.class);
  }

  /**
   * pokedexのインフォメーションを表示。
   */
  public LinkedHashMap<String, String> getInfomation() {
    LinkedHashMap<String, String> infomation = new LinkedHashMap<>();
    infomation.put("version", this.pokedexBase.getVersion());
    infomation.put("update", String.valueOf(this.pokedexBase.getUpdate()));
    return infomation;
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
  public List<GigantaMax[]> gigantaMaxs() {
    List<Pokedex> pokedexs = pokedexBase.getPokedex();
    List<GigantaMax[]> gigantaMaxList = new ArrayList<>();
    for(Pokedex pokedex : pokedexs) {
      Optional<GigantaMax[]> gigantaMaxs = Optional.ofNullable(pokedex.getGigantamax());
      gigantaMaxs.ifPresent(val -> {
        gigantaMaxList.add(val);
      });
    }
    return gigantaMaxList;
  }
}
