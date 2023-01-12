package com.example.myapp.property.pokedex.status;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;


@Getter
@ConfigurationProperties
@JsonIgnoreProperties(ignoreUnknown=true)
public class StatusBase {
  private String version;

  private int update;

  @JsonProperty("game_version")
  private String gameVersion;

  private LinkedHashMap<String, List<Pokedex>> pokedex;
}
