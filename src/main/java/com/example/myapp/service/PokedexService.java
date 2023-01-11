package com.example.myapp.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

  public MegaEvolution[] megaEvolutions() {
    List<Pokedex> pokedexList = pokedexBase.getPokedex();
    Pokedex pokedex = pokedexList.get(5);
    MegaEvolution[] megaEvolution = pokedex.getMegaEvolution();
    return megaEvolution;
  }
}
