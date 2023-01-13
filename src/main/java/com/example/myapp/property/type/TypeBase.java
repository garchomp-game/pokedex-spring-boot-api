package com.example.myapp.property.type;

import java.util.LinkedHashMap;

import lombok.Getter;

@Getter
public class TypeBase {
  private String version;
  private String update;
  private LinkedHashMap<String, TypeList> type;
}
