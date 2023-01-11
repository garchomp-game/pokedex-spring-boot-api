package com.example.myapp.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.MegaEvolution;
import com.example.myapp.property.Pokedex;
import com.example.myapp.property.PokedexBase;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class PokedexService {
  private PokedexBase pokedexBase;
  public PokedexService() throws IOException {

    File pokedexJsonBase = new ClassPathResource("pokedex/pokedex/pokedex.json")
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    this.pokedexBase = mapper.readValue(pokedexJsonBase, PokedexBase.class);
  }

  public String getVersion() {
    return this.pokedexBase.getVersion();
  }

  public List<Pokedex> getPokedex() {
    return this.pokedexBase.getPokedex();
  }

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
}
