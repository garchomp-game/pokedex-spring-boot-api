package com.example.myapp.property;

import com.example.myapp.repository.PropertyInterface;

import lombok.Getter;

@Getter
public class GigantaMax implements PropertyInterface {
  private GigantaMaxNameList name;
  private String height;
  private String weight;
}
