package com.example.myapp.property.pokedex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
// import jakarta.persistence.OneToMany;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Pokedex {
  // @OneToMany(mappedBy = "like_pokemon")
  private int id;

  private PokemonNameList name;
  
  @JsonProperty("classinfication")
  private String classInfication;

  private double height;

  private double weight;

  @JsonProperty("mega_evolution")
  private MegaEvolution[] megaEvolution;

  private GigantaMax[] gigantamax;
}
