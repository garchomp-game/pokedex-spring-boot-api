package com.example.myapp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.PokedexBase;
// import com.example.myapp.repository.PropertyInterface;
// import com.example.myapp.repository.PropertyMixin;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.myapp.property.MegaEvolution;
import com.example.myapp.property.MegaEvolutionNameList;
import com.example.myapp.property.Pokedex;


@RestController
public class PokedexController {
  private PokedexBase map;
  public PokedexController() throws IOException {

    File pokedexJsonBase = new ClassPathResource("pokedex/pokedex/pokedex.json")
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    // mapper.addMixIn(PropertyInterface.class, PropertyMixin.class);
    this.map = mapper.readValue(pokedexJsonBase, PokedexBase.class);
  }

  @GetMapping("/")
  @ResponseBody
  public String sayHello() {
    return map.getVersion();
  }

  @GetMapping("/mega_evolution")
  @ResponseBody
  public String mega_evolution_list() {
    List<Pokedex> pokedexList = map.getPokedex();
    Pokedex pokedex = pokedexList.get(5);
    MegaEvolution[] megaEvolution = pokedex.getMegaEvolution();
    MegaEvolutionNameList nameList = megaEvolution[0].getName();
    return nameList.getJpn();
  }
}
