package com.example.myapp.service.pokedex;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.pokedex.status.StatusBase;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class RedGreenBlueYellowService {
  private StatusBase statusBase;
  public RedGreenBlueYellowService() throws IOException {
    String path = "pokedex/pokedex/Red_Green_Blue_Yellow/Red_Green_Blue_Yellow.json";
    File statusJsonBase = new ClassPathResource(path)
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    this.statusBase = mapper.readValue(statusJsonBase, StatusBase.class);
  }

  public LinkedHashMap<String, String> getinformation() {
    LinkedHashMap<String, String> information = new LinkedHashMap<>();
    information.put("version", this.statusBase.getVersion());
    information.put("update", String.valueOf(this.statusBase.getUpdate()));
    information.put("game_version", String.valueOf(this.statusBase.getGameVersion()));
    return information;
  }
}
