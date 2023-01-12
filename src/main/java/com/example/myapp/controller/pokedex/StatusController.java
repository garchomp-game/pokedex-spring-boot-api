package com.example.myapp.controller.pokedex;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.pokedex.status.StatusBase;
import com.example.myapp.service.pokedex.*;

import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex/{generation}")
@RestController
@RequiredArgsConstructor
public class StatusController {
  private final StatusService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getinformation(@PathVariable String generation) {
    return service.getinformation(generation);
  }

  @GetMapping("/")
  @ResponseBody
  public StatusBase findAll(@PathVariable String generation) {
    return service.findAll(generation);
  }
}