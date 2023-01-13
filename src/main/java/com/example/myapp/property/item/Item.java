package com.example.myapp.property.item;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Item {
  private List<ItemName> item;
  private List<ItemName> item_ball;
  private List<ItemName> item_battle;
  private List<ItemName> item_important;
  private List<ItemName> item_recovery;
}

@Getter
class ItemName {
  private String name;
}
