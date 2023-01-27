package com.example.myapp.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.example.myapp.property.item.Item;
import com.example.myapp.ui.ItemFiles;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

@Component
@Getter
public class ItemService {
  private LinkedHashMap<String, Item> items;

  public ItemService() throws IOException {
    this.items = new LinkedHashMap<>();
    for(ItemFiles item : ItemFiles.values()) {
      ObjectMapper mapper = new ObjectMapper();
      StringBuilder sb = new StringBuilder();
      sb.append("static/pokedex/item/");
      sb.append(item.toString());
      sb.append(".json");
        InputStream itemJson = new ClassPathResource(sb.toString())
        .getInputStream();
        this.items.put(item.toString(), mapper.readValue(itemJson, Item.class));
    }
  }
  public Item getItem(String name) {
    return items.get(name);
  }
}
