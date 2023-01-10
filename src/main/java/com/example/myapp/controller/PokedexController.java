package com.example.myapp.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.PokedexBase;
// import com.example.myapp.repository.PropertyInterface;
// import com.example.myapp.repository.PropertyMixin;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class PokedexController {

  @GetMapping("/")
  @ResponseBody
  public String sayHello() throws IOException {
    File pokedexJsonBase = new ClassPathResource("pokedex/pokedex/pokedex.json")
    .getFile();
    ObjectMapper mapper = new ObjectMapper();
    // mapper.addMixIn(PropertyInterface.class, PropertyMixin.class);
    PokedexBase map = mapper.readValue(pokedexJsonBase, PokedexBase.class);
    return map.getVersion();
  }
}
