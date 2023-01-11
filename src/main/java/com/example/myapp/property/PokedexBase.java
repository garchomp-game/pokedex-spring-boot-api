package com.example.myapp.property;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;


@Getter
@ConfigurationProperties
@JsonIgnoreProperties(ignoreUnknown=true)
@PropertySource(
value = "classpath:pokedex/pokedex/pokedex.json"
)
public class PokedexBase {
  private String version;

  private int update;

  private List<Pokedex> pokedex;
}
