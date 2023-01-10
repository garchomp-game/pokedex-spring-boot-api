package com.example.myapp.repository;

import com.example.myapp.property.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME)
@JsonSubTypes({
@Type(name = "base", value = PokedexBase.class),
@Type(name = "pokedex", value = Pokedex.class),
@Type(name = "gigantamax", value = GigantaMax.class),
@Type(name = "gigantmax_namelist", value = GigantaMaxNameList.class),
@Type(name = "mega_evolution", value = MegaEvolution.class),
@Type(name = "mega_evolution_namelist", value = MegaEvolutionNameList.class),
@Type(name = "pokemon_name_list", value = PokemonNameList.class)
    })
public abstract class PropertyMixin {}
