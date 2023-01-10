package com.example.myapp.property;


import com.example.myapp.repository.PropertyInterface;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// import jakarta.persistence.OneToMany;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Pokedex implements PropertyInterface {
  // @OneToMany(mappedBy = "like_pokemon")
  private int id;

  private PokemonNameList name;
  
  @JsonProperty("classinfication")
  private String classInfication;

  private double height;

  private double weight;

  // @JsonProperty("mega_evolution")
  // private MegaEvolution megaEvolution;
  // 
  // private GigantaMax gigantamax;

}
