package com.example.myapp.property;

import com.example.myapp.repository.PropertyInterface;

import lombok.Getter;

@Getter
public class MegaEvolution implements PropertyInterface {
  private MegaEvolutionNameList name;
  private String height;
  private String weight;
  
}
