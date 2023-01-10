package com.example.myapp.property;

import com.example.myapp.repository.PropertyInterface;

import lombok.Getter;

@Getter
public class PokemonNameList implements PropertyInterface {
  private String jpn;
  private String eng;
  private String ger;
  private String fra;
  private String kor;
  private String chs;
  private String cht;
}
