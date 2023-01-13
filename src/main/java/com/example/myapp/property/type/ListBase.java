package com.example.myapp.property.type;

import java.util.List;

import lombok.Getter;

@Getter
public class ListBase {
  private String version;
  private String update;
  private List<String> type;
}
