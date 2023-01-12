package com.example.myapp.controller.pokedex;

import java.util.LinkedHashMap;

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.service.pokedex.*;

import lombok.RequiredArgsConstructor;

@RequestMapping("/pokedex/red_green_blue_yellow")
@RestController
@RequiredArgsConstructor
@PropertySource(
value = "classpath:pokedex/pokedex/Red_Green_Blue_Yellow/Red_Green_Blue_Yellow.json"
)
public class RedGreenBlueYellowController {
  private final RedGreenBlueYellowService service;

  @GetMapping("/info")
  @ResponseBody
  public LinkedHashMap<String, String> getinformation() {
    return service.getinformation();
  }
}
