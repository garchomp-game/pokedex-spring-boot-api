package com.example.myapp.property.convert;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class Convert {
  private String version;
  private int update;

  @JsonProperty("local_global_id_converter")
  private HashMap<Integer, ConverterItem> localGlobalIdConverter;
}
