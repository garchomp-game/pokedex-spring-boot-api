package com.example.myapp.property.pokedex;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;


@Getter
@ConfigurationProperties
@JsonIgnoreProperties(ignoreUnknown=true)
public class PokedexBase {
  private String version;

  private int update;

  private List<Pokedex> pokedex;
}
