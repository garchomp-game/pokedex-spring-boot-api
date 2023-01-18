package com.example.myapp.controller.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.property.item.Item;
import com.example.myapp.service.ItemService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
@ComponentScan("com.example.myapp.property.item")
@ComponentScan("com.example.myapp.service")
public class ItemController {
  @Autowired
  private final ItemService service;

  @Operation(summary = "アイテムファイル名をもとにアイテムを取得")
  @GetMapping("/{name}")
  public Item getItems(
    @Parameter(
    required = true,
    description = "引数は次の６つの中から使用してください。[" +
    "item, " +
    "item_ball, " +
    "item_battle, " +
    "item_imprttant, " +
    "item_mail, " +
    "item_recovery" +
    "]"
  )
    @PathVariable String name
  ) {
    return service.getItem(name);
  }
}
