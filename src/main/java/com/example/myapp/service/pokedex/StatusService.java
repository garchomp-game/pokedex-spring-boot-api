package com.example.myapp.service.pokedex;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.pokedex.status.StatusBase;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class StatusService {
  private StatusBase statusBase;

  public LinkedHashMap<String, String> getinformation(String generation) {
    this.makeMapper(generation);  
    LinkedHashMap<String, String> information = new LinkedHashMap<>();
    information.put("version", this.statusBase.getVersion());
    information.put("update", String.valueOf(this.statusBase.getUpdate()));
    information.put("game_version", String.valueOf(this.statusBase.getGameVersion()));
    return information;
  }

  public StatusBase findAll(String generation) {
    this.makeMapper(generation);
    return statusBase;
  }

  private void makeMapper(String generation) {
    try {
      String path = "pokedex/pokedex/" + generation + "/" + generation + ".json";
      File statusJsonBase = new ClassPathResource(path)
      .getFile();
      ObjectMapper mapper = new ObjectMapper();
      this.statusBase = mapper.readValue(statusJsonBase, StatusBase.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
