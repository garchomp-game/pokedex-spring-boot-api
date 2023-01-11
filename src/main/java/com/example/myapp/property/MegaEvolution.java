package com.example.myapp.property;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class MegaEvolution {
  @JsonProperty("name")
  private MegaEvolutionNameList nameList;
  private String height;
  private String weight;
  
}
