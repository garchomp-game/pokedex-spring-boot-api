package com.example.myapp.property.type;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class TypeList {
  @JsonProperty("ノーマル")
  private double normal;
  @JsonProperty("ほのお")
  private double fire;
  @JsonProperty("みず")
  private double water;
  @JsonProperty("でんき")
  private double electric;
  @JsonProperty("くさ")
  private double grass;
  @JsonProperty("こおり")
  private double ice;
  @JsonProperty("かくとう")
  private double fighting;
  @JsonProperty("どく")
  private double poison;
  @JsonProperty("じめん")
  private double ground;
  @JsonProperty("ひこう")
  private double flying;
  @JsonProperty("エスパー")
  private double psychic;
  @JsonProperty("むし")
  private double bug;
  @JsonProperty("いわ")
  private double rock;
  @JsonProperty("ゴースト")
  private double ghost;
  @JsonProperty("ドラゴン")
  private double dragon;
  @JsonProperty("あく")
  private double dark;
  @JsonProperty("はがね")
  private double steel;
  @JsonProperty("フェアリー")
  private double fairy;
}
