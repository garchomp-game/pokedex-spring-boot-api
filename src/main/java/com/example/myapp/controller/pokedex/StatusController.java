package com.example.myapp.controller.pokedex;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.pokedex.status.PokemonStatus;
import com.example.myapp.property.pokedex.status.StatusBase;
import com.example.myapp.service.*;

import lombok.RequiredArgsConstructor;

@RequestMapping("/status")
@RestController
@RequiredArgsConstructor
public class StatusController {
  private final StatusService service;

  @GetMapping("/info/{generation}")
  @ResponseBody
  public LinkedHashMap<String, String> getinformation(@PathVariable String generation) {
    return service.getinformation(generation);
  }

  @GetMapping("/all/{generation}")
  @ResponseBody
  public StatusBase getStatus(@PathVariable String generation) {
    return service.getStatus(generation);
  }
  @GetMapping("/allContent/{generation}")
  @ResponseBody
  public LinkedHashMap<String, PokemonStatus[]> all(@PathVariable String generation) {
    return service.findAll(generation);
  }
}
