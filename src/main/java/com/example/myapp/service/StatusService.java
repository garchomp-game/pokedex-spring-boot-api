package com.example.myapp.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.pokedex.status.PokemonStatus;
import com.example.myapp.property.pokedex.status.StatusBase;
import com.example.myapp.ui.StatusJsonFiles;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Component
@Getter
public class StatusService {
  private Map<String, StatusBase> statusBase;

  public StatusService() {
    try {
      this.statusBase = new HashMap<>();
      for(StatusJsonFiles val : StatusJsonFiles.values()) {
        StringBuilder path = new StringBuilder();
        path.append("static/pokedex/pokedex/");
        path.append(val.toString());
        path.append("/");
        path.append(val.toString());
        path.append(".json");
        ObjectMapper mapper = new ObjectMapper();
        InputStream statusJsonBase = new ClassPathResource(path.toString())
        .getInputStream();
        this.statusBase.put(
          val.toString(),
          mapper.readValue(statusJsonBase, StatusBase.class)
        );
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public LinkedHashMap<String, String> getinformation(String generation) {
    StatusBase statusBase = this.getStatusBase(generation);
    LinkedHashMap<String, String> information = new LinkedHashMap<>();
    information.put("version", statusBase.getVersion());
    information.put("update", String.valueOf(statusBase.getUpdate()));
    information.put("game_version", String.valueOf(statusBase.getGameVersion()));
    return information;
  }

  public StatusBase getStatus(String generation) {
    StatusBase statusBase = this.getStatusBase(generation);
    return statusBase;
  }

  public LinkedHashMap<String, PokemonStatus[]> findAll(String generation) {
    StatusBase statusBase = this.getStatusBase(generation);
    return statusBase.getPokedex();
  }

  public Collection<PokemonStatus[]> getPokemonStatusList(
    String generation,
    int globalNo
  ) {
    StatusBase statusBase = this.getStatusBase(generation);
    Collection<PokemonStatus[]> statusList = statusBase
    .getPokedex().values();
    return statusList;
  }

  private StatusBase getStatusBase(String generation) {
    return this.statusBase.get(generation); 
  }
}
