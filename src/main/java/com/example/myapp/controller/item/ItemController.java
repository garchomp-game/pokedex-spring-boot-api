package com.example.myapp.controller.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.item.Item;
import com.example.myapp.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
@ComponentScan("com.example.myapp.property.item")
@ComponentScan("com.example.myapp.service")
public class ItemController {
  @Autowired
  private final ItemService service;

  @GetMapping("/{name}")
  public Item getItems(@PathVariable String name) {
    return service.getItem(name);
  }
}
