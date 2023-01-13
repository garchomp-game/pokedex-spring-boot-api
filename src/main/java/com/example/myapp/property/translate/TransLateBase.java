package com.example.myapp.property.translate;

import java.util.List;

import lombok.Getter;

@Getter
public class TransLateBase {
  private String version;
  private int update;
  private List<Translate> translate;
}
